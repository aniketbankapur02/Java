package u1classworkunal;

public class U10SBMethods {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("hello");

        s.append(0);// output hello0
        System.out.println(s);
        s.insert(2, "hi"); 
        // insert means append at particular index
        System.out.println(s);//hehillo0
// below are the o/p for abovve string run one at a time dont run both at same time
        // s.replace(0, 0, "hi");//hihehillo0
        System.out.println(s);
        // s.replace(0, 1, "hi");//hiehillo0
        System.out.println(s);

        /*
         so replace method is made for to replace string not char
         you are you using start and end index same replace one char string
         else if you replace two char string in one index it will push next index element to next index
        so evenly  replace string as per string value replacement
        if start 0 end 3 so total string that can replace is 4
        so a.replace(0,3,"1234")
        length cannot be greater than 4 or less than 4 a.replace(0,3,"12345..")(no greater than element 5) or a.replace(0,3,"123")(no less than 4)
         */

        StringBuffer s1 = new StringBuffer("hello there !");

        System.out.println(s1.replace(0, 4, "hi"));// hio there ! undfine beahvior o is not cut

        System.out.println(s1.delete(0, 4));// there !
        System.out.println(s1.reverse());





    }
}
