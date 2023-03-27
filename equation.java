import java.util.Scanner;

class equation{
    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        float a, b, c , p , q ,r;

        a = scan.nextFloat();
        b = scan.nextFloat();
        c = scan.nextFloat();
        p = scan.nextFloat();
        q = scan.nextFloat();
        r = scan.nextFloat();
        
        System.out.println("1st Equation : ("+a+")x + ("+b+")y = "+c);
        System.out.println("2nd Equation : ("+p+")x + ("+q+")y = "+r);

        float x = ((b*r)-(q*c))/((a*q)-(p*b));
        float y = ((a*r)-(p*c))/((a*q)-(p*b));

        System.out.println("x : "+x+"\ny : "+y);
    }
}