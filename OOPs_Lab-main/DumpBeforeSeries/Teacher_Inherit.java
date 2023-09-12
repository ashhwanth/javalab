package Java.Cycle1.DumpBeforeSeries;
import java.util.Scanner;

class Employee {
    int eNo;
    String eName;
    double eSalary;
    Employee(int eNo,String eName,double eSalary){
        this.eNo=eNo;
        this.eName=eName;
        this.eSalary=eSalary;
    }
}

class Teacher extends Employee{
    String Department,Subject;
    Teacher(int eNo,String eName,double eSalary,String Department,String Subject){
        super(eNo,eName,eSalary);
        this.Department=Department;
        this.Subject=Subject;
    }
}

public class Teacher_Inherit{
    public static void main(String[] args){
        Scanner SC=new Scanner(System.in);
        System.out.print("Enter No of Teachers : ");
        int n = SC.nextInt();
        Teacher list[]=new Teacher [n];
        for (int i=0;i<n;i++){
            System.out.println("Enter "+(i+1)+" Teacher Details");
            System.out.print("Enter Employee Number : ");
            int eNo=SC.nextInt();
            System.out.print("Enter Employee Name : ");
            String eName=SC.next();
            System.out.print("Enter Employee Salary : ");
            double eSalary=SC.nextDouble();
            System.out.print("Enter Teacher Department : ");
            String Dep=SC.next();
            System.out.print("Enter Teacher Subject : ");
            String Sub=SC.next();
            list[i] = new Teacher(eNo,eName,eSalary,Dep,Sub); 
        }

        System.out.println("Details of Teachers\n---------------");
        for (int i=0;i<n;i++){
            System.out.println("Employee Number : "+list[i].eNo);
            System.out.println("Employee Name : "+list[i].eName);
            System.out.println("Employee Salary : "+list[i].eSalary);
            System.out.println("Teacher Department : "+list[i].Department);
            System.out.println("Teacher Subject : "+list[i].Subject);
            System.out.println();
        }
    }
}
