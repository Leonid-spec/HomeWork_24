package lesson_06;

import javax.sound.midi.Soundbank;

public class BooleanExample {

    public static void main(String[] args) {
        boolean boll = true;
        boll = false;

        int x = 10;
        int y = 5;

        // спавнение на равенство
       boolean b1 = x == y; // x равен y -> 10 = 5 -> false
        System.out.println(x + " ==" + y + " -> " + b1);

        // неравенство !=
        b1 = x != y;
        System.out.println(x + " !=" + y + " -> " + b1);



        // Больше ">" x больше чем y
        b1 = x > y;
        System.out.println(x + " >" + y + " -> " + b1);

        y = 10;
        b1 = x > y; // 10 больше 10
        System.out.println(x + " >" + y + " -> " + b1);

        //Больше или равно ">="
        b1 = x >= y; // 10 больше или равно 10
        System.out.println(x + " >=" + y + " -> " + b1);

        // меньше "<"
        x = 7;
        b1 = x < y; // 7 мкнтше чем 10
        System.out.println(x + " < " + y + " -> " + b1);

        // меньше или равно <=
        b1 = x <= y;
        System.out.println(x + " <= " + y + " -> " + b1);

        String str = "Java is the best";
        boolean contains = str.contains("Java"); // строка str одержит в себе подстроку Java

        System.out.println("=================\n");

        // логические операции НЕ ( отрицание) "!"
        // меняет значение boolean га противоположное



    }
}
