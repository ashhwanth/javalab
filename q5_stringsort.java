import java.util.*;
public class q5_stringsort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of strings: ");
        int n = sc.nextInt();
        String str[] = new String[n];
        System.out.println("Enter the elements: ");
        for(int i = 0; i<n; i++) {
            str[i] = sc.next();
        }
        String strsorted[] = new String[n];
        for(int i = 0; i<n; i++) {
            strsorted[i] = str[i];
        }
        System.out.println("Before Sorting: ");
        for(int i = 0; i<n; i++) {
            System.out.println(str[i] + "\t");
        }
        Arrays.sort(strsorted);
        System.out.println("After Sorting: ");
        for(int i = 0; i<n; i++) {
            System.out.print(strsorted[i] + "\t");
        }
    }    
}
