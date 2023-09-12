import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.print("Enter A Number : ");
        int n = SC.nextInt();
        int nCopy = n;
        int rem=0,rev=0;
        while(nCopy>0){
            rem=nCopy%10;
            nCopy=nCopy/10;
            rev=rev*10+rem;
        }
        if(n==rev){
            System.out.println("Palindrome Number!");
        }
        else{
            System.out.println("Not a Palindrome Number!");
        }
        SC.close();
    }
}
