package lesson_24.interfaces;

public interface Printable {
    void print();
    default void test(){
        System.out.println("Test");
    }

    static void testStatic(String str){
        System.out.println("Static method printable: " + str);
    }


}
