import java.util.Scanner;
import java.io.*;

public class FileCopyUDYP {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.print("Enter File to Copy : ");
        String file1 = SC.next();
        System.out.print("Enter New File Name : ");
        String file2 = SC.next();
        try(BufferedReader reader = new BufferedReader(new FileReader (file1));
            BufferedWriter writer = new BufferedWriter(new FileWriter (file2,true))){
                String line;
                while((line=reader.readLine()) != null){
                    writer.write(line+"\n");
                }
                writer.close();
        }catch (IOException e){
            e.printStackTrace();
        }
        SC.close();
    }
}
