package Java.Cycle1;
import java.util.Scanner;

public class Matrix_Addition {
    public static void main(String[] args) {
        Scanner SC=new Scanner(System.in);

        int m,n,i,j;
        System.out.print("Enter Matrix Size (MxN) : ");
        m=SC.nextInt();
        n=SC.nextInt();
        int M1[][]=new int [m][n];
        int M2[][]=new int [m][n];
        int M3[][]=new int [m][n];
        System.out.print("Enter Matrix 1 : ");
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                M1[i][j]=SC.nextInt();
            }
        }
        System.out.print("Enter Matrix 2 : ");
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                M2[i][j]=SC.nextInt();
            }
        }
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                M3[i][j]=M1[i][j]+M2[i][j];
            }
        }
        System.out.println("Matrix Sum");
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                System.out.print(M3[i][j]+"  ");;
            }
            System.out.println();
        }
        SC.close();
    }
}
