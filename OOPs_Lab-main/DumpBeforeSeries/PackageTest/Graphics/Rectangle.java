package Java.Cycle1.DumpBeforeSeries.PackageTest.Graphics;

public class Rectangle implements Shape {
    int l,b;
    public Rectangle(int l,int b){
        this.l=l;
        this.b=b;
    }
    public double area(){
        return l*b;
    }
}
