import java.util.Scanner;

public class p51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the values for a, b, c : ");
        double a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        double d = b * b - 4 * a * c, x1, x2;
        double D = Math.sqrt(d);
        if (D > 0) {
            x1 = (-b + d) / (2 * a);
            x2 = (-b - d) / (2 * a);
            System.out.println("value of x1 is: " + x1);
            System.out.println("value of x2 is: " + x2);
        } else if (D == 0) {
            x1 = -b / (2 * a);
            x2 = -b / (2 * a);
            System.out.println("value of x1 is: " + x1);
            System.out.println("value of x2 is: " + x2);
        } else {
            sc.close();
            try {
                throw new ArithmeticException();
            } catch (ArithmeticException e) {
                System.out.println("The equation has no real roots.");
            }
        }
        sc.close();
    }
}