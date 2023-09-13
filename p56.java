import java.util.Scanner;
import java.lang.Math;

class NumberFormatException extends Exception{
    String bit;
    NumberFormatException(String bit){
        this.bit = bit;    
    }
    public String returnString(){
        return bit+" is neither 0 nor 1";
    }
}
public class p56 {
    public static void ThrowNumberFormatException(String bit) throws NumberFormatException{
    for(int i=0; i<bit.length(); i++){
        if(bit.charAt(i) > '1' || bit.charAt(i) < '0'){
                throw new NumberFormatException(bit);
            }
        }
    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Enter the binaryString : ");
            String bit = sc.next();
            ThrowNumberFormatException(bit);
            int sum=0;
            for(int i=0; i<bit.length(); i++){
                int num = bit.charAt(i) - '0';
                sum += Math.pow(2, (bit.length()-1-i)) * num;
            }
            System.out.println("The decimal value of input binaryString is : "+sum);
        }
        catch(NumberFormatException e){
            System.out.println("The entered string is not binary string.");
        }
        sc.close();
    }
}
