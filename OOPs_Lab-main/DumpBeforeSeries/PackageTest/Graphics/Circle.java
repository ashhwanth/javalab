package Java.Cycle1.DumpBeforeSeries.PackageTest.Graphics;

public class Circle implements Shape{
    double r;
    public Circle(double r){
        this.r=r;
    }
    public double area(){
        return (3.14*r*r);
    }
}
