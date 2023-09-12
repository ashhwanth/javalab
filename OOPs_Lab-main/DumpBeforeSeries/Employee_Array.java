package Java.Cycle1.DumpBeforeSeries;
import java.util.Scanner;

public class Employee_Array {
    int eNo;
    String eName;
    double eSalary;
    void getData(){
        Scanner SC = new Scanner(System.in);
        System.out.print("Enter Employee No : ");
        eNo = SC.nextInt();
        System.out.print("Enter Employee Name : ");
        eName = SC.next();
        System.out.print("Enter Employee Salary : ");
        eSalary = SC.nextDouble();
    }
    void display(){
        System.out.println("Employee No : "+eNo);
        System.out.println("Employee Name : "+eName);
        System.out.println("Employee Salary : "+eSalary);
    }

    public static void main(String[] args){
        Scanner SC = new Scanner(System.in);
        System.out.print("Enter No of Employees : ");
        int n = SC.nextInt();
        Employee_Array list[] = new Employee_Array [n];
        for (int i=0;i<n;i++){
            list[i] = new Employee_Array();
            list[i].getData(); 
        }
        System.out.print("Enter Employee No to Search : ");
        int SearchNo = SC.nextInt();
        int flag=0;
        for(int i =0;i<n;i++){
            if(list[i].eNo==SearchNo){
                flag=flag+1;
                list[i].display();
            }
        }
        if(flag==0){
            System.out.print("Employee Not Found!!");
        }
    }
}
