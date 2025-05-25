package mock_revision.code1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.nextLine());
    // int n = Integer.parseInt(sc.nextLine());
    List<Movies> l = new ArrayList<>();
    for (int i = 0; i < n; i++) {
        int mid = Integer.parseInt(sc.nextLine());
        String mName = sc.nextLine();
        int mRate = Integer.parseInt(sc.nextLine());
        int noActors = Integer.parseInt(sc.nextLine());
        List<String> a = new ArrayList<>();
        // int n2 = Integer.parseInt(sc.nextLine());

        for (int j = 0; j < noActors; j++) {
            a.add(sc.nextLine());
        }
        Movies m = new Movies(mid, mName, mRate, noActors, a);
        l.add(m);
    }
    String s1 = sc.nextLine();
    String s2 = sc.nextLine();
    Service s = new Service();
    s.findMovie(l, s1);
    s.avgM(l, s2);
}
}
class Service {

    public void findMovie(List<Movies> l, String actorName){
        boolean found = false;
        for (Movies movies : l) {
            for (String movies2 : movies.a) {
                found = true;
                if (movies2.equals(actorName)) {
                System.out.println(movies.mId);
                System.out.println(movies.mName);
                System.out.println(movies.mRate);
                }
            }
        }
        if (!found) {
            System.out.println("No Movies Found");
        }
    }

    public void avgM(List<Movies> l, String actorname){
        double avg = 0;
        int count = 0;
        boolean found = false;
        for (Movies movies : l) {
            for (String movies2 : movies.a) {
                if (movies2.equals(actorname)) {
                    found = true;
                    avg += movies.mRate;
                    count++;
                }
            }
        }
        if (!found) {
            System.out.println("No Actor Found");

        }else{
            System.out.println("Average Rating for the actor is: " + avg / count);
        }
    }
    
}

class Movies {
int mId;
String mName;
int mRate;
int noActors;
List<String> a;

Movies (
int mId,
String mName,
int mRate,
int noActors,
List<String> a)
{
this.mId = mId;
this.mName = mName;
this.mRate = mRate;
this.noActors = noActors;
this.a = a;
}

    
}