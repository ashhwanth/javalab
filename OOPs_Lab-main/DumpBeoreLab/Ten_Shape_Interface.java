import java.util.Scanner;

interface Shape {
    void Area();
    void Perimeter();
}

class Circle implements Shape {
    public void Area() {
        Scanner SC = new Scanner(System.in);
        System.out.print("Enter Radius : ");
        double r = SC.nextDouble();
        System.out.println("Area of Circle : " + (3.14 * r * r));
    }

    public void Perimeter() {
        Scanner SC = new Scanner(System.in);
        System.out.print("Enter Radius : ");
        double r = SC.nextDouble();
        System.out.println("Perimeter of Circle : " + (2 * 3.14 * r));
    }
}

class Rectangle implements Shape {
    public void Area() {
        Scanner SC = new Scanner(System.in);
        System.out.print("Enter Length : ");
        int l = SC.nextInt();
        System.out.print("Enter Breadth : ");
        int b = SC.nextInt();
        System.out.println("Area of Rectangle : " + (l * b));
    }

    public void Perimeter() {
        Scanner SC = new Scanner(System.in);
        System.out.print("Enter Length : ");
        int l = SC.nextInt();
        System.out.print("Enter Breadth : ");
        int b = SC.nextInt();
        System.out.println("Perimeter of Rectangle : " + (2 * (l + b)));
    }
}

public class Ten_Shape_Interface {
    public static void main(String[] args) {
        Circle C1 = new Circle();
        Rectangle R1 = new Rectangle();
        Scanner SC = new Scanner(System.in);
        int op;
        System.out.println("Area & Perimeter");
        System.out.println("----------------");
        System.out.print("[1] Circle Area\n[2] Circle Perimeter\n[3] Rectangle Area\n[4] Rectangle Perimeter\n[5] Quit");
        do {
            System.out.print("Select an Option : ");
            op = SC.nextInt();
            switch (op) {
                case 1:
                    C1.Area();
                    break;
                case 2:
                    C1.Perimeter();
                    break;
                case 3:
                    R1.Area();
                    break;
                case 4:
                    R1.Perimeter();
                    break;
                case 5:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid Selection");
            }
        } while (op != 5);
    }
}
