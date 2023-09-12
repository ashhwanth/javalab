package ThreadTest.Functions;

public class FibonacciThread implements Runnable{
    int n;
    public FibonacciThread(int n){
        this.n=n;
    }
    public void run(){
        int a=0,b=1;
        while(a<n){
            System.out.println("Fib --\t"+a);
            int c=a+b;
            a=b;
            b=c;
        }
    }
}
