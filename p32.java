import java.lang.reflect.Constructor;
import java.util.*;

class box{
        double length = 0;
        double width = 0;

        box(double length){
            this.length = length;
        }

        box(double length , double width){
            this.length = length;
            this.width = width;
        }
        
        double area(){
            if(width == 0)
                return length*length;
            else
                return length*width;
        }
}

class p32 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        box b1 = new box(6,9);
        System.out.println(b1.area());
        box b2 = new box(6);
        System.out.println(b2.area());

    }
}