// Write a class capable of storing date. Write a function to compare those dates.
package Chapter_9_practice_set;

class date {
    int day;
    int month;
    int year;
    int hour;
    int minuate;
    int seconds;

    date(int day, int month, int year, int hour, int minuate, int seconds) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.hour = hour;
        this.minuate = minuate;
        this.seconds = seconds;
    }

    void display_time() {
        System.out.println(day + "/" + month + "/" + year + " time stamp " + hour + ":" + minuate + ":" + seconds);
    }

    int campare(date ref2){
        if (this.day != ref2.day) {
            return 0;
        } else if (this.month != ref2.month) {
            return 0;
        } else if (this.year != ref2.year) {
            return 0;
        } else if (this.hour != ref2.hour) {
            return 0;
        } else if (this.minuate != ref2.minuate) {
            return 0;
        } else if (this.seconds != ref2.seconds) {
            return 0;
        }else{
            return 1;
        }
    }

    static int campare(date ref1, date ref2) {
        // if (ref1.equals(ref2)) {

        // }
        if (ref1.day != ref2.day) {
            return 0;
        } else if (ref1.month != ref2.month) {
            return 0;
        } else if (ref1.year != ref2.year) {
            return 0;
        } else if (ref1.hour != ref2.hour) {
            return 0;
        } else if (ref1.minuate != ref2.minuate) {
            return 0;
        } else if (ref1.seconds != ref2.seconds) {
            return 0;
        }else{
            return 1;
        }

    }

}

public class code7 {
    public static void main(String[] args) {
        date date1 = new date(21, 11, 2024, 7, 45, 50);
        date date2 = new date(21, 11, 2024, 7, 45, 50);

        date1.display_time();
        date2.display_time();

        // int k = date.campare(date1, date2);

        // or 

      int k = date1.campare(date2);

        if (k == 1) {
            System.out.println("same");
        }else{
            System.out.println("not same ");
        }
    }
}
