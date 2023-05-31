import java.util.concurrent.*;
import java.util.concurrent.locks.*;

public class p64 {
    private static Buffer buf = new Buffer();

    public static void main(String[] args) {
        ExecutorService ex = Executors.newFixedThreadPool(2);
        ex.execute(new Producer());
        ex.execute(new Consumer());
        ex.shutdown();
    }

    private static class Producer implements Runnable {
        public void run() {
            try {
                int i = 1, count = 0;
                while (count < 5) { // or use true for infinite loop
                    System.out.println("Producer produces: " + i);
                    buf.write(i++);
                    Thread.sleep((int) (Math.random() * 1000));
                    count++;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static class Consumer implements Runnable {
        public void run() {
            try {
                int count = 0;
                while (count < 5) {
                    System.out.println("\t\tConsumer consumes: " + buf.read());
                    Thread.sleep((int) (Math.random() * 10000));
                    count++;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static class Buffer {
        private static final int CAPACITY = 2; // Buffer Size
        private java.util.LinkedList<Integer> queue = new java.util.LinkedList<>();
        private static Lock loc = new ReentrantLock();
        private static Condition notEmpty = loc.newCondition();
        private static Condition notFull = loc.newCondition();

        public void write(int data) {
            loc.lock();
            try {
                while (queue.size() == CAPACITY) {
                    System.out.println("Wait! Buffer is full!");
                    notFull.await();
                }
                queue.offer(data);
                notEmpty.signal();// not empty bcoz write is done
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                loc.unlock();
            }
        }

        public int read() {
            int data = 0;
            loc.lock();
            try {
                while (queue.isEmpty()) {
                    System.out.println("\t\tWait! Buffer is empty");
                    notEmpty.await();
                }
                data = queue.remove();
                notFull.signal();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                loc.unlock();
                return data;
            }
        }
    }
}
