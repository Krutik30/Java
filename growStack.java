import java.util.*;

public class growStack{


    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[1];
        System.out.println("If you want to exit the loop press -1");
        System.out.println("Enter Your array values  : ");
        int c = 0;
        while(true){
            System.out.println("Value at Index " + c + " :");
            if(c == arr.length - 1){
                int[] temp = new int[2*arr.length];
                for(int i=0;i<arr.length;i++){
                    temp[i] = arr[i];
                }
                arr = temp;
            }
            arr[c] = scan.nextInt();
            if(arr[c] == -1)
                break;
            c++;

        }

        System.out.println("Your Array : ");
        for(int i=0;i<c;i++){
            System.out.print(arr[i] + " ");
        }
    }
}