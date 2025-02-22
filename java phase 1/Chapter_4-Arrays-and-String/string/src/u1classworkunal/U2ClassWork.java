package u1classworkunal;
// String method
// ref_var.method();
public class U2ClassWork {
    public static void main(String[] args) {

        String str = "hello";
        System.out.println(str.length());
        System.out.println(str.toUpperCase());// not storing
        System.out.println(str.toLowerCase());
        System.out.println(str.indexOf("l"));
        System.out.println(str.concat("Bankapur"));
        System.out.println(str.equals("Bankapur"));
        System.out.println(str.substring(2,4));//slice
        System.out.println(str.charAt(0));
    }
}
