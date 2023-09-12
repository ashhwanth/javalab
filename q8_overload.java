import java.util.*;

class overload {
    double area(float radius) {
        return 3.14*radius*radius;
    }
    int area(int side) {
        return side*side;
    }
    int area(int len, int bred) {
        return len*bred;
    }
}

public class q8_overload {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        overload obj = new overload();
        int ch;
        System.out.println("1.Area of Circle \n2.Area of Square \n3.Area of Rectangle \n0.Exit");
        do{
            System.out.println("Enter your choice: ");
            ch = sc.nextInt();
            switch(ch) {
                case 1:{
                    System.out.println("Enter the radius: ");
                    float radius = sc.nextFloat();
                    System.out.println("Area of circle is: " + obj.area(radius));
                    break;
                }
                case 2:{
                    System.out.println("Enter the side of the square: ");
                    int side = sc.nextInt();
                    System.out.println("Area of square is: " + obj.area(side));
                    break;
                }
                case 3:{
                    System.out.println("Enter the length and beadth of the rectangle: ");
                    int len = sc.nextInt();
                    int bred = sc.nextInt();
                    System.out.println("Area of rectangle is: " + obj.area(len, bred));
                    break;
                }
            }
        }while(ch!=0);
    }
}
