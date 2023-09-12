import java.util.Scanner;

public class FactorialRec {
    public static int Factorial(int n){
        if(n==0 || n ==1){
            return 1;
        }
        else{
            return n*Factorial(n-1);
        }
    }

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.print("Enter A Number : ");
        int n = SC.nextInt();
        int res=Factorial(n);
        System.out.println(n+"! = "+res);
        SC.close();
    }
}
