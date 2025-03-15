package classwork.inheritence;

public class BoxWeight extends Box {// dont need to import as it is in same package

    // now box weight has all properties what box has constructor and all
    // + his own fields

    int weight;

    BoxWeight() {
        // i have not defined still i can use this l w h
        // this.l = 100;
        // this.w = 200;
        // this.h = 300;
        this.weight = 1;
    }

    BoxWeight(int l, int w, int h, int weight) {
        // i have not defined still i can use this l w h
        // this.l = 100;
        // this.w = 200;
        // this.h = 300;

        // as this are the properties of Box we have to use that only
        // we have to call parent constructor call constructor from another from
        // constructor
        // use super to call parent constructor
        // based on aruguments it will that constructor
        // super(l,w,h);
        // child constructor takes l w h which is of parent so we have to send l w h to
        // parent class via super
        // if dont write super and if there are no constructor in Box ie parent still it
        // will call parent default constructor gives default values ie 0 i have
        // commented out all constructor of Box and see usage in useinherienctence1
        // if there is non parameter constructor it will call that not default
        // consructor
        this.weight = weight;
    }

    // again same case hapend in super thing box ref var will point to Boxweight
    // object in heap ie it wont have access to weight as he dont know this weight
    // lives in his world
    // but has access for l w h we will assign l w h
    // so Box cannot assign weight u have to assign it here
    BoxWeight(BoxWeight ref) {
        super(ref);
        this.weight = ref.weight;
    }

    BoxWeight(int l, int w, int weight) {
        super(l, w);
        this.weight = weight;
    }

}
