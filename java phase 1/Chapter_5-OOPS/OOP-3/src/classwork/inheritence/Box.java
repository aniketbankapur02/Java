package classwork.inheritence;



// give some properties
public class Box {
    int l,w,h;

    Box(){
        this.l = 1;
        this.w = 2;
        this.h = 3;
    }
    Box(int side){
        this.l = side;
        this.w = side;
        this.h = side;
    }
    Box(int l,int w,int h){
        this.l = l;
        this.w = w;
        this.h = h;
    }
    Box(Box ref){
        this.l = ref.l;
        this.w = ref.w;
        this.h = ref.h;
    }

    //method

    void information(){
        System.out.println("Some info");
    }


    
    
}