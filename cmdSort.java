import java.util.Arrays;
import java.util.Scanner;

public class cmdSort {
    public static void main(String arg[]){

        int[] arr = new int[arg.length];

        for(int i=0;i<arg.length;i++){
            arr[i] = Integer.parseInt(arg[i]);
        }

        Arrays.sort(arr);

        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i] + " ");
    }
}
