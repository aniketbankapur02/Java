package u1classworkunal;

public class U8StringBuilderPerformance {
    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder("hello");

        System.out.println(s1.charAt(0));

        for (int i = 0; i < 26; i++) {
            // get char
            char ch = (char)('a' + i);// makign alphbets from a to z

            // s1 = s1 + ch; // error as + works only in the case of string not StringBuilder appending ch to s1

            // s1.append(ch);// will append after hello o/p -> helloabcdefghijklmnopqrstuvwxyz 
            // or
            s1.insert(i, ch);// will append at particular index
            //this is not reinitialization this is insertation like append
            //so hello is preserved it will not be replace by abcde
            // o/p is abcdefghijklmnopqrstuvwxyzhello
            // as this insertation not replace method


            /*
             performance
             for every iteration N objects ie no new objects are being made resulting in good performance ie O(n) time and space complexity
             as stringBuilders and StringBuffer are mutable so orignal string is modified and no new object is been made for every iteration

             so we can use stringBuilder/Stringbuffer if you are appending in loop
             if you want to append in loop or any do modification use stringBuilder or stringBuffer 
             */
        }

        System.out.println(s1);
    }
}
