package switchcase;

import java.util.Scanner;

public class U2_nestedSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int studentID = sc.nextInt();
        String department = sc.next();

        switch (department) {
            case "computer":
            System.out.println("Your in computer depart \n enter student id to get details");
            int studentID = sc.nextInt();
                switch (studentID) {
                    case 1:
                        System.out.println("aniket");
                        break;
                    case 2:
                        System.out.println("xyz");
                        break;
                    default:
                        break;
                }

                break;
            case "ece":
            System.out.println("Your in Ece depart ");
                break;
            case "mech":
            System.out.println("Your in mech depart ");

                break;

            default:
                break;
        }
        sc.close();
    }
}
