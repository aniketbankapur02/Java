// mostly we use constructor and for loop combo (refer IPA 35 question) for initilization 
// why constructor , getter setter is imp bec fields are private
// to print we use member method



package Chapter_9_practice_set;

import java.util.Scanner;

class employee  {
    int id;
    int salary;
    String name;

    employee(int id,int salary, String name){
        this.id = id;
        this.salary = salary;
        this.name = name;
    }

    void print_details(){
        System.out.println(id);
        System.out.println(salary);
        System.out.println(name);
    }

}

public class code2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        employee emp[] = new employee[2];

    emp[0] = new employee(1,100,"xyz");

    // still emp[1] allocattion is not done
    //  employee emp[] = new employee[4]; only array refer memory diagram of array of objects
    // Memory is allocated for the array object itself.
    // no allocation is done for array blocks
    // emp[0], emp[1], etc is null
// The array is stored in the heap, and each element (emp[0], emp[1], etc.) is initialized to null.

/*

emp[1].id = 1;
emp[1].salary = 1;
emp[1].name = "xyz";

emp[1] is null at this point.
Trying to access or modify emp[1].id dereferences null, causing a NullPointerException.
to fix follow this first allocate array block object in heap 
emp[1] = new employee();
emp[1].id = 1;
emp[1].salary = 1;
emp[1].name = "xyz";
if no new then 
example
    emp[1].id = 1;
    emp[1].salary = 1;
    emp[1].name = "xyz";
Exception in thread "main" java.lang.NullPointerException: Cannot assign field "id" because "<local2>[1]" is null
        at Chapter_9_practice_set.code2.main(code2.java:28)
 */

        for (int i = 0; i < emp.length; i++) {
            int id = sc.nextInt();
            int salary = sc.nextInt();
            String name = sc.nextLine();

            emp[i] = new employee(id,salary,name);// data is stored in organize way for each object
        }
        sc.close();
        for (int i = 0; i < emp.length; i++) {

            emp[i].print_details();// function that print data of object 
        }
    }
}
