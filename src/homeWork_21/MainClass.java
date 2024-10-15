package homeWork_21;

public class MainClass {
    public static void main(String[] args) {
        Processor processor = new Processor("Intel", "T1000");
        Storage storage = new Storage("Terminator", "T600");
        Memory memory = new Memory("Kyle", "Ris");

        Computer computer = new Computer(processor, memory, storage);

        System.out.println("Processor: " + computer.getProcessor().getBrand() + " " + computer.getProcessor().getModel());
        System.out.println("Memory: " + computer.getMemory().getBrand() + " " + computer.getMemory().getModel());
        System.out.println("Storage: " + computer.getStorage().getBrand() + " " + computer.getStorage().getModel());


    }
}
