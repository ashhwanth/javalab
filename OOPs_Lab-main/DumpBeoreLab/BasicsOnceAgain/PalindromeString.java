import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter A String : ");
        String str=SC.next();
        String str2=str.trim().toLowerCase();
        int flag=0;
        int left=0;
        int right=(str2.length())-1;
        while(left<right){
            if(str2.charAt(left)!=str2.charAt(right)){
                flag+=1;
                break;
            }
            left++;
            right--;
        }
        if (flag==0){
            System.out.println("Palindrome!");
        }
        else{
            System.out.println("Not palindrome");
        }
        SC.close();
    }
}
