
// Q2. Calculate the area of a circle and modify the same program to calculate the volume of a cylinder given its radius and height.
//π r² h
package Chapter_1_practice_set;
// import java.util.*;

public class code3 {
    
    static double Pi = 3.14;

    static double area_cricle(int radius){
          double area;

        //   area = Math.PI * Math.sqrt(radius);

        //   System.out.println(Math.sqrt(radius));
          area = Pi * radius * radius;

          System.out.println(area);

          return area;
          
    }
    static void area_cylinder(double area_cricle,int height){
        double area_cylinder;
          
        area_cylinder = area_cricle * height;
        System.out.println(area_cylinder);

    }
    
    public static void main(String[] args) {


double area = area_cricle(4);


area_cylinder(area, 4);








/* 

        code1.main(null);//static call if main contains nonstatic which is template call and template needs object to be made but static is one so no object making is required
        code1 obj = new code1(0, 0);// non static call
        obj.area_rectable();
*/ 

       
    }

}
