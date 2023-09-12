import java.util.*;
public class q4_cpu {
    int price;
    
    class processor {
        int no_of_cores;
        String man;
    }

    static class RAM {
        int memory;
        String man;
    }

    public static void main(String[] args) {
        q4_cpu cpu = new q4_cpu();
        q4_cpu.processor prs = cpu.new processor(); 
        q4_cpu.RAM ram = new q4_cpu.RAM();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter price of the CPU: ");
        cpu.price = sc.nextInt();
        System.out.println("Enter number of cores of the CPU: ");
        prs.no_of_cores = sc.nextInt();
        System.out.println("Enter manufacture of the CPU: ");
        prs.man = sc.next();
        System.out.println("Enter memory of the ram: ");
        ram.memory = sc.nextInt();
        System.out.println("Enter manufacture of the ram: ");
        ram.man = sc.next();

        System.out.println("-----------CPU DETAILS------------");
        System.out.println("CPU price: " + cpu.price);
        System.out.println("CPU no of cores: " + prs.no_of_cores);
        System.out.println("CPU manufacture: " + prs.man);
        System.out.println("Ram memory: " + ram.memory);
        System.out.println("Ram manufacture: " + ram.man);
    }
}
