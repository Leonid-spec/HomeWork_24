package homeWork;

import java.util.Scanner;

public class HomeWork_05 {

    public static void main(String[] args) {
                /*
        Task 1
Напишите программу, которая будет просить у пользователя ввести его имя с клавиатуры.
Используя Scanner, сохраните имя в переменную типа String.
Выведите на экран количество символов в имени пользователя.
Создайте две переменные типа char: одна должна хранить первый символ имени, другая — последний.
Выведите на экран десятичный код (код символа в десятичной системе счисления)
первого и последнего символа имени.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите свое имя:");
        String name = scanner.nextLine();
        int length = name.length();
        System.out.println(length);
        char firstSym = name.charAt(0);
        char lastSym = name.charAt(length - 1);

        System.out.println(firstSym + " | " + (int) firstSym);
        System.out.println(lastSym + " | " + (int) lastSym);
        System.out.println("==============");

        /*
        Task 2
Создайте строки:
"Java"
"is"
"a"
"powerful"
"language"
Склейте эти строки двумя разными способами, чтобы получить строку: "Java is a powerful language".
Выведите на экран получившуюся строку и её длину.
         */
        String a = "Java";
        String b = "is";
        String c = "a";
        String d = "powerful";
        String e = "language";

        String concatStr = a + " " + b + " " + c + " " + d + " " + e;
        System.out.println(concatStr);
        System.out.println(concatStr.length());

        System.out.println("Второй  способ");

        String str1 = "Java";
        String str2 = "is";
        String str3 = "a";
        String str4 = "powerful";
        String str5 = "language";

        String allSym = String.join(" ", str1, str2, str3, str4, str5);
        System.out.println(allSym);
        System.out.println(allSym.length());
        System.out.println("===============");

        /*
        Task 2.2 * (Опционально)
Замените в результирующей строке слово "powerful" на "super".
Создайте переменную типа boolean с ответом на вопрос: содержит ли строка подстроку "age"?
Выведите на экран значение этой переменной.
         */
        String a1 = "Java";
        String a2 = "is";
        String a3 = "a";
        String a4 = "powerful";
        String a5 = "language";

        String finalWorld = String.join(" ", a1, a2, a3, a4, a5);
        System.out.println(finalWorld);
        String change = finalWorld.replace("powerful", "super");
        System.out.println(change);
        System.out.println("===========");

        System.out.println("содержит ли строка подстроку age?");
        boolean check = change.contains("age");
        System.out.println("содержит ли строка подстроку age?:  " + check);

        System.out.println("===========");

        /*
        Task 3* (Опционально)
Попросите пользователя ввести строку чётной длины с клавиатуры.
Распечатайте два средних символа строки.
Например:

Для строки "string" результат будет "ri".
Для строки "code" результат будет "od".
Для строки "Practice" результат будет "ct".
         */
        System.out.println("Введите строку четной длины");
        String myHoney = scanner.nextLine();
        int String = myHoney.length();
        System.out.println(String);
        int result = String % 2;
        System.out.println(result);
        int middle = myHoney.length() / 2;
        String middleChars = myHoney.substring(middle - 1, middle + 1);
        System.out.println(middleChars);

        String string = "All is ok";
        String replace = string.replace("ok","NotOk");
        System.out.println("replace: " + replace);



    }
}
