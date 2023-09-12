import java.util.Scanner;

class Person {
    String Name, Gender, Address;
    int Age;

    public Person(String Name, String Gender, String Address, int Age) {
        this.Name = Name;
        this.Gender = Gender;
        this.Address = Address;
        this.Age = Age;
    }
}

class Employee extends Person {
    String Company, Qualification;
    int EmpID;
    int Salary;

    public Employee(String Name, String Gender, String Address, int Age, int EmpID, String Company,
            String Qualification, int Salary) {
        super(Name, Gender, Address, Age);
        this.EmpID = EmpID;
        this.Company = Company;
        this.Qualification = Qualification;
        this.Salary = Salary;
    }
}

class Teacher extends Employee {
    int TeacherID;
    String Subject, Department;

    public Teacher(String Name, String Gender, String Address, int Age, int EmpID, String Company, String Qualification,
            int Salary, int TeacherID, String Subject, String Department) {
        super(Name, Gender, Address, Age, EmpID, Company, Qualification, Salary);
        this.TeacherID = TeacherID;
        this.Subject = Subject;
        this.Department = Department;
    }
}

public class Nine_Person_Employee_Teacher {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.print("No of Teachers: ");
        int n = SC.nextInt();
        Teacher List[] = new Teacher[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Name: ");
            String Name = SC.next();
            System.out.print("Gender: ");
            String Gender = SC.next();
            System.out.print("Address: ");
            String Address = SC.next();
            System.out.print("Age: ");
            int Age = SC.nextInt();
            System.out.print("EmpID: ");
            int EmpID = SC.nextInt();
            System.out.print("Company: ");
            String Company = SC.next();
            System.out.print("Qualification: ");
            String Qualification = SC.next();
            System.out.print("Salary: ");
            int Salary = SC.nextInt();
            System.out.print("TeacherID: ");
            int TeacherID = SC.nextInt();
            System.out.print("Subject: ");
            String Subject = SC.next();
            System.out.print("Department: ");
            String Department = SC.next();
            List[i] = new Teacher(Name, Gender, Address, Age, EmpID, Company, Qualification, Salary, TeacherID, Subject,
                    Department);
        }
        System.out.println("-----Teacher Details-----");
        System.out.println("-------------------------");
        for (int i = 0; i < n; i++) {
            System.out.println("Name\t\t: " + List[i].Name);
            System.out.println("Gender\t\t: " + List[i].Gender);
            System.out.println("Address\t\t: " + List[i].Address);
            System.out.println("Age\t\t: " + List[i].Age);
            System.out.println("EmpID\t\t: " + List[i].EmpID);
            System.out.println("Company\t\t: " + List[i].Company);
            System.out.println("Qualification\t: " + List[i].Qualification);
            System.out.println("Salary\t\t: " + List[i].Salary);
            System.out.println("TeacherID\t: " + List[i].TeacherID);
            System.out.println("Subject\t\t: " + List[i].Subject);
            System.out.println("Department\t: " + List[i].Department);
        }
        SC.close();
    }
}
