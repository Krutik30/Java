
public class p61 {
    public static void main(String[] args) {
        Prime p1 = new Prime(0, 100);
        Thread t1 = new Thread(p1);
        t1.start();
        Prime p2 = new Prime(100, 200);
        Thread t2 = new Thread(p2);
        t2.start();
    }
}

class Prime implements Runnable {
    int lower;
    int upper;

    Prime(int lower, int upper) {
        this.lower = lower;
        this.upper = upper;
    }

    public void run() {
        String a = " ";
        for (int i = lower; i <= upper; i++)
            if (isPrime(i))
                a = a + i + " ";
        System.out.println(a);
    }

    static boolean isPrime(int n) {
        if (n < 2)
            return false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
