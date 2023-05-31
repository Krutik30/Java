import java.util.InputMismatchException;
import java.util.Scanner;

public class p54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array : ");
        int n = sc.nextInt();
        int array[] = new int[n];
        try {
            System.out.print("Enter values in the array : ");
            for (int i = 0; i < n; i++) {
                array[i] = sc.nextInt();
            }
            System.out.print("Enter the index to split array from : ");
            int index = sc.nextInt();
            try {
                int arr1[] = new int[n], arr2[] = new int[n];

                for (int i = 0; i < index; i++) {
                    arr1[i] = array[i];
                }
                int j = 0;
                for (int i = index; i < n; i++) {
                    arr2[j] = array[i];
                    j++;
                }

                System.out.print("Arr1 is :");
                for (int i = 0; i < arr1.length; i++) {
                    System.out.print(" " + arr1[i]);
                }
                System.out.println();
                System.out.print("Arr2 is :");
                for (int i = 0; i < arr2.length; i++) {
                    System.out.print(" " + arr2[i]);
                }
                System.out.println();
            } catch (IndexOutOfBoundsException e1) {
                System.out.println("Enter valid index to split the array!! " + e1);
            }
        } catch (InputMismatchException e2) {
            System.out.println("Enter valid values in the array!! " + e2);
        }
        sc.close();
    }
}