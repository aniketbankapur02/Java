// yyou can make tutorial ont his and a blog as well
// file name can be anything as there is no public class
// public class is just for visiblity of that class for package so for vibility file name == class name
// above is reason not this reason "JVM cant call main method as the class is private (only user cant call main method if class is private)" 

//best practice

//1)if one public class java file name should match class name
//2) one main method so one entry point for JVM 
// 3) main method should be in public class
//4) because best practice is 1 public and all other private we call all private class by making reference in main method 
// no need to immport package as OS will find it in JRE
//1) OS will see current directory for lib if not then override to varibale environment path or pass a parametter

// we compile java file compiler gave 4 class file as file has 4 class
// jvm wont run class file user has to give explicitly which class he has to run and jvm runs only class that has main mehtod becuse this only entry point
// if two class has own main method therefore two class main method are there user has to choose and run according to thier project but this is bad practice
// other  method class are called acc to reference in main method

// to create package
//  package PROJECT_1; 

//cant make this as a package as it is project folder not package folder  
// there should be folder at top level for packaage creation if not make forcely by using -d using javac -d .java
// as package has lot other thing as it should be in organize form 

import tools_private_project_approch.tool_caller;
//import tools.money_converter;cannot import as the class is private 

import tools_public_api_approch_package.*;

class Simple1 {
    public static void main(String args[]) {
        System.out.println("Hello Java");
        // to call main method of other class no need to create object as it is static so
        // command is Simple.main(null);
        //
        // you can give arguments which is known as CLA
        // to give arguments during JVM code execution command -> java .class pass argument to jvm program ie java.exe (as JVM entry point is main it calls main method if
        // you want to give argument use this command) command -> java class_name string
        // 1 string 2
        // think like java.exe is method and you calling java.exe by passing argument for main method you can leave blank if no argument need to be passed to string it will set to null
        String name = args[0];
        String age = args[1];
        /*
         pass  arugument by CLA is passed to main during CLI
         call by user ypu can have pass  some argument  give null if no argument to pass you cant leave blank
         args is refernce varibale it needs code else give null 

         final notes
         (1)two method to pass arguments to main method
         1) main(null) or main("hello","22"); // two method calling self main making it recursion or other class of same file class or import -> class of same package which can be public or package private or class  from other package which should be public
         2) via CLI 

         (2) two main method calling
         1) self main method calling making it recursion
         2) importing main method
          i) import from same java file using class.main class and its members should be public or package private 
          ii) import from different java file of a same package (it should be package private class or public and also its members should be public or package private )
          iii) import from different package (class and its members should be public)
         */
        // Output the greeting
        System.out.println("Hello, " + name + "! You are " + age + " years old.");

        // call main method of same class not other class by user
        // Simple1.main("aniket","22"); first create string array in heap and then give
        // rules
        // 1) static
        // 2) break the loop of stack frame calls as it is a recursion
        // 3) pass some argument if no arg use null or if some make string
        // String ref_var[] = {"aniket_","22"};
        // Simple1.main(ref_var);
        // Simple1.main(null);
        // Simple1.main(args);

    }
}

class Simple2 {
    public static void main(String args[]) {
        tool_caller obj1 = new tool_caller();

        // obj1.sample_data = 5;

        obj1.use_tool_calculator(1, 3);// if method (as this is from diff package) is not public no access to read also
                                       // both class and method should be public
        // if same package and access is package private and if method is not package private we cannot read or write 
        // obj1.sample_data = 5;
        /*
         so i  made  tool_private_project_approch that has approach of 1 public and and rest private
         so how i can access private 
         only way to call is by calling public
         via public i used private method its like via contructor i initlized private fields
         
         user -> public -> private 
         */
        obj1.use_dollar_convertor(10000);
        obj1.use_ruppies_convertor(8000000);

    }
}

// using tools_public_api_approch_package package's class for calculation
class Simple3 {

    int money;

    public static void main(String args[]) {

        /*
         this approach wins it is more flexible to use
         so in this approach we made 2 java file and each java file has one public class to use
         */
        tools_public_api_approch_package.num_calculator person1_num_cal = new num_calculator();
        // now u can use any methods data of that class
        person1_num_cal.add(1, 2);
        person1_num_cal.sub(1, 3);
        // or
        money_converter person1_money_converison = new money_converter();

        person1_money_converison.dollar_to_ruppies(100);
        person1_money_converison.ruppies_to_dollar(8000);
    }
}

class Simple4 {
    Simple3 person1 = new Simple3();

    // person1.money = 100;
    public void big(String args[]) {
        System.out.println("Hello Java");

    }
}
// public private depends on you 
// but it will be private and used in main method
//helper class
//alll private one public class hello and class hello file == hello java file
class tools{
    //data member
private int num1,num2,dollar,ruppies;// you dont need to make this fields as this fields is not mean to store for particular object
// example above is general and not specific field like ID phone_no to orgnize for user 

    //methods members

    //declare methods
    // public void dollar_to_ruppies(int dollar) ;

    //define methods
    public void dollar_to_ruppies(int dollar) {
        this.dollar = dollar;
        System.out.println(dollar * 80);// instance field is not used this.dollar and it is not affecting code no need to make this fields
    }

    public void ruppies_to_dollar(int ruppies) {
        this.ruppies = ruppies;
        System.out.println(ruppies / 80);
    }

    public  void add(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;

        System.out.println(num1 + num2);
    }

  public  void sub(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;

        System.out.println(num1 - num2);
        
    }

 

}

public class hello{
    public static void main(String[] args) {
        tools person1 = new tools();

        person1.add(1, 2);
        person1.sub(1, 3);
       


        person1.dollar_to_ruppies(100);
        person1.ruppies_to_dollar(8000);

    }
}

