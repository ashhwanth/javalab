package Java.Cycle1;

public class Product_v2 {
    int pCode;
    String pName;
    double pPrice;

    Product_v2(int pCode,String pName,double pPrice){
        this.pCode=pCode;
        this.pName=pName;
        this.pPrice=pPrice;
    }
    
    void display() {
        System.out.println(pCode + "\t\t" + pName + "\t" + pPrice);
    }

    static void lowestPrice(double p1, double p2, double p3) {
        if (p1 < p2 && p2 < p3) {
            System.out.println("\nLowest Price is " + p1);
        } else if (p2 < p1 && p1 < p3) {
            System.out.println("\nLowest Price is " + p2);
        } else {
            System.out.println("\nLowest Price is " + p3);
        }
    }

    public static void main(String[] args) {
        Product_v2 Obj1 = new Product_v2(1, "Classmates", 60.0);
        Product_v2 Obj2 = new Product_v2(2, "PaperGrid", 50.0);
        Product_v2 Obj3 = new Product_v2(3, "Triveni", 40.0);

        System.out.println("Product Code\tName\t\tPrice");
        Obj1.display();
        Obj2.display();
        Obj3.display();
        lowestPrice(Obj1.pPrice, Obj2.pPrice, Obj3.pPrice);
    }
}
