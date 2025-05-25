package mock_revision.code4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Manu> l = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int mid = sc.nextInt();
            sc.nextLine();
            String Mname = sc.nextLine();
            int noCar = sc.nextInt();
            List<Car> l2 = new ArrayList<>();
            for (int j = 0; j < noCar; j++) {
                int carid = sc.nextInt();
                sc.nextLine();
                String carName = sc.nextLine();;
                double m = sc.nextDouble();
                double p = sc.nextDouble();
                Car c = new Car(carid, carName, m, p);
                l2.add(c);
            }
            Manu m = new Manu(mid, Mname, noCar, l2);
            l.add(m);
        }
        sc.nextLine();
        String mName = sc.nextLine();
        Service s = new Service();
        try {
            s.calAvgP(l, mName);
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        s.findCarMaxM(l);

    }
}
class Service {

    void calAvgP(List<Manu> l,String m) throws NegPrice {
        double avg = 0;
        int count = 0;
        boolean check = false;
        for (Manu manu : l) {
            if (manu.Mname.equals(m)) {
                for (Car manu2 : manu.l) {
                    check = true;
                    if (manu2.p < 0) {
                        throw new NegPrice("Invalid Price: ");
                    }
                    avg += manu2.p;
                    count++;
                }
            }
        }
        if (!check) {
        System.out.println("No cars produced by the given manufacturer.");
        }else{
            System.out.println("Average price of cars produced by " + m + " is: " + avg/count);
        }
    }

    void findCarMaxM(List<Manu> l){
        double maxM = 0;
        String carName = null;

        for (Manu manu : l) {
            for (Car manu2 : manu.l) {
                if (manu2.m > maxM) {
                    maxM = manu2.m;
                    carName = manu2.carName;
                }
            }
        }
        System.out.println("Name - " + carName);
        System.out.println("Mileage - " + maxM);
    }
    
}
 class NegPrice extends Exception {
    NegPrice(String message){
        super(message);
    }
}

class Car {
int carid;
String carName;
double m;
double p;

Car (
int carid,
String carName,
double m,
double p){
    this.carid = carid;
this.carName = carName;
this.m = m;
this.p = p;
}

    
}

class Manu {
int mid;
String Mname;
int noCar;

List<Car> l;

Manu (
int mid,
String Mname,
int noCar,
List<Car> l
){
    this.mid = mid;
    this.Mname = Mname;
    this.noCar = noCar;
    this.l = l;    
    
}
}

/*
 notes we cn do this as well
if (manu.l.isEmpty()) {
    System.out.println("No cars produced by the given manufacturer.");
    return;
}
 */