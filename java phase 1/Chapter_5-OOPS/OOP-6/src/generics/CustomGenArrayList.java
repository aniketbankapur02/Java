package generics;

import java.util.ArrayList;
import java.util.Arrays;

// we have to implement custom type for like generics
// but we cannot create custom type like T as shown below now in Main3 we will do that
/*
 T as bec generics deals at compile time not at runtime shown below now in Main3 we will do that
// so object allocation of T is not possible at runtime
// so how to allocate at run time using objects
 */
public class CustomGenArrayList<T> {

    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0; // also working as index value

    public CustomGenArrayList() {
        data = new Object[DEFAULT_SIZE];
    }

    public void add(T num) {
        if (isFull()) {
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];

        // copy the current items in the new array
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public T remove() {
        T removed = (T) (data[--size]);
        return removed;
    }

    public T get(int index) {
        return (T) data[index];
    }

    public int size() {
        return size;
    }

    public void set(int index, T value) {
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomGenArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        // ArrayList list = new ArrayList();
        CustomGenArrayList list = new CustomGenArrayList();
        // list.add(3);
        // list.add(5);
        // list.add(9);

        // for (int i = 0; i < 14; i++) {
        // list.add(2 * i);
        // }

        // System.out.println(list);

        ArrayList<Integer> list2 = new ArrayList<>();
        // list2.add("dfghj);
        list2.add(1);
        list2.add(1);
        list2.add(1);
        list2.add(1);

        System.out.println(list2);// arraylist calls tostring method by default to print list

        CustomGenArrayList<Integer> list3 = new CustomGenArrayList<>();
        for (int i = 0; i < 14; i++) {
            list3.add(2 * i);
        }

        System.out.println(list3);// it calls tostring but we are overriding tostring method 

    }
}