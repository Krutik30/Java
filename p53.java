import java.util.InputMismatchException;
import java.util.Scanner;
import java.text.DecimalFormat;

public class p53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter the radius of circle : ");
            double radius = sc.nextDouble();
            double area = 3.14 * radius;
            DecimalFormat df = new DecimalFormat("#.##");
            System.out.println("Area of the circle is : " + df.format(area));
        } catch (InputMismatchException e) {
            System.out.println("Entered input is not in numbers!!");
        }
        sc.close();
    }
}