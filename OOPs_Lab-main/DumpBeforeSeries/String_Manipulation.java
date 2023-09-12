package Java.Cycle1;
import java.util.Scanner;

public class String_Manipulation {
    public static void main(String[] args) {
        Scanner SC=new Scanner(System.in);
        System.out.print("Enter String 1 : ");
        String str1=SC.next();
        System.out.println("String Length : "+str1.length());
        System.out.println("UpperCase : "+str1.toUpperCase());
        System.out.println("LowerCase : "+str1.toLowerCase());
        System.out.println("1st Letter : "+str1.charAt(0));
        System.out.print("Enter String 2 : ");
        String str2=SC.next();
        String str3=str1.concat(" ").concat(str2);
        System.out.print("Concatinated String : "+str3);

    }
}
