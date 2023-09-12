package Java.Cycle1.DumpBeforeSeries;
import java.util.Scanner;

interface Shape {
    void getData();
    void area();
    void perimeter();
}

class Circle implements Shape {
    double r;

    // @Override
    public void getData() {
        Scanner SC = new Scanner(System.in);
        System.out.print("Enter Radius : ");
        r = SC.nextDouble();
    }

    // @Override
    public void area() { //always declare publically and Don't use parameters
        System.out.println("Area of Circle : " + (3.14 * r * r));
    }

    // @Override
    public void perimeter() {
        System.out.println("Perimeter of Circle : " + (2 * 3.14 * r));
    }
}

class Rectangle implements Shape {
    int l,b;

    // @Override
    public void getData() {
        Scanner SC = new Scanner(System.in);
        System.out.print("Enter Length and Breadth : ");
        l = SC.nextInt();
        b = SC.nextInt();
    }

    // @Override
    public void area() {
        System.out.println("Area of Rectangle : " + (l*b));
    }

    // @Override
    public void perimeter() {
        System.out.println("Perimeter of Rectangle : "+(2*(l+b)));
    }
}

public class Area_Perimeter_Interface {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Rectangle rec = new Rectangle();
        circle.getData();
        rec.getData();
        circle.area();
        circle.perimeter();
        rec.area();
        rec.perimeter();
    }
}
