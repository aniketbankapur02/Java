package u2passbyvaluemywork;

public class noReflectionCode1 {
    static void swap(int a,int b){ // swap happens locally it is not reflected to other method as stack frame is erased
        int temp = a;
         a = b;
         b = temp;
    }

    static void change (String name){// here name we have hexa code of given string pool value so name is pointing to that string 
        name = "rahul sir"; // here name again point to new string value  and main name is not changed
    }
    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        swap(a, b);// swap will not happen here as there is no concept of reflection bec there is no address access
        // bec of local scope thing it is not reflected as swap stack frame is poped all local vairable is erased 
        // so we need universal memory for to store value so we can achieve using heap
        // for reflection make you have to make object in heap 
        
        String name = "Aniket";
        change(name);
        // no change will happen at change local string just point to another string and this name in main remains as it 

    }
}
