package Java.Cycle1;
import java.util.Scanner;

public class Array_Sort {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        int n,temp,i,j;
        System.out.print("Enter Array Size : ");
        n=SC.nextInt();
        int a[] = new int[n];
        System.out.print("Enter Elements : ");
        for(i=0;i<n;i++){
            a[i]=SC.nextInt();
        }

        for(i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                if(a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }

        System.out.println("Sorted Array");
        for(i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        SC.close();
    }
}