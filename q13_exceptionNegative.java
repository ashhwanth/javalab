import java.util.*;

class calculate {
    void calculates(int n) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[n];
        int num, sum = 0;
        for(int i = 0; i < n; i++) {
            System.out.printf("Enter element %d: ", (i+1));
            num = sc.nextInt();
            if(num < 0){
                try {
                    throw new Exception();

                } catch (Exception e) {
                    System.out.println("Cannot insert a negative number.");
                }
                i--;
            }else {
                arr[i] = num;
                sum = sum + arr[i];
            }
        }
        System.out.printf("Average of %d numbers is %d", n ,(sum/n));
    }
}

public class q13_exceptionNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        calculate cal = new calculate();
        System.out.println("Enter the limit: ");
        int n = sc.nextInt();
        cal.calculates(n);
    }
}
