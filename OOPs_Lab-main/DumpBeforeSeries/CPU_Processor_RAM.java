package Java.Cycle1;

class CPU {
    double price;
    public CPU(double price) {
        this.price = price;
    }
    public void display() {
        System.out.println("CPU Price = Rs " + price);
    }

    class Processor {
        int numOfCores;
        String manufacturer;

        public Processor(int numOfCores, String manufacturer) {
            this.numOfCores = numOfCores;
            this.manufacturer = manufacturer;
        }
        public void display() {
            System.out.println("Processor: \nCores = " + numOfCores + "\nManufacturer = " + manufacturer);
        }
    }

    static class RAM {
        double memory;
        String manufacturer;
        public RAM(double memory, String manufacturer) {
            this.memory = memory;
            this.manufacturer = manufacturer;
        }
        public void display() {
            System.out.println("RAM: \nMemory = " + memory + "GB\nManufacturer = " + manufacturer);
        }
    }
}

public class CPU_Processor_RAM {
    public static void main(String[] args) {
        CPU cpu = new CPU(500.0);
        CPU.Processor processor = cpu.new Processor(4, "Intel");
        CPU.RAM ram = new CPU.RAM(8.0, "Corsair");
        cpu.display();
        processor.display();
        ram.display();
    }
}
