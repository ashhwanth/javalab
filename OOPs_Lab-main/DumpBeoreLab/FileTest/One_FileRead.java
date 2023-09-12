import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class One_FileRead {
   public static void main(String[] args) {
    Scanner SC = new Scanner(System.in);
    System.out.print("Enter File Name : ");
    String file = SC.next();
    try(BufferedReader reader = new BufferedReader(new FileReader(file))){
        String line;
        while((line=reader.readLine()) != null){
            System.out.println(line);
        }
    }catch (IOException e){
        e.printStackTrace();
    }
    SC.close();
   } 
}
