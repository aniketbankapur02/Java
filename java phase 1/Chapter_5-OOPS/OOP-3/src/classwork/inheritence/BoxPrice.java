package classwork.inheritence;

public class BoxPrice extends BoxWeight {
    // so you have Box weight and Box properties
    // you  have lot of properties not just one prize

    int price;

    BoxPrice(int l,int w,int h,int weight,int prize){
        super(l, w, h, weight);// parent constructor will take care for this properties
        this.price = prize; 
    }
    BoxPrice(int l,int w,int weight,int prize){
        super(l, w, weight);// parent constructor will take care for this properties
        this.price = prize; 
    }
}
