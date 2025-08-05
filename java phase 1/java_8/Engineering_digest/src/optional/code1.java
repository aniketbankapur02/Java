package optional;

import java.util.Optional;

class code1{
    static Optional<String> getName(int id){
        String name = "XYZ";
        // return Optional.of(name); due to of it may not handle null 
        return Optional.ofNullable(name);//ofNullable says that box may contain null
    }
    public static void main(String[] args) {
        Optional<String> name = getName(1);

        name.ifPresent(System.out::print);// or x -> sout(x)
        // name.ifPresentOrElse(System.out::print, null);

        //--------------OR 
        if(name.isPresent()){
            System.out.println(name);
        }else{
            System.out.println("no value");
        }
    }
}