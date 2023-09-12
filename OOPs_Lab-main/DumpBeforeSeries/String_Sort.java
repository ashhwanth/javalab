package Java.Cycle1;
import java.util.Scanner;

public class String_Sort {
    public static void main(String[] args) {
        Scanner SC=new Scanner(System.in);
        int n,i,j;
        String temp;
        System.out.print("Enter No of Strings : ");
        n=SC.nextInt();
        String list[] = new String[n];
        System.out.print("Enter Strings : ");
        for (i=0;i<n;i++){
            list[i]=SC.next();
        }
        for (i = 0; i < n - 1; i++) {
            for (j = i + 1; j < n; j++) {
                if (list[i].compareTo(list[j]) > 0) {
                    temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
        }
        System.out.print("Sorted Strings : ");
        for (i=0;i<n;i++){
            System.out.print(list[i]+" ");
        }
    }
}
