package enums.enuminheritance;
/*
 all the enum excplicit extends java.util.Enum class
 you cannot extend more class as you are already extending on class so no more than one class extending is allowed as multiple inheritance is not possible in java
 you can implement one or more interface 


 
 we can need to explore comparae what compare can be done by == operator in enum 
 */
interface A {
    void hello();
}

public class Example1 {
    enum Week implements A{
        Mon, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
        // these are enum constants
        // public, static and final
        // since its final you cannot create child enums
        // type is Week

        void display() {

        }

        Week() {
            System.out.println("Constructor called for " + this);
        }

        @Override
        public void hello() {
            System.out.println("hey how are you");
        }
        // this is not public or protected, only private or default
        // why? we dont want to create new objects
        // this is not the enum concept, thats why

        // internally: public static final Week Monday = new Week();
    }

    public static void main(String[] args) {
        Week week;
        week = Week.Mon;
        week.hello();
        System.out.println(Week.valueOf("Mon"));
//        for(Week day : Week.values()) {
//            System.out.println(day);
//        }

       System.out.println(week.ordinal());
       System.out.println(Week.valueOf("Mon"));// string should be exact enum constants

       // due to final you cannot create objects explicitly like = new Weekly("enumconstants") 
    }
}
