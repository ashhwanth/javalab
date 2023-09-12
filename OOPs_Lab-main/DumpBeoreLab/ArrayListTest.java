import java.util.Scanner;
import java.util.ArrayList;
// import java.util.Collections;

public class ArrayListTest {
   public static void main(String[] args) {
    ArrayList <Integer> Num = new ArrayList<>();
    Scanner SC = new Scanner(System.in);
    System.out.print("Enter No of Elements : ");
    int n = SC.nextInt();
    System.out.print("Enter Elements : ");
    for (int i=0;i<n; i++){
        int data=SC.nextInt();
        Num.add(data);
    }
    System.out.println("Before Sorting\t: "+Num);
    // Collections.sort(Num);
    Num.sort(null);
    System.out.println("After Sorting\t: "+ Num);
    SC.close();
   } 
}
