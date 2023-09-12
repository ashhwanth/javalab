import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.print("Enter A Number : ");
        int n = SC.nextInt();
        int len = Integer.toString(n).length();
        double sum=0;
        int nCopy = n;
        while(n>0){
            int digit=n%10;
            sum=sum+Math.pow((double)digit,(double)len);
            n=n/10;
        }
        if(nCopy==sum){
            System.out.println("Armstrong!");
        }
        else{
            System.out.println("Not Armstrong!");
        }
        SC.close();
    }
}
