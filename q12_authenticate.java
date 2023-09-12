import java.util.*;

class validate {
    void validation(String user, String pass) {
        if(!user.equals("admin") || !pass.equals("123")){
            try {
                throw new Exception();
            } catch (Exception e) {
                System.out.println("Invalid Credentials!");
            }
        }else {
            System.out.println("Logged In Successfully!");
        }
    }
}

public class q12_authenticate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the username: ");
        String user = sc.nextLine();
        System.out.println("Enter the password: ");
        String pass = sc.nextLine();
        validate valid = new validate();
        valid.validation(user, pass);
    }
}
