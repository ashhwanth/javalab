package Java.Cycle1.DumpBeforeSeries.PackageTest;
import Java.Cycle1.DumpBeforeSeries.PackageTest.Graphics.*;

public class ShapeDriver {
    public static void main(String[] args) {
        Shape circle = new Circle(10);
        System.out.println("Area of Circle with Radius 10 : "+circle.area());
        Shape rec = new Rectangle(10, 5);
        System.out.println("Area of Rectangle with Length 10 and Breadth 5 : "+rec.area());
    }
}
