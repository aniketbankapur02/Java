package optional;

import java.util.Optional;

class code3{
    static Optional<String> getName(int id){
        String name = "XYZ";
        
        return Optional.of(name);
    }
    public static void main(String[] args) {
        Optional<String> name1 = getName(1);
        Optional<String> name2 = name1.map(x -> x.toLowerCase());


        name2.ifPresent(System.out::print);// or x -> sout(x)
        // name.ifPresentOrElse(System.out::print, null);


    }
}