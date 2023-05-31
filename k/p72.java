import java.util.*;
import java.util.stream.*;

public class p72 {
    public static void main(String[] args) {
        // Creation
        ArrayList<Integer> arr = new ArrayList<>();
        LinkedList<Integer> list = new LinkedList<>();
        // Basic Operations.
        for (int i = 0; i < 10; i++) {
            arr.add(i);
            list.add(i);
        }
        System.out.println("After insertion Arraylist and LinkedList is : ");
        System.out.println("ArrayList : " + arr);
        System.out.println("LinkedList : " + list);
        arr.remove(5);
        list.remove(5);
        System.out.println("After removal Arraylist and LinkedList is : ");
        System.out.println("ArrayList : " + arr);
        System.out.println("LinkedList : " + list);
        arr.set(2, 3);
        list.set(2, 3);
        System.out.println("After updation Arraylist and LinkedList is : ");
        System.out.println("ArrayList : " + arr);
        System.out.println("LinkedList : " + list);
        // Iterating over list
        System.out.println("Iteration of ArrayList : ");
        for (Integer iterable_element : arr) {
            System.out.print(iterable_element + " ");
        }
        System.out.println();
        System.out.println("Iteration of LinkedList : ");
        for (Integer iterable_element : list) {
            System.out.print(iterable_element + " ");
        }
        System.out.println();
        // Searching For element.
        System.out.println("Search for 3 in Arraylist : " + arr.contains(3));
        System.out.println("Search for 3 in LinkedList : " + list.contains(3));
        System.out.println("Search for 5 in Arraylist : " + arr.contains(5));
        System.out.println("Search for 5 in LinkedList : " + list.contains(5));
        // shuffling elements of list
        Collections.shuffle(arr);
        Collections.shuffle(list);
        System.out.println("After shuffling Arraylist and LinkedList is : ");
        System.out.println("ArrayList : " + arr);
        System.out.println("LinkedList : " + list);
        // sorting elements of list
        Collections.sort(arr);
        Collections.sort(list);
        System.out.println("After shuffling Arraylist and LinkedList is : ");
        System.out.println("ArrayList : " + arr);
        System.out.println("LinkedList : " + list);
        // Copying one list to another.
        ArrayList<Integer> arr1 = new ArrayList<>(arr);
        LinkedList<Integer> list1 = new LinkedList<>(list);
        System.out.println("Coppied Arraylist and LinkedList is : ");
        System.out.println("ArrayList : " + arr1);
        System.out.println("LinkedList : " + list1);
        // reversing elements of list
        Collections.reverse(arr);
        Collections.reverse(list);
        System.out.println("After shuffling Arraylist and LinkedList is : ");
        System.out.println("ArrayList : " + arr);
        System.out.println("LinkedList : " + list);
        System.out.println("After shuffling Arraylist and LinkedList is : ");
        System.out.println("ArrayList : " + arr.subList(3, 7));
        System.out.println("LinkedList : " + list.subList(3, 7));
        // Converting between Lists and arrays
        Integer strs[] = new Integer[arr.size()];
        arr.toArray(strs);
        System.out.println("ArrayList to array");
        for (int i = 0; i < strs.length; i++) {
            System.out.print(strs[i] + " ");
        }
        System.out.println();
        strs = new Integer[list.size()];
        list.toArray(strs);
        System.out.println("LinkedList to array");
        for (int i = 0; i < strs.length; i++) {
            System.out.print(strs[i] + " ");
        }
        System.out.println();
        // Converting List to String
        System.out.println("ArrayList to string " + arr.toString());
        System.out.println("LinkedList to string " + list.toString());
    }
}
