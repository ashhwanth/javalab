package Java.Cycle1;
import java.util.Scanner;

public class Complex_Addition {
    int r,i;
    void data(){
        Scanner SC =new Scanner(System.in);
        System.out.print("Enter Real Part : ");
        r=SC.nextInt();
        System.out.print("Enter Imaginary Part : ");
        i=SC.nextInt();
        // SC.close();
    }
    void display(){
        System.out.println(r+" + "+i+"i");
    }
    public static void main(String[] args) {
        Complex_Addition Obj1 = new Complex_Addition();
        Complex_Addition Obj2 = new Complex_Addition();
        Complex_Addition Obj3 = new Complex_Addition();

        Obj1.data();
        Obj2.data();
        Obj3.r=Obj1.r+Obj2.r;
        Obj3.i=Obj1.i+Obj2.i;

        Obj1.display();
        Obj2.display();
        System.out.println("After Addition");
        Obj3.display();
    }
}
