package u1classworkunal;
// performance
public class U6CLasswork {
    public static void main(String[] args) {
        String s1 = "";
        String s2 = null;

        System.out.println(s1);
        System.out.println(s2);

        for (int i = 0; i < 26; i++) {
            // get char
            char ch = (char)('a' + i);// makign alphbets from a to z

            s1 = s1 + ch; // appending ch to s1

            /*
             performance
             for every iteration N objects ie new objects are being made resulting in bad performance ie O(n^2) time and space complexity
             as string are immutable no orignal string is modified new object is been made for every iteration

             so never ever use string if you are appending in loop
             if you want to append in loop or any do modification use stringBuilder or stringBuffer 
             */
        }

        System.out.println(s1);


    }
}
