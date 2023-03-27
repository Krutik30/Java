import java.util.*;

class sort{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int a , b, c;
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();

        if(a < b && b < c){
            System.out.println(a+" ");
            if(b < c)
                System.out.println(b + " " + c);
            else
                System.out.println(c+" "+b);
        }else if(b < c && b < a){
            System.out.println(b+" ");
            if(a < c)
                System.out.println(a + " " + c);
            else
                System.out.println(c+" "+a);
        }
        else{
            System.out.println(c+" ");
            if(a < b)
                System.out.println(a + " " + b);
            else
                System.out.println(a+" "+a);
        }
    }
}