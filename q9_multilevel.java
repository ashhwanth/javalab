import java.util.*;

class employee {
    int empid, salary;
    String address, name;
    employee(int empid, String name, int salary, String address) {
        this.empid = empid;
        this.name = name;
        this.salary = salary;
        this.address = address;
}
}
class teacher extends employee{
    String subject, department;
    teacher(int empid, String name, int salary, String address, String subject, String department) {
        super(empid, name, salary, address);
        this.department = department;
        this.subject = subject;
    }
    void display() {
        System.out.println("Employee ID: " + empid + "\tEmployee Name: " + name + "\tEmployee Salary: " + salary + "\tEmployee Address: " + address
        + "\tDepartment: " + department + "\tsubjects: " + subject);
    }
}
class functions { 
    Scanner sc = new Scanner(System.in);
    teacher[] teacherArray;
    void insert() {
        System.out.println("Enter the number of teachers: ");
        int n = sc.nextInt();
        teacherArray = new teacher[n];
        for(int i =0; i < n; i++) {
            System.out.println("Enter the details------");
            System.out.println("Enter the employee ID, Name, Salary and Address: ");
            int empidid = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            int salary = sc.nextInt();
            sc.nextLine();
            String address = sc.nextLine();
            System.out.println("Enter the Department and subjects taugth: ");
            String department = sc.nextLine();
            String subject = sc.nextLine();
            teacherArray[i] = new teacher(empidid, name, salary, address, subject, department);
        }
    }
    void display() {
        for(int i = 0; i < teacherArray.length; i++) {
            teacherArray[i].display();
        }
    }
}

public class q9_multilevel {
    public static void main(String[] args) {
        functions obj = new functions();
        obj.insert();
        obj.display();
    }
}