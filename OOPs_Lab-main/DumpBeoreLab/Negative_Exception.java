import java.util.Scanner;

class NegEx extends Exception{
    public NegEx (String msg){
        super(msg);
    }
}

public class Negative_Exception {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.print("Enter No of Terms : ");
        int n = SC.nextInt();
        int list[] = new int[n];
        int sum =0;
        int count=0;
        System.out.print("Enter Elements : ");
        try{
            for(int i=0;i<n;i++){
                int num = SC.nextInt();
                if(num<0){
                    throw new NegEx("Negative Number");
                }
                else{
                    list[i]=num;
                    sum=sum+num;
                    count=count+1;
                }
            }
        }
        catch (NegEx e){
            System.out.println("Program Terminated due to "+e.getMessage());
        }
        if(count>0){
        System.out.println("Average : "+(sum/(double)count));
        }
        else{
            System.out.println("No Non-Negative Numbers Entered");
        }
    }
}
