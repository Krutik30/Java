import java.util.*;
import java.io.*;

public class exp {

    static int isNum(String s){
        int ans = Integer.parseInt(s);
        return ans;
    }

    static int isOp(String s ,int[] arr){
        char c = s.charAt(0);
        int ans = 0;
        switch (c) {
            case '+':
                ans = arr[0] + arr[1];
                break;
            case '-':
                ans = arr[0] - arr[1];
                break;
            case '*':
                ans = arr[0] * arr[1];
                break;
            case '/':
                ans = arr[0] / arr[1];
                break;
            default:
                System.out.println("Invalid Operator");
                break;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[2];
        int c = 0 , ans = 0;
        for(int i=0;i<args.length;i++){
            if(args[i].charAt(0) >= '0' && args[i].charAt(0) <= '9'){
                arr[c++] = isNum(args[i]);
            }
        }
        for(int i=0;i<args.length;i++){
            if(args[i].charAt(0) >= '0' && args[i].charAt(0) <= '9')
                continue;
            else{
                ans = isOp(args[i] , arr);
                break;
            }
        }
        System.out.println(ans);
    }
}
