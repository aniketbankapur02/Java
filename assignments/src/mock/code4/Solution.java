package code4;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[]) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */

        Scanner sc = new Scanner(System.in);
        List<M> l = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int mid = sc.nextInt();
            sc.nextLine();
            String mName = sc.nextLine();
            int nCar = sc.nextInt();
            List<Car> c = new ArrayList<>();
            for (int j = 0; j < nCar; j++) {
                int cid = sc.nextInt();
                sc.nextLine();
                String cName = sc.nextLine();
                double carM = sc.nextDouble();
                double p = sc.nextDouble();
                Car c2 = new Car(cid, cName, carM, p);
                c.add(c2);
            }
            M l2 = new M(mid, mName, nCar, c);
            l.add(l2);
        }
        sc.nextLine();
        String mN = sc.nextLine();
        Service s = new Service();
        try {
            s.calAvgP(l, mN);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        s.maxM(l);

    }
}

/**
 * file
 */
class Service {
    void calAvgP(List<M> l, String mN) throws NegP {
        double avg = 0;
        double count = 0;

        boolean found = false;

        for (M m : l) {
            if (m.Mname.equalsIgnoreCase(mN)) {
                for (Car m2 : m.cars) {
                    if (m2.p < 0) {
                        throw new NegP("Invalid Price: car price cannot be negative.");
                    }
                    found = true;
                    avg += m2.p;
                    count++;
                }

            }
        }
        if (!found) {
            System.out.println("No cars produced by the given manufacturer.");
            return;
        }
        double result = avg / count;
        System.out.println("Average price of cars produced by " + mN + " is: " + result);
    }

    void maxM(List<M> l) throws NegP {
        double avg = 0;
        int count = 0;

        double max = 0;
        String carName = null;

        for (M m : l) {
            for (Car m2 : m.cars) {
                // if (m2.p < 0) {
                // throw new NegP("Invalid Price: car price cannot be negative.");
                // }
                if (m2.carM > max) {
                    max = m2.carM;
                    carName = m2.cName;
                }

            }

        }

        System.out.println("Name - " + carName);
        System.out.println("Mileage - " + max);

    }

}

/**
 * file
 */
class Car {
    int cid;
    String cName;
    double carM;
    double p;

    Car(
            int cid,
            String cName,
            double carM,
            double p) {
        this.cid = cid;
        this.cName = cName;
        this.carM = carM;
        this.p = p;
    }

}

/**
 * file
 */
class M {
    int mID;
    String Mname;
    int noOfCar;
    List<Car> cars;

    M(
            int mID,
            String Mname,
            int noOfCar,
            List<Car> cars) {
        this.mID = mID;
        this.Mname = Mname;
        this.noOfCar = noOfCar;

        this.cars = cars;

    }

}

/**
 * file
 */
class NegP extends Exception {
    public NegP(String message) {
        super(message);
    }
}
