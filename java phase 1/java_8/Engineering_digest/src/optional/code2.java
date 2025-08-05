package optional;
import java.util.NoSuchElementException;
import java.util.Optional;

/*
 * here explcitly returning null via empty() method
 */

class code2{
    static Optional<String> getName(int id){
        return Optional.empty();
    }
    public static void main(String[] args) {
        Optional<String> name = getName(1);// Optional String has null

        String nameToBeUsed1 = name.orElse("NA");// here NA is assigned
    
        
        /*
         if do something small use orElse
         if big operation use orElseGet with help of this we can write lamda function
         name.orElseGet(() -> {
         code1
         code2
         .
         .
         })
         */
        String nameToBeUsed2 = name.orElseThrow(() -> new NoSuchElementException());
        //OR use method reference ie constructor reference here new refers to constructor call
        String nameToBeUsed3 = name.orElseThrow(NoSuchElementException::new);
        
        name.ifPresent(System.out::print);// or x -> sout(x)

    }
}