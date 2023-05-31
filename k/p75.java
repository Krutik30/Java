import java.util.PriorityQueue;

class MyPriorityQueue<E> extends PriorityQueue<E> implements Cloneable {
    @Override
    public Object clone() throws CloneNotSupportedException {
        MyPriorityQueue<E> clone = new MyPriorityQueue<>();
        this.forEach(clone::add);
        return clone;
    }
}

public class p75 {
    public static void main(String[] args) {
        MyPriorityQueue<String> queue = new MyPriorityQueue<>();
        queue.add("1");
        queue.add("2");
        queue.add("3");
        MyPriorityQueue<String> queue1 = null;
        try {
            queue1 = (MyPriorityQueue<String>) (queue.clone());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println("Cloned Priority Queue is : ");
        System.out.println(queue1);
    }
}