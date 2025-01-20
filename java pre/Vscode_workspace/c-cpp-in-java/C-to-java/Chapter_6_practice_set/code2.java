//Write a program using a function that calculates the sum and average of two numbers. Use pointers and print the values of sum and average in main().
package Chapter_6_practice_set;

public class code2 {
// why making members bec pass by value of reference can be done if we allocate obj in heap
    int sum;
    int avg;

    // static not a member of code2 class 
    // why we not making memebr method 
    // member method is template  so will not use its template by making his objects

    
    static void avg(code2 ref,int num1,int num2){
        ref.avg = (num1 + num2)/2;
    }// after this ref is flussed
    static void sum1(code2 ref,int num1,int num2){
        ref.avg = (num1 + num2)/2; // access avg from heap which is 15 
        // reinitilized to 15 again
    }
    static void sum2(code2 ref,int num1,int num2){
        ref.sum = (num1 + num2); // access av from heap which is 15 
    }
    // wirred
    //  void avg1(code2 ref,int num1,int num2){
    //     ref.avg = (num1 + num2)/2;
    // }
    
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        code2 ref_var = new code2();

        avg(ref_var,num1,num2);
        sum1(ref_var,num1,num2);
        sum2(ref_var,num1,num2);

        System.out.println(ref_var.avg);//15
        System.out.println(ref_var.avg);//15
        System.out.println(ref_var.sum);

//Write a program to print the value of a variable i by using the "pointer to pointer" type of variable.
// above cannot be done as evryone will point to heap only 

    }
    
}
