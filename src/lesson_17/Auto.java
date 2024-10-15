package lesson_17;

public class Auto {
    void gas(){
        System.out.println("Auto going ahead");
    }
    void breakMe(){
        System.out.println("Auto breaking");
    }

    public static void main(String[] args) {
        Auto auto = new Auto();
        auto.gas();
    }
}
