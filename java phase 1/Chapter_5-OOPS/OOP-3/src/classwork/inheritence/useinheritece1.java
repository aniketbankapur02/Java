package classwork.inheritence;

public class useinheritece1 {
    public static void main(String[] args) {
        // Box obj1 = new Box();//non paramter constructor is called
        // System.out.println(obj1.l + " " + obj1.w + " " + obj1.h);
        
        
        // Box obj2 = new Box(1);//cude paramter constructor is called
        // System.out.println(obj2.l + " " + obj2.w + " " + obj2.h);
        
        // Box obj3 = new Box(4,5,6);// paramter constructor is called
        // System.out.println(obj3.l + " " + obj3.w + " " + obj3.h);


        BoxWeight obj1 = new BoxWeight();// //non paramter constructor of Box class is called
        // if BoxWeight has its own constructor it will override Box constructor

        System.out.println(obj1.l + " " + obj1.w + " " + obj1.h);
        
        BoxWeight obj2 = new BoxWeight(1000,2000,3000,4);// 4 paramter constructor of BoxWeight class is called in that we call box consructor


        System.out.println(obj2.l + " " + obj2.w + " " + obj2.h + " " + obj2.weight);



    }
}
