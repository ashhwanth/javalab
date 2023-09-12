import java.util.*;

public class q15_stack {
    public static void main(String[] args) {
        Stack <String> stack = new Stack<String>();
        Scanner sc = new Scanner(System.in);
        int ch;
        String el;
        do{
            System.out.println("Enter Choice \n1.Push\n2.Pop\n3.Display\n4.Enter 0 to Exit");
            ch = sc.nextInt();
            sc.nextLine();
            switch(ch) {
                case 1:{
                    System.out.println("Enter element to insert: ");
                    el = sc.nextLine();
                    stack.push(el);
                    break;
                }
                case 2:{
                    String poppedElement = stack.pop();
                    System.out.println("Popped Element is: " + poppedElement);
                    break;
                }
                case 3:{
                    System.out.println("Stack: " + stack);
                    break;
                }
                case 4: break;
            }
        }while(ch!=0);
    }
}
