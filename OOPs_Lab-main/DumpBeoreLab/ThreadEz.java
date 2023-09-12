import java.util.Scanner;

class Odd implements Runnable{
    int n;
    public Odd(int n){
        this.n=n;
    }
    public void run(){
        for(int i=1;i<n;i++){
            if(i%2!=0){
            System.out.println("Odd Number\t: "+i);
            }
        }
    }
}

class Even implements Runnable{
    int n;
    public Even(int n){
        this.n=n;
    }
    public void run(){
        for(int i=1;i<n;i++){
            if(i%2==0){
            System.out.println("Even Number\t: "+i);
            }
        }
    }
}

public class ThreadEz {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.print("Enter A Number : ");
        int n=SC.nextInt();
        Thread T1 = new Thread(new Odd(n));
        Thread T2 = new Thread(new Even(n));

        T1.start();
        T2.start();

        SC.close();
    }
}
