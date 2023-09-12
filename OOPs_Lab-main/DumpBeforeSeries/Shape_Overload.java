package Java.Cycle1.DumpBeforeSeries;
import java.util.Scanner;

public class Shape_Overload {
    void area(int a){
        System.out.print("\nArea of Square: " + (a * a));
    }
    void area(double r){
        System.out.print("\nArea of Circle: " + (3.14 * r * r));
    }
    void area(int b, int h){
        System.out.print("\nArea of Triangle: " + (0.5 * b * h));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Side of Square: ");
        int a = sc.nextInt();
        System.out.print("Enter Radius of Circle: ");
        double r = sc.nextDouble();
        System.out.print("Enter Base and Height of Triangle: ");
        int b = sc.nextInt();
        int h = sc.nextInt();
        sc.close();

        Shape_Overload obj1 = new Shape_Overload();
        obj1.area(a);
        obj1.area(r);
        obj1.area(b, h);
    }
}
