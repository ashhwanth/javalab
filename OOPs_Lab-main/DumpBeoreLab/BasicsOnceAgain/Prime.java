import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.print("Enter A Number : ");
        int n = SC.nextInt();
        int flag=0;
        for(int i=2;i<n/2;i++){
            if(n%i==0){
                flag+=1;
                break;
            }
        }
        if(flag==0){
            System.out.println("Prime Number!");
        }
        else{
            System.out.println("Not a Prime Number!");
        }
        SC.close();
    }
}