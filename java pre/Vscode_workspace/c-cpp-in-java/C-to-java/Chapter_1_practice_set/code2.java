package Chapter_1_practice_set;

class tool{
int a;


    static void add(int a,int b){
        int sum  = a + b;
        System.out.println(sum);
        code2.sub(1,2 );
        
    }

}


public class code2 {
  //obj.a = 1; you make here template so it wont work
  

    static void sub(int a,int b){
      int sub  = a - b;
      System.out.println(sub);

      // obj.a = 2; access control will allow only using of template.The declared local refernce varibale cannot be accessed due to scope concept so it is not possible
      //c = 3;
    }


  public static void main(String[] args) {
    int c;
 tool obj = new tool();
 obj.a = 1;

    tool.add(1,2 );
    //add(1,2);

    code2.sub(1,2 );
    sub(1, 2);
  }   

  //obj.a = 1; you make here template so it wont work

}

class tool2{

    static void add(int a,int b){
        int sum  = a + b;
        System.out.println(sum);
        code2.sub(1,2 );
        // sub(1,2 ); need to use class name to call
        // as java see within class saying method is not defined
        // as your in same package there is visibility of all classes within package just use class name so that jvm understand that method from where it belongs
    }

}