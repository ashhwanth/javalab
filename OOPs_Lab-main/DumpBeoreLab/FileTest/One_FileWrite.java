import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class One_FileWrite{
    public static void main(String[] args){
        String Filename = "Output.txt";
        Scanner SC = new Scanner(System.in);
        int op=0;
        System.out.println("File Write!!\n[1] Provide String to Write\n[2] Quit");
        do{
            System.out.print("Enter an Option : ");
            op = SC.nextInt();
            switch(op){
                case 1:
                    System.out.print("Enter A String : ");
                    String text = SC.next();
                    try{
                        BufferedWriter writer = new BufferedWriter(new FileWriter(Filename,true));
                        // FileWriter writer = new FileWriter(Filename,true);
                        writer.write(text+"\n");

                        writer.close();
                    } catch(IOException e){
                        e.printStackTrace();
                    } 
                    break;
                case 2:
                    System.out.println("Quitting....");
                    break;
                default:
                    System.out.println("Invalid Selection");
                    break;
                }
        }while(op!=2);
        SC.close();
    }
}