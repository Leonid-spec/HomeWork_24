package homeWork;

public class Hm09Task_0 {
    /*
    Написать метод, принимающий на вход строку. Метод должен вывести на экран число, соответсвующее
    количеству символов в строке.
Например: Если в метод пришла строка "hello" - метод должен вывести число 5
(так как в строке hello 5 символов)
     */
    public static void main(String[] args) {
        String task0 = "Hello";
        wordHello (task0);

    }
    public static void wordHello(String str) {

        int lenght = str.length();
        System.out.println("наше слово из: " + lenght + " букв");
        System.out.println("=======Next Task=======");

    }
}
