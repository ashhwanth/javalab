import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.print("Enter Limit : ");
        int n = SC.nextInt();
        int a = 0;
        int b = 1;
        while(a<n){
            System.out.print(a+" ");
            int c=a+b;
            a=b;
            b=c;
        }
    }
}
