import java.util.Scanner;

class ErrorLogin extends Exception{
    public ErrorLogin(String msg){
        super(msg);
    }
}

public class Login_Exception {
    public static void main(String[] args){
        String Uname,Pwd,LUname,LPwd;
        Scanner SC = new Scanner(System.in);
        System.out.print("Enter Username : ");
        Uname=SC.next();
        System.out.print("Enter Password : ");
        Pwd=SC.next();
        try{
            System.out.print("Enter Login Username : ");
            LUname=SC.next();
            System.out.print("Enter Login Password : ");
            LPwd=SC.next();
            if(!Uname.equals(LUname)){
                throw new ErrorLogin("Invalid Username");
            }
            if(!Pwd.equals(LPwd)){
                throw new ErrorLogin("Invalid Password");
            }
            System.out.println("Login Succesfull!");
        }
        catch (ErrorLogin e){
            System.out.println("Error in Login\n"+e.getMessage());
        }
    }
}
