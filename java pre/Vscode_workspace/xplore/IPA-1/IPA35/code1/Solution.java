package IPA35.code1;

import java.util.Scanner;

class Projector {
    private int Projectorid;
    private String Projectorname;
    private int Prize;
    private int rating;
    private String availableIn;

    public void set_Projectorid(int Projectorid) {
        this.Projectorid = Projectorid;
    }

    public void set_Projectorname(String Projectorname) {
        this.Projectorname = Projectorname;
    }

    public void set_Prize(int Prize) {
        this.Prize = Prize;
    }

    public void set_rating(int rating) {
        this.rating = rating;
    }

    public void set_av(String availableIn) {
        this.availableIn = availableIn;
    }

    public int getter_Projectorid(){
        return Projectorid;
    }

    public String getter_Projectorname() {
        return Projectorname;
    }

    public int getter_Prize() {
        return Prize;
    }

    public int getter_rating() {
        return rating;
    }

    public String get_av() {
        return availableIn;
    }

  public  Projector( int Projectorid,
       String Projectorname,
      int Prize,      int rating,String availableIn ){
        this.Projectorid = Projectorid;
        this.Projectorname = Projectorname;
        this.Prize = Prize;
        this.rating = rating;
        this.availableIn = availableIn;
      }
}

    public class Solution {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Projector proj[] = new Projector[4];

    for (int i = 0; i < proj.length; i++) {
         int Projectorid = sc.nextInt();
         sc.nextInt();
         String Projectorname = sc.nextLine();
         int Prize= sc.nextInt();
         int rating= sc.nextInt();
         sc.nextInt();
         String availableIn= sc.nextLine();

        proj[i] = new Projector(Projectorid,Projectorname,Prize,rating,availableIn);

        
        
    }
    int req_rating = sc.nextInt();
    
    
    Projector min_Projector = findmaxprize(proj,req_rating);
    if (min_Projector != null) {

        System.out.println(min_Projector.getter_Prize());
    }
    else{
        System.out.println("no such projector");
    }
    
    sc.close();

   }

   public static Projector findmaxprize(Projector proj[],int req_rating ){
   Projector projector = null;

   int max_prize = 0;
for (int i = 0; i < proj.length; i++) {
    if ((proj[i].getter_Prize() > max_prize) && (proj[i].getter_rating()>req_rating) && (proj[i].get_av().equalsIgnoreCase("tatacliq")) ) {
        max_prize = proj[i].getter_Prize();
        projector = proj[i];// i got latest best max prize note it can change in next search  (loop traversing) if we found new max 
     
    }
    
}

    return projector;//need to send one only // final projector that rating is > then given rating and with max prize
   }

}