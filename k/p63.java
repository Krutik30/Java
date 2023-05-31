import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Thread1 extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                System.out.println("T1 working...");
                Thread.sleep(200);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class Thread2 extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                System.out.println("T2 working...");
                Thread.sleep(200);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class Thread3 extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                System.out.println("T3 working...");
                Thread.sleep(200);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class Thread4 extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                System.out.println("T4 working...");
                Thread.sleep(200);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class p63 {
    public static void main(String[] range) throws Exception {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        Thread3 t3 = new Thread3();
        Thread4 t4 = new Thread4();
        ExecutorService pool = Executors.newFixedThreadPool(2);
        pool.execute(t1);
        pool.execute(t2);
        pool.execute(t3);
        pool.execute(t4);
        pool.shutdown();
    }
}
