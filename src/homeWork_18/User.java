package homeWork_18;

import java.util.Scanner;

import static homeWork_18.Calculator.*;

public class User {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radius = 5.0;

        System.out.print("Введите число: ");
        int a = scanner.nextInt();

        System.out.print("Введите число: ");
        int b = scanner.nextInt();

        System.out.println("Сложение: " + plus(a, b));
        System.out.println("Вычитание: " + minus(a, b));
        System.out.println("Умножение: " + multiply(a, b));
        System.out.println("Деление: " + divide(a, b));
        System.out.println(radius);
        System.out.println(round(radius));
        System.out.println(area(radius));

    }
}
