public class p52 {
    public static void main(String[] args) {
        try {
            a();
        } finally {
            System.out.println("Mains finally");
        }
    }

    public static void a() {
        try {
            b();
        } finally {
            System.out.println("a's finally");
        }
    }

    public static void b() {
        try {
            c();
        } catch (Exception e) {
            System.out.println("Exception caught by b");
        } finally {
            System.out.println("b's finally");
        }
    }

    public static void c() {
        try {
            d();
            throw new ArithmeticException("c Throws Arithmetic Exception");
        } finally {
            System.out.println("c's finally");
        }
    }

    public static void d() {
        try {
            int arr[] = new int[3];
            arr[10] = 3;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("IndexOutOfBoundException of d");
        } finally {
            System.out.println("d's finally");
        }
    }
}