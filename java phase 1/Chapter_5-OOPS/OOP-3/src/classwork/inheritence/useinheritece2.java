package classwork.inheritence;

public class useinheritece2 {
    public static void main(String[] args) {
        // interesting thing object allocation is of child class but reference is done by parent reference varibale not child reference variable
        // still parent refernce varibale cannot access it 

        // this is obivious 
        Box obj1 = new Box();
        // obj1.weight = 1;error


        Box obj2 = new BoxWeight(10, 20, 30, 40);

        // box ref var is pointing child class object not his parent object in heap
        // still parent class cannot access weight as bec hierarchy rules

        // obj2.weight = 1; // error cannot access child fields

        // now reverse things ref var if of child but object is of parent in heap to which he is pointing
        
        // BoxWeight obj3 = new Box(10, 20, 30);// error
        // bec child demands weight fields object of parent in heap cannot have weight fields
        // only object of child class can have weight fields

        // parent constructor is called and parent does not have idea of weight field

        // parent does not know what child can have

        // but child can know what parent has
        // thats why this works Box obj2 = new BoxWeight(10, 20, 30, 40); child object in heap can handle l w h as child was inherited
        // and this wont work // BoxWeight obj3 = new Box(10, 20, 30);// error as parent object in heap cannot handle weight field as he does not has idea for weight fields

        BoxWeight.hello();
        

    }
}
