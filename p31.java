import java.util.*;

class p31 {

    public static double area(double length) {

        return length * length;
    }

    public static double area(double length, double width) {

        return length * width;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the number for length of square : ");
        double ansS = area(s.nextDouble());
        System.out.println(ansS);
        System.out.println("Enter the number for length of Rectangle : ");
        double ansR = area(s.nextDouble(), s.nextDouble());
        System.out.println(ansR);

    }
}