package tools_private_project_approch;

//in tool package 
// two class will be created after javac /tools/tool_caller.java
// use any time
// used in hello java
class num_calculator {
   public int num1;
    int num2;

    // int add();
    // int sub();

    int add(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;

        return (num1 + num2);
    }

    int sub(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;

        return (num1 - num2);
    }

}

class money_converter {
    int dollar;
    int ruppies;

    // int dollar_to_ruppies();
    // int ruppies_to_dollar();

    num_calculator ff ;
    num_calculator f = new num_calculator();
    // num_calculator foo = new num_calculator(); defining in class is fine but  using it is not fine

    // foo.num1 = 3; error you cannot write in any class. as class is just for blue print
    // that why num_calculator foo = new num_calculator(); worked as you r defining it

    //System.out.println("addition"+foo.add(num1, num2)); error you can define method but cannot use it in class



    int dollar_to_ruppies(int dollar) {
      //  num_calculator foo = new num_calculator(); ble to access because of private package

       // foo.num1 = 3; ble to access because of private package
       int num1 = 100,num2 = 200;
      //  System.out.println("addition"+foo.add(num1, num2)); ble to access because of private package


        this.dollar = dollar;
        return (dollar * 80);
    }

    int ruppies_to_dollar(int ruppies) {
        this.ruppies = ruppies;
        return (this.ruppies / 80);
    }
}

// within same package same java file you can access read write  data , mehtods of
// other class because of private package
// if private keywords is mention then you cant read write class
// if public  keywords is mention other package can read write 
// outside package class can access this package class if it is  public 
// data ,method  also should be public
public class tool_caller {

  public int sample_data1;
  private int sample_data2;
  int sample_data3;

   public  void use_tool_calculator(int num1, int num2) { //need to mention method as well even if class is public tool_caller 

        tool_caller obj_to_test = new tool_caller();
        obj_to_test.sample_data1 = 5;


        num_calculator foo = new num_calculator();

        // foo.num1 = 3; able to access because of private package

        System.out.println("addition" + foo.add(num1, num2));
        System.out.println("sub" + foo.sub(num1, num2));

    }

    public void use_dollar_convertor(int dollar) {
        money_converter foo = new money_converter();

        System.out.println("dollar_to_ruppies" + foo.dollar_to_ruppies(dollar));
        // System.out.println(foo.ruppies_to_dollar(ruppies));

    }

    public void use_ruppies_convertor(int ruppies) {
        money_converter foo = new money_converter();

        // System.out.println(foo.dollar_to_ruppies(dollar));
        System.out.println("ruppies_to_dollar" + foo.ruppies_to_dollar(ruppies));

    }

    // public static void main(String[] args) {
    // tools.num_calculator person1 = new num_calculator();

    // person1.add(10,1);
    // person1.sub(10,1);
    // System.out.println("Sum: " + person1.add(5, 10));
    // System.out.println("Sum: " + person1.sub(5, 10));

    // }
}
