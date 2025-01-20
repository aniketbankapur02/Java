// Q1. Write a c program to calculate the area of a rectangle:

// a) using hardcoded inputs & 

// b) using inputs supplied by the user

// Q2. Calculate the area of a circle and modify the same program to calculate the volume of a cylinder given its radius and height.

// Q3. Write a program to convert Celsius (Centigrade degrees temperature to Fahrenheit)

// Q4. Write a program to calculate simple interest for a set of values representing principle, no of years, and rate of interest.

package Chapter_1_practice_set;

import java.util.Scanner;

public class code1 {
    // data members

    private float length ;
    private float breadth;

    float area;

    code1(float length, float breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // call by value of refernce 
    // we will not do bec as i declared variable out side main method so need to reflect
    void area_rectable(){
        area = length * breadth; 
        System.out.println(area);
    }
    // void area_rectable2(code1 area_reflect){
    //     area_reflect.area = length * breadth; //unncecarry and also i have o make array
    // }

    // not a  member of code1 class as main is static no instance is created under class
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // area length, breadth are non static and they were easily used in non static methods 
        // area = length * breadth; cannot access non static field in the static methods
        // above statement is template this cannot be in  shared memory type
        //reason simple if someone calls this static method we do not need to create an object
        // to access this non static feilds  we need to create object and if it becames part of static the one in which object creation is not required to acess 
        // so this creates issue that static cannot have a non static field. in which object creation of field is required no hybrid thing exist in this
      // static fields can be there in non staic 
       
      // to acces you need to create obj

      code1 obj = new code1(0, 0);
      obj.area = 10;

      //instance block can have static fields n instance fields 
      //static block contains only static fields no non static field is allowed

      //read above in detail in gpt


        // array objects
        code1 area_rec[] = new code1[4];// made 4 object blocks in heap of an array

        for (int i = 0; i < area_rec.length; i++) {
            float l, b;
         
            System.out.println("Enter area" +i+ "l and b");
            l = sc.nextFloat();
            b = sc.nextFloat();

            

            area_rec[i] = new code1(l, b);//as data type is not int it is code1 so each block of array has to allocate object in heap

        }
        sc.close();
        for (int i = 0; i < area_rec.length; i++) {
            area_rec[i].area_rectable();
        }
        // for (int i = 0; i < area_rec.length; i++) {
        //     area_rec[i].area_rectable2(area_rec[i]);
        // }

        

 
 
    }

}


    