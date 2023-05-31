import java.util.*;

class p77 {
    static <E extends Comparable<E>> void sort(E[] a) {
        E temp;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j].compareTo(a[j + 1]) > 0) { // < for Decending
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Integer[] arint = { 1, 2, 3, 5, 7, 6, 10, 11, 9, 8 };
        Double[] ardob = { 1.21, 32.3, 12.1, 4.2345, 13.35, 1.02 };
        Character[] archar = { 'd', 'w', 'p', 'a', 'c', 'k' };
        String[] arstr = { "Zom", "Pound", "Dollor", "Bound", "Chocolate" };
        sort(arint);
        sort(ardob);
        sort(archar);
        sort(arstr);
        for (int i = 0; i < 10; i++)
            System.out.print(arint[i] + " ");
        System.out.println();
        for (int i = 0; i < 6; i++)
            System.out.print(ardob[i] + " ");
        System.out.println();
        for (int i = 0; i < 6; i++)
            System.out.print(archar[i] + " ");
        System.out.println();
        for (int i = 0; i < 5; i++)
            System.out.print(arstr[i] + " ");
    }
}
