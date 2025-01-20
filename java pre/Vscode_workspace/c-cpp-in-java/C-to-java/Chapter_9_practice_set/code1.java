/*
read my c interview book for struct and class in java note

initlization in java class
 and comparing with struc tin c

 #include <stdio.h>
struct employee {

	int code;

	float salary;

	char name[10];

};

int main() {
//1
	struct employee obk[100];
	// can initilize one by one
	// and lot refer below
	// no issues bec there is no double quote thing
	// in daily code we use for loop

	// int arr[10]          = {      1          ,       2          };
	struct employee ob[100] = {{1,100002,"xyz"},{2,100001,"xyz123"}};
	
//2 error
	// c allows individual 
	// so initilize like below
	objjj[0].code = 1;
	objjj[0].salary = 10000000;
		struct employee objjj[100];
		
// 		objjj[0] = {99,100002.0,"xyz"};
// 		 objjj[1]={100,71.22,"Harry"};
		 
		
		printf("%d \n \n ",objjj[0].code);

//3
	struct employee obj1[] = {1,100,"xyz",12,1001,"xyz1"};
	struct employee obj2[] = {{1,100,"xyz"},{12,1001,"xyz1"}};

//4
		 struct employee ref_var = {100,71.22,"Harry"};
		 
		 
	printf("%d %f %s ",obj1[0].code,obj1[0].salary,obj1[0].name);
	printf("%d %f %s ",obj2[1].code,obj2[1].salary,obj2[1].name);

	printf("\n %d %f %s ",ob[0].code,ob[0].salary,ob[0].name);

	char str[10];

	// str = "hello"; //error
	//so initilize like normal array

	str[0] = 'a';






	return 0;
}
 */

package Chapter_9_practice_set;

class employee  {
    int id;
    int salary;
    String name;
    

}


public class code1 {
    public static void main(String[] args) {

        // initilizing objects like struct in c let c it works or not
        // employee emp[] = new employee[]{{1,100002,"xyz"}}; not working
        employee emp[] = new employee[10];
        // emp[0] = {1,100002,"xyz"};

    //    employee ref_var = new employee(){100,71.22,"Harry"};

    // none above works only individual works

    // emp[0].id = 1; error refer code2
    // emp[0].salary = 1;
    // emp[0].name = "xyz";

    // mostly we use constructor and for loop combo (refer IPA 35 question) for initilization 
    // to print we use member method

        
        int arr[] = new int[]{1,100002};
    }
}
