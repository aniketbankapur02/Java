/*
 void show(struct employee e);   =>Function prototype

Quick Quiz: Complete this show function to display the content of the employee.
already done with member with now we will implement using static
 */

package Chapter_9_practice_set;

class employee  {
    int id;
    int salary;
    String name;

    // employee(int id,int salary, String name){
    //     this.id = id;
    //     this.salary = salary;
    //     this.name = name;
    // }

}
public class code3 {

    static void show(employee ref_var){
        System.out.println(ref_var.id);
        System.out.println(ref_var.salary);
        System.out.println(ref_var.name);
    }
    public static void main(String[] args) {
        // array allocation
        employee emp[] = new employee[2];
        // array's object  with constructor invoke
        // emp[0] = new employee(1, 1000, "xyz");
        // array's object  without constructor invoke

        emp[0] = new employee();
        emp[0].id = 1;
        emp[0].salary = 1;
        emp[0].name = "xyz1";

        emp[1] = new employee();
        emp[1].id = 2;
        emp[1].salary = 2;
        emp[1].name = "xyz2";

        for (int i = 0; i < emp.length; i++) {
            show(emp[i]);
        }




    }
}
