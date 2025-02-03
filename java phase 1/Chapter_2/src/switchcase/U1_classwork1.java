package switchcase;

import java.util.Scanner;

public class U1_classwork1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter fruit name from list to get info  \n list \n 1)Mango \n 2)Banana \n 3)Oranage : ");
        String str = sc.next();
        switch (str) {
            case "Mango":
                System.out.println("Most favourite fruit");
                break;
            case "Banana":
            System.out.println("Do you know that banana is berry ");
            break;
            
            case "Orange":
            System.out.println("Orange is good source of vitamin c");
            break;
        
            default:
            System.out.println("Invalid option");
                break;
        }

        int day = sc.nextInt();
        
        /*
        in below as there is no break in case 1 2 3 4 when i enter any of this like 2 it will jump to case 2 it will execute blank code and continue jumping to case 3 , 4 ,5 untill break is found
 so at case 5 it will reach it and print case 5 code and it will break bec of break keyword
 */
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            System.out.println("week day");
            break;
            case 6:
            case 7:
            System.out.println("Week end");
            default:
                break;
            }


            // clean way to write no need to write break as well
        switch(day){
            case 1,2,3,4,5 -> {
                System.out.println("weekday");
            }
            case 6,7 -> System.out.println("Weekend");
        }

        sc.close();
    }
}
