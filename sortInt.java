import java.util.*;

class sortInt {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int a, b, c;
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();

        if (a < b && b < c) {
            System.out.print(a + " ");
            if (b < c)
                System.out.println(b + " " + c);
            else
                System.out.println(c + " " + b);
        } else if (b < c && b < a) {
            System.out.print(b + " ");
            if (a < c)
                System.out.println(a + " " + c);
            else
                System.out.println(c + " " + a);
        } else {
            System.out.print(c + " ");
            if (a < b)
                System.out.println(a + " " + b);
            else
                System.out.println(b + " " + a);
        }
    }
}