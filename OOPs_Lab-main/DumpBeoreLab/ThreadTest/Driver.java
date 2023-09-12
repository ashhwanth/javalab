package ThreadTest;
import ThreadTest.Functions.*;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.print("Enter Fibonacci Limit : ");
        int n=SC.nextInt();
        System.out.print("Enter Lower Limit for Even Numbers : ");
        int a=SC.nextInt();
        System.out.print("Enter Upper Limit for Even Numbers : ");
        int b=SC.nextInt();
        Thread FibThread = new Thread(new FibonacciThread(n));
        Thread EveThread = new Thread(new EvenThread(a, b));
        FibThread.start();
        EveThread.start();
        SC.close();
    }
}
