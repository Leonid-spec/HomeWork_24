package homeWork;

import java.util.Random;
import java.util.Scanner;

public class HomeWork_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       /*
       Дан текст Programming is fun.

Напишите программу, которая проверяет, содержит ли эта строка слово “fun”,
и выведите результат в виде булевой переменной.
        */
        String string = "Programing is fun";
        boolean containsFun = string.contains("fun");
        System.out.println("содержит ли эта строка слово 'fun': " + containsFun);
        System.out.println("=============");
        /*
        Task 2
Создайте две переменные типа int.

В первую переменную запишите случайное значение от 0 до 50.
Во вторую переменную случайное значение от 0 до 100.
(опционально) Во вторую переменную случайное значение от -20 до 30.
         */
        Random random = new Random();
        int a = random.nextInt(51);
        int b = random.nextInt(101);
        b = random.nextInt(51) -20;
        System.out.println(a);
        System.out.println(b);
        System.out.println("===========");
        /*
        Проверьте:
равны ли переменные,
не равны ли они,
больше ли a, чем b,
и меньше ли b, чем a.
Выведите результат на экран.
         */
        boolean check1 = a == b;
        System.out.println(a + " = " + b + " -> " + check1);
        boolean check2 = a > b;
        System.out.println(a + " > " + b + " -> "  + check2);
        boolean check3 = b < a;
        System.out.println(a + " < " + b + " -> "  + check2);
        System.out.println("==========");

        /*
        Task 3
Попросите пользователя ввести целое число с клавиатуры.
Ваша программа должна вывести строку в формате:
Число: 6 четное: true; кратно 3: true; четное и кратное 3: true
Число: 3 четное: false; кратно 3: true; четное и кратное 3: false

Проверьте работу вашей программы, вводя разные числа. Убедитесь в правильности выдаваемой строки.
         */
        System.out.println("Введите целое число с клавиатуры");
        int rightNumber = scanner.nextInt() % 2;
        scanner.nextLine();

        int fullNumb = 0;
        boolean b1 = rightNumber == fullNumb;
        boolean b2 = rightNumber % 3 == 0;
        boolean b3 = b1 && b2;
        System.out.println("число" + " -> " + "четное: " + b1 + ", " + "кратное: " + b2 + ", " + "четное и кратное: " +
                b3);

        System.out.println("Введите не четное число с клавиатуры");
        int rightNumber1 = scanner.nextInt() % 2;
        scanner.nextLine();

        int fullNumb2 = 0;
        boolean f1 = rightNumber1 == fullNumb2;
        boolean f2 = rightNumber1 / 3 == 0;
        boolean f3 = f1 && f2;
        System.out.println("число" + " -> " + "четное: " + f1 + ", " + "кратное: " + f2 + ", " + "четное и кратное: " +
                f3);
        System.out.println("===============");

        /*
        Task 4
Дан следующий код. Вашей задачей является предсказать, какой вывод будет напечатан в консоли после
выполнения программы.
         */

/*
public class BooleanTest {
    public static void main(String[] args) {
        int a = 8;
        int b = 3;
        boolean result;

        result = (a + b) > 10;
        System.out.println("Result 1: " + result); true сложение дает число 11 что больше 10

        result = (a - b) == 5;
        System.out.println("Result 2: " + result); true сложение дает число 5 что равно 5

        result = (a * b) != 24;
        System.out.println("Result 3: " + result); false сложение все таки дает число 24 что означает равно

        result = (a / b) >= 2;
        System.out.println("Result 4: " + result); true деление дает равно или больше

        result = !(a % b == 2);
        System.out.println("Result 5: " + result); false так как вынесено за скобки то общее отменяет?
    }
}

 */

    }
}
