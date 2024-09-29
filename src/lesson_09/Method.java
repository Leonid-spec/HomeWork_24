package lesson_09;

public class Method {
    public static void main(String[] args) {
        sayHello();
        sayHello();
        sayHello();

        String string = "Java";

  //      System.out.println(string);

        saySomething("Java");

        char ch = 'A';
        char anotherChar = '8';
        printDecimalCodeChar(ch);
        printDecimalCodeChar(anotherChar);
        printDecimalCodeChar('J');

        System.out.println("=======PrintArray==========");

        int[] array = {14, 54, 58, 42, 45};
        printArray(array);


        array[0] = -100000;
        array[3] = 101010101;

        System.out.println("==================");

        printNumbers(10);


        printNumbers(5, 10);

    }
    public static void printNumbers(int x, int y) {
        int i = x;
        while (i <= y) {
            System.out.print(i++ + ", ");
        }
        System.out.println();


    }
    public static void printNumbers(int n) {
        int i = 1;
        while (i <= n) {
            System.out.print(i++ + ", ");
        }
        System.out.println();

    }

    public static void printArray(int[] array) {

        System.out.print("[");
        int i =0;
        while (i < array.length){
            System.out.print(array[i] + (i < array.length -1 ? ", " : "]\n"));
            i++;
        }
    }


    public static void printDecimalCodeChar(char ch1){
        System.out.print((int) ch1);

    }





    public static void saySomething(String text) {
        System.out.print(text);

    }

    public static void sayHello() {
        System.out.println("Hello!");
    }
}
