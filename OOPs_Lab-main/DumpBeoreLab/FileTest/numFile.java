import java.util.Scanner;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class numFile {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.print("Enter File Name : ");
        String file=SC.next();
        ArrayList <Integer> num = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new FileReader(file));){
            String line;
            while((line=reader.readLine()) != null){
                try{
                    int intLine = Integer.parseInt(line);
                    num.add(intLine);
                }catch (NumberFormatException e){
                    System.out.println(line+" is Not a Number!");
                }

            }
        }catch (IOException e){
            System.out.println("--ERROR--");
        }
        System.out.println("Numbers in File : "+num);
        SC.close();
    }
}
