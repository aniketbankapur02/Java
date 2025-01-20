import tools_private_project_approch.tool_caller;
// import tools_private_project_approch.num_calculator;error as access cannot be given outside package
// i tried to import package private class outside package 
// i tried to use public field of package private this is not possible bec you already restricted class ie at top level as package private so it makes no sense to make class field as public
// as outside package cannot enter package private  class
public class hello2 {
    public static void main(String[] args) {
        tool_caller obj = new tool_caller();
        // num_calculator ob = new num_calculator(); cannot access as it is package private
        obj.sample_data1 = 1;// no error as field is public in public class if no public it would be default ie package private
        // obj.sample_data2 = 1; error bec it is private field of public class
    
        // obj.sample_data3 = 2; error bec it is package private in public class

        // if class is public then only i can enter class and access its field 

        // if class is package private   if i am in same package then only i can enter class by importing and access its field  
        // out side package i cannot import so i cannot enter or access class even if the fields is public i cannot use it

        // if class is private it cannot be used in same java file so this class is useless 
        //i cannot use/acces class due to this even if members are public i cannot use it coz i cannot enter class
        // thats the reason private class is not allowed in java


    }
}
