import java.util.Scanner;
import java.util.HashSet;
public class HashSetTest {
    public static void main(String[] args) {
        HashSet <String> HS = new HashSet<>();
        Scanner SC = new Scanner(System.in);
        System.out.println("HashSet Operations");
        System.out.println("----------------");
        System.out.println("[1] Add\n[2] Remove\n[3] Check Present or not?\n[4] Size\n[5] Display\n[6] Quit");
        int op=0;
        do{
            System.out.print("Enter an Option : ");
            op = SC.nextInt();
            switch(op){
                case 1:
                    System.out.print("Enter Element to Add : ");
                    String item = SC.next();
                    HS.add(item);
                    break;
                case 2:
                    System.out.print("Enter Element to Remove : ");
                    String item2 =SC.next();
                    HS.remove(item2);
                    System.out.println(item2+" Removed");
                    break;
                case 3:
                    System.out.print("Enter Element to Search : ");
                    String item3 =SC.next();
                    System.out.println(HS.contains(item3));
                    break;
                case 4:
                    System.out.println(HS.size());
                    break;
                case 5:
                    System.out.println(HS);
                    break;
                case 6:
                    System.out.println("Quitting....");
                    break;
                default:
                    System.out.println("Invalid Selection!!");
                    break;
            }
        }while(op!=6);
        SC.close();

    }    
}
