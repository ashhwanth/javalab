import java.util.*;
public class q2_matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows of matrix:");
        int r = sc.nextInt();
        System.out.println("Enter cols of matrix: ");
        int c = sc.nextInt();
        int a[][] = new int[r][c];
        int b[][] = new int[r][c];
        int sum[][] = new int[r][c];
        System.out.println("Enter elements to matrix 1: ");
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter elements to matrix 2: ");
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        System.out.println("Matrix after addition is: ");
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++) {
                System.out.print(sum[i][j] + "\t");
            }
        }
    }
    
}
