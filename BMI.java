import java.util.*;

class BMI {
    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);

        float pound = scan.nextFloat();
        float inch = scan.nextFloat();

        double kg = pound*0.45359237;
        double meter = inch*0.254;
        double bmi = kg/(meter*meter);
        System.out.println("Your BMI : "+bmi);
    }
}