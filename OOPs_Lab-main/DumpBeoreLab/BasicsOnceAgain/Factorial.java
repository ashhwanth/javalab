import java.util.Scanner;

public class Factorial {
    public static void main(String[] ooho){
        Scanner SC = new Scanner(System.in);
        System.out.print("Enter A Number : ");
        int n = SC.nextInt();
        int fact=1;
        int n1=n;
        while(n>0){
            fact=fact*n;
            n--;
        }
        System.out.println(n1+"! = "+fact);
        SC.close();
    }
}
