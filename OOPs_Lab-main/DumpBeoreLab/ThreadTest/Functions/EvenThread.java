package ThreadTest.Functions;

public class EvenThread implements Runnable {
    int a,b;
    public EvenThread (int a,int b){
        this.a=a;
        this.b=b;
    }
    public void run(){
        for (int i=a;i<=b;i++){
            if(i%2==0){
                System.out.println("Even --\t"+i);
            }
        }
    }
}
