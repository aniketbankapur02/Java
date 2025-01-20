// Create a two-dimensional vector using class in java
//Write a function SumVector which returns the sum of two vectors passed to it. The vectors must be two-dimensional.

//  vector using structures in C. v = 3i + 4j direction =>(3,4)
package Chapter_9_practice_set;
class vector_num{
    int i;
    int j;
    int sum;
    vector_num(int i ,int j){
        this.i = i;
        this.j = j;
    }

    vector_num sum3(vector_num ref_var){

        // we need to store this in new var 

        vector_num ref_var3 = new vector_num(0, 0);
        ref_var3.i = this.i + ref_var.i; 
        ref_var3.j = this.j + ref_var.j;


        return  ref_var3; 
    }
    // in this we have not made ref_var in stack frame
    // in this object is created in heap and reference code is return 
    public vector_num add3(vector_num other) {
        return new vector_num(this.i + other.i, this.j + other.j);
    }
    // vector_num sum2(vector_num ref_var1 , vector_num ref_var2){
    //     vector_num ref_var3 = new vector_num(0, 0);
    //     ref_var3.i = (ref_var1.i + ref_var2.i);
    //     ref_var3.j = (ref_var1.j + ref_var2.j);

    //     return ref_var3; 
    // }



    // void sum1(vector_num ref_var1 , vector_num ref_var2){
    //     vector_num ref_var3 = null;
    //     ref_var3.i = (ref_var1.i + ref_var2.i);
    //     ref_var3.j = (ref_var1.j + ref_var2.j);
    //     System.out.println("given vector sum is" +ref_var3.i+"i"+ref_var2.j+"j");
     
    // }
}

public class code4 {
    public static void main(String[] args) {
        vector_num v1 = new vector_num(1,2);
        vector_num v2 = new vector_num(3,4);

        vector_num v3 = new vector_num(0,0);

        // v3 = v3.sum2(v1,v2); 
        v3 = v2.sum3(v1); 
        System.out.println("given vector sum is " +v3.i+"i "+v3.j+"j");


    }
}
