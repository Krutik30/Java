import java.util.*;

public class p81 {
    static final int N = 50000;

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++)
            list.add(i);
        Collection<Integer> set1 = new HashSet<>(list);
        System.out.println("Test time for hash set is " + getTestTime(set1) + " ms");
        System.out.println("Remove element time for hash set is " +
                getRemoveTime(set1) + " ms");
        Collection<Integer> set3 = new TreeSet<>(list);
        System.out.println("Test time for tree set is " + getTestTime(set3) + " ms");
        System.out.println("Remove element time for tree set is " +
                getRemoveTime(set3) + " ms");
        Collection<Integer> list1 = new ArrayList<>(list);
        System.out.println("Test time for array list is " + getTestTime(list1) + " ms");
        System.out.println("Remove element time for array list is " +
                getRemoveTime(list1) + " ms");
        Collection<Integer> list2 = new LinkedList<>(list);
        System.out.println("Test time for linked list is " + getTestTime(list2) + " ms");
        System.out.println("Remove element time for linked list is " +
                getRemoveTime(list2) + " ms");
    }

    public static long getTestTime(Collection<Integer> c) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < N; i++)
            c.contains((int) (Math.random() * 2 * N));
        return System.currentTimeMillis() - startTime;
    }

    public static long getRemoveTime(Collection<Integer> c) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < N; i++)
            c.remove(i);
        return System.currentTimeMillis() - startTime;
    }
}
