import java.util.ArrayList;
import java.util.Date;

public class p71 {
    public static void main(String[] args) {
        ArrayList<String> arr = new java.util.ArrayList<>();
        Loan l = new Loan("XYZ", 50000, 2022, 2);
        arr.add(l.toString());
        Date d = new Date();
        arr.add(d.toString());
        Circle c = new Circle(10);
        arr.add(c.toString());
        System.out.println("Content of array list is : ");
        System.out.println(arr);
    }
}

class Loan {
    String personName;
    double amount;
    int year;
    int duration;

    Loan(String person, double amount, int year, int duration) {
        this.personName = person;
        this.amount = amount;
        this.year = year;
        this.duration = duration;
    }
}

class Circle {
    int r;

    Circle(int r) {
        this.r = r;
    }
}
