package lesson_05;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите Ваше имя");
        String name = scanner.nextLine();


        System.out.println("name: " + name);

        // Прочитать целое число
        System.out.println("Введите Ваш возраст");
        int age = scanner.nextInt(); // Считать одно число типа int

        System.out.println("Введите Ваш рост");
        double height = scanner.nextDouble();
        scanner.nextLine();


        System.out.println("name: " + name);
        System.out.println("age: " + age);
        System.out.println("height : " + height);


    }
}
