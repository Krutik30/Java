abstract class Figure {
    double dim1;
    double dim2;

    Figure(double a, double b) {
        dim1 = a;
        dim2 = b;
    }

    abstract double area(); // area is now an abstract method
}

class Rectangle extends Figure {
    Rectangle(double a, double b) {
        super(a, b);
    }

    // override area for rectangle
    double area() {
        System.out.println("Inside Area for Rectangle.");
        return dim1 * dim2;
    }
}

class Triangle extends Figure {
    Triangle(double a, double b) {
        super(a, b);
    }

    // override area for right triangle
    double area() {
        System.out.println("Inside Area for Triangle.");
        return dim1 * dim2 / 2;
    }
}

class p43 {
    public static void main(String args[]) {
        Rectangle r = new Rectangle(10, 20);
        Triangle t = new Triangle(5, 30);

        Figure ref; // this is OK, no object is created
        ref = r;
        System.out.println("Area is " + ref.area());

        ref = t;
        System.out.println("Area is " + ref.area());
    }
}