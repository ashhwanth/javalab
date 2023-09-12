import java.util.Scanner;

public class Arithmetic_Exception{
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.print("Enter A Numerator : ");
        int n = SC.nextInt();
        System.out.print("Enter A Denominator : ");
        int d = SC.nextInt();
        try{
            int res = n/d;
            System.out.println("Division : "+res);
        }
        catch (ArithmeticException e){
            System.out.println("Division not Possible due to Error : "+e.getMessage());
        }
    }
}