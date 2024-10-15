package lesson_18;

public class Test {

    int x;

    static int staticY;

    public void testNonStatic(){
        x++;
        staticY++;
        testStatic();
    }

    public static void testStatic(){

        staticY++;


    }

    public static void main(String[] args) {
Test.testStatic();
Test test = new Test();
test.testNonStatic();

    }


}
