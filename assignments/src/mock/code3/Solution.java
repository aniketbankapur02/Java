package code3;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc = new Scanner(System.in);
        List<MusicApp> l = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int mid = sc.nextInt();
            sc.nextLine();
            String mName = sc.nextLine();
            int mSub = sc.nextInt();
            List<Song> s = new ArrayList<>();
            int nSong = sc.nextInt();
            for (int j = 0; j < nSong; j++) {
            int sid = sc.nextInt();
            sc.nextLine();
            String songName = sc.nextLine();
            String singerName = sc.nextLine();
            int views = sc.nextInt();
            sc.nextLine();
            Song s2 = new Song(sid, songName, singerName, views);
            s.add(s2);
            }
            MusicApp m = new MusicApp(mid, mName, mSub, s);
            l.add(m);
        }
        String singername = sc.nextLine();
        String songName = sc.nextLine();
        
        Service s = new Service();
        s.calAvgViews(l, singername);
        s.findMusicApp(l, songName);
    }
}
/**
 * file
 */
class Service {
    void calAvgViews(List<MusicApp> l,String singername){
        int avg = 0;
        int count = 0;
        boolean check = false;
        for (MusicApp musicApp : l) {
            for (Song s : musicApp.s) {
                if (s.views < 0) {
                    System.out.println("Invalid SongsView: SongViews cannot be negative.");
                    return;
                }
                if (s.singerName.equals(singername)) {
                    avg += s.views;
                    count++;
                    check = true;
                }
            }
        }
            if (!check) {
                System.out.println("No Song found with mentioned singerName.");
            }else{
                System.out.println(avg/count);
            }
    }
    void findMusicApp(List<MusicApp> l,String songName){
        boolean found = false;
        for (MusicApp musicApp : l) {
            for (Song musicApp2 : musicApp.s) {
                if (musicApp2.songName.equals(songName)) {
                    System.out.println(musicApp.appName);
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.println("No matching musicApp found.");
        }
    }
    
}

/**
 * file
 */
 class MusicApp {
int appID;
String appName;
int appSub;
List<Song> s;

MusicApp (
int appID,
String appName,
int appSub,
List<Song> s    
)    {
this.appID = appID;
this.appName = appName;
this.appSub = appSub;
this.s = s; 
}


}
 class Song {
int songID;
String songName;
String singerName;
int views;

Song (
int songID,
String songName,
String singerName,
int views    
)    {
this.songID = songID;
this.songName = songName;
this.singerName = singerName;
this.views = views; 
}


} 
