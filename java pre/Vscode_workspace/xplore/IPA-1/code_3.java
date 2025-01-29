// OOps
// good pratice for private project 1 public with main and all other private class
// good pratice for public api is all class public So one java file will have 1 public class bec of visibility 

class Person {

    private String name;
// Getter
    public String Get_name(){
        return name;
    }

    // Setter
    public void Set_name(String name){
        this.name = name;
    }

    
}
// thats why we make package to organzie things to avoid name conflict code_1 class is there in code_1 java file and here as well compiler will update code_1 class of code_1 java file
// class code_1{
    class car{
  private  int id_car;
    private String Brand_name;

     car(int id_car,String Brand_name){
     this.id_car = id_car;
     this.Brand_name = Brand_name;
    }
    void display_info(){
        System.out.println("car id is "+id_car+"\nmodel of car is "+Brand_name );// use this if parameter is of same name
    }


}



public class code_3 {
    public static void main(String[] args) {
        car baleno = new car(1,"Suzuki");// no one can change baleno info

        //car baleno = new car(0, null); not possbile one time assign

    //    baleno.id_car  = 23232; not possible

        baleno.display_info();
    }
}
