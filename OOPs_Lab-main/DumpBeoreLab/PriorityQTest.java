import java.util.Scanner;
import java.util.PriorityQueue;

public class PriorityQTest {
    public static void main(String[] args) {
        PriorityQueue <Integer> PQ = new PriorityQueue<>();
        Scanner SC = new Scanner(System.in);
        System.out.println("PriorityQueue Operations");
        System.out.println("----------------");
        System.out.println("[1] Enqueue\n[2] Dequeue\n[3] Peek - Highest Priority\n[4] Empty?\n[5] Size\n[6] Display\n[7] Quit");
        int op=0;
        do{
            System.out.print("Enter an Option : ");
            op = SC.nextInt();
            switch(op){
                case 1:
                    System.out.print("Enter Element to Add : ");
                    int item = SC.nextInt();
                    PQ.add(item);
                    // PQ.offer(item);
                    break;
                case 2:
                    int item2 =PQ.poll();
                    System.out.printf("%d Polled [Removed]\n",item2);
                    break;
                case 3:
                    System.out.println(PQ.peek());
                    break;
                case 4:
                    System.out.println(PQ.isEmpty());
                    break;
                case 5:
                    System.out.println(PQ.size());
                    break;
                case 6:
                    System.out.println(PQ);
                    break;
                case 7:
                    System.out.println("Quitting....");
                    break;
                default:
                    System.out.println("Invalid Selection!!");
                    break;
            }
        }while(op!=7);
        SC.close();

    }    
}
