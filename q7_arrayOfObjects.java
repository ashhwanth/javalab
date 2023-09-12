import java.util.*;

class employee {
    int enumber, esalary;
    String ename;
    employee(int eno, String ename, int salary) {
        this.enumber = eno;
        this.ename = ename;
        this.esalary = salary;
    }
}

public class q7_arrayOfObjects {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int eno, n, salary, i, flag = 0;
        String name;
        System.out.println("Enter the number of employees: ");
        n = sc.nextInt();
        employee[] empar = new employee[10];
        for(i = 0; i < n; i++) {
            System.out.println("Enter the details of the employee " + (i+1));
            System.out.println("Enter the employee number: ");
            eno = sc.nextInt();
             System.out.println("Enter the name: ");
            name = sc.next();
            System.out.println("Enter the salary: ");
            salary = sc.nextInt();
            empar[i] = new employee(eno, name, salary);
        }
        System.out.println("Enter the Employee number to search: ");
        eno = sc.nextInt();
        for(i = 0; i < n; i++) {
            if(empar[i].enumber == eno) {
                System.out.println("Name :" + empar[i].ename + "\tSalary: " + empar[i].esalary);
                flag = 1;
                break;
            }
        }
        if(flag != 1) {
            System.out.println("Not Found!");
        }
    }
}
