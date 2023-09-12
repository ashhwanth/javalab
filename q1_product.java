import java.util.*;
public class q1_product {
    String pcode, pname;
    int price;
    q1_product() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter product code: ");
        this.pcode = sc.nextLine();
        System.out.println("Enter product name: ");
        this.pname = sc.nextLine();
        System.out.println("Enter product price: ");
        this.price = sc.nextInt();
    }
    public static void main(String[] args) {
        System.out.println("Enter product 1 details: ");
        q1_product obj1 = new q1_product();
        System.out.println("Enter product 2 details: ");
        q1_product obj2 = new q1_product();
        System.out.println("Enter product 3 details: ");
        q1_product obj3 = new q1_product();

        if(obj1.price < obj2.price && obj1.price < obj2.price) {
            System.out.println("P1 is lowest");
        }
        else if(obj2.price < obj3.price && obj2.price < obj1.price) {
                System.out.println("P2 is lowest");
        } else {
            System.out.println("p3 is lowest");
        }

    }
}
