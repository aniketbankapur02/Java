package u2passbyvaluemywork;
// array code reference is passed value is reflected as object is accessed and changed by ,method variables via []

public class ReflectionCode2 {
    public static void main(String[] args) {
        int[] arr = new int[4];

        System.out.println(arr[0]);
        change(arr);
        System.out.println(arr[0]);

    }

    static void change(int[] arr1){// arr1 has same reference code what arr has so any changes made by arr1 will made io heap and whoever poiting to same object  will have updated value 
        arr1[0] = 99; // arr1 acccessed object via [] and modifed object so value is changed in heap
        // in case of string we were creating new objects no string were modified
        // it is not possible to change object value of string via [] bec of immutability 

    }
}
