package lesson_03;

public class Variables {

    public static void main(String[] args) {

        int myFirstVariable;// объявление (декларация) переменной типа int
        // Присвоение значение переменной
        myFirstVariable = 1; // первое присвоение значения в переменную называется инициализация.

        int mySecondaryVariable = 25; // объявление и инициализация в одной строке

        System.out.println(mySecondaryVariable);

        mySecondaryVariable = 50; // присвоение нового значения

        System.out.println("Значение переменной: " + mySecondaryVariable);
        // byte, short, long

        byte byteVariable = 125; // обявление и инициализация типов байт
        byteVariable = 45;
        System.out.println("Значение переменной byteVariable: " + byteVariable);

        short shortVar; // Обявление переменной типа short
        shortVar = 31000; // инициализация переменной (присвоение значения)
        System.out.println("Short value: " + shortVar);

        // любое целое число в коде воспринимается компилятором как число типа int

        long longVar = 2_100_000_000_000_000_000L; // знак _ не влияет на значение переменной. Используется для улучшения читаемости
        // L в конце числа - явным образом указать, что число в формате long
        System.out.println("Long variable: " + longVar);

        double doubleVar = 10.5421;
        System.out.println("Double variable: " + doubleVar);

        float floatVar = 11.65F; // явно указать что число в формате float
        System.out.println("Float variable: " + floatVar);


    }
}
