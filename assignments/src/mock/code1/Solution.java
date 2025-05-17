package code1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
     List<Movies> l = new ArrayList<>();
    int n = sc.nextInt();
    for (int i = 0; i < n; i++) {
        int mid = sc.nextInt();
        sc.nextLine();
        String mName = sc.nextLine();
        int mRate = sc.nextInt();
        int noact = sc.nextInt();
        List<String> a = new ArrayList<>();
        sc.nextLine();
        for (int j = 0; j < noact; j++) {
            String actors = sc.nextLine();
            a.add(actors);
        }

        Movies l2 = new Movies(mid, mName, mRate, noact, a);
        l.add(l2);
    }
    String searchact1 = sc.next();
    String searchact2 = sc.next();
    Service s = new Service();

    s.findListMovie(l, searchact1);

    try {
    double d = s.mrating(l, searchact2);
    System.out.printf("Average Rating for the actor is: %.1f" , d);

    System.out.println();
        
    } catch (NoAct e) {
        System.out.println(e.getMessage());
    }
    sc.close();
}

}

class Service {

    void findListMovie(List<Movies> l, String actName){
        List<Movies> l2 = new ArrayList<>();

        boolean found = false;

        for (Movies movies : l) {
            for (String movies2 : movies.a) {
                if (movies2.equals(actName)) {
                    l2.add(movies);
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.println("No Movies Found");
        }else{
            for (Movies movies : l2) {
                System.out.println(movies.mid);
                System.out.println(movies.mName);
                System.out.println(movies.Mrate);
            
            }
        }
        // return l2;
    }

    double mrating(List<Movies> movies,String actorName) throws NoAct{
        double avg = 0;
        int count = 0;
         boolean found = false;
        for (Movies movies2 : movies) {
            for (String movies3 : movies2.a) {
                if (movies3.equals(actorName)) {
                    avg += movies2.Mrate;
                    count++;
                    found = true;
                }
            }
        }
        if (!found) {
            throw new NoAct("No Actor Found");
        }
        System.out.println("hello");
        
        return (double)avg/count;
    }
}

 class NoAct extends Exception {

    public NoAct(String message){
        super(message);
    }
    
}
class Movies {
    int mid ;
    String mName;
    int Mrate;
    int noOfActors;
    List<String> a;



Movies (
    int mid ,
    String mName,
    int Mrate,
    int noOfActors,
    List<String> a
){
    this.mid = mid;
this.mName = mName;
this.Mrate = Mrate;
this.a = a;
}
}
