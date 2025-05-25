package mock_revision.code3;

import java.util.*;

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

class Service {

    public void calAvgViews(List<MusicApp> l,String s){
        int avg = 0;
        int count = 0;
        boolean c = false;
        
        for (MusicApp musicApp : l) {
            for (Song musicApp2 : musicApp.l) {
                if (musicApp2.views < 0) {
                    System.out.println("invalid Song views");
                    return;
                }
                if (musicApp2.singerName.equals(s)) {
                    avg += musicApp2.views;
                    count++;
                    c = true;
                }
            }
        }
        if (!c) {
            System.out.println("No Song");
        }else{
            System.out.println(avg/count);
        }
    }
    
    public void findMusicApp(List<MusicApp> l,String s){
        int avg = 0;
        int count = 0;
        boolean c = true;
        
        for (MusicApp musicApp : l) {
            for (Song musicApp2 : musicApp.l) {
                if (musicApp2.songName.equals(s)) {
                    c = false;
                    System.out.println(musicApp.appName);
                }
            }
        }
        if (c) {
            System.out.println("No app");
        }
    }

    
}
class MusicApp {

    int appId;
    String appName;
    int appSub;
    List<Song> l;
    
    MusicApp (
        int appId,
        String appName,
        int appSub,
        List<Song> l){
this.appId = appId;
this.appName = appName;
this.appSub = appSub;
this.l = l;
        }
    
}

class Song {
int songId;
String songName;
String singerName;
int views;

Song (
int songId,
String singerName,
String songName,
int views){
this.songId = songId;
this.songName = songName;
this.singerName = singerName;
this.views = views;
}
    
}