package generics.genericsinterface;

 interface Geneinterfac<T> {
    void display(T value);// T can be any type during making
}

public class Geneinterface implements Geneinterfac<Integer> { // instead of T write integer
    @Override
   public void display(Integer value){// instead of T write integer
        System.out.println(value);
    }
    public static void main(String[] args) {
    }
}



