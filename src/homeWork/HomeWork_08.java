package homeWork;

import java.util.Random;
import java.util.Scanner;

public class HomeWork_08 {
    public static void main(String[] args) {
        System.out.println("=====Task2=========");

        /*
        Task 2
Используйте цикл while для решения задачи:
Распечатайте 10 строк: "Task1", "Task2", ..., "Task10".
         */

        int task = 1;
        while (task <= 10) {
            System.out.println("task" + task);
            task ++;
        }

        System.out.println("=======Task3=========");

        /*
        Используйте цикл while для решения задачи:
Распечатайте все числа от 1 до 100, которые делятся на 5 без остатка.
         */
        int task3 = 1;
        while (task3 <=101) {
            if (task3 % 2 ==0) {
                System.out.println(task3);

            } task3 ++;
        }
        System.out.println("====Task 3.1=======");
        /*
        Task 3.1 * (Опционально)
Распечатайте первые 7 чисел от 1 до 100, которые делятся на 5 без остатка.
         */
        int first7 = 0;
        int numb = 1;
        while (first7 < 7) {
            if (numb % 5 == 0) {
                System.out.println(numb);
                first7++;
            } numb++;
        }
        System.out.println("====Task 4=====");
        /*
        Напишите программу, которая просит пользователя ввести слово "hello".
        Если пользователь вводит правильное слово, программа благодарит его и завершает работу. Е
        сли вводится неправильное слово, программа продолжает запрашивать ввод, пока не будет введено
        правильное слово.
Дополнительно: Подсчитайте количество попыток, потребовавшихся для ввода правильного слова, и
выведите это количество на экран.
         */
        System.out.println("Введите слово 'hello'");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        String world = "";
        int tryNumb = 0;
        while (! world.equals("hello")){ // проверяем не содержит ли требуемое слово
            System.out.println("Введите правильное слово");
            world = scanner.nextLine(); // считываем введенное слово
            tryNumb++; // считаем количество попыток
        }
        System.out.println("Спасибо! Вы ввели правильное слово.");
        System.out.println("Количество попыток: " + tryNumb);

        System.out.println("========Task 5=======");
        /*
        Программа запрашивает у пользователя ввод произвольного числа. Вывести сумму цифр этого числа.
Пример:
567432 -> 5+6+7+4+3+2 -> 27
         */

        System.out.println("Введите произвольное число");
        int numbers = scanner.nextInt();
        System.out.println("Вы ввели число: " + numbers);

        System.out.println("========= незнаю решение");
        System.out.println("=======Task 6=============");
        /*
        Создать массив целых чисел произвольной длины от 5 до 15. Заполнить массив случайными
        значениями от -50 до 50.
Вывести на экран:
Минимальное значение в массиве
Максимальное значение в массиве
Среднее арифметическое всех значений в массиве
         */
        Random random = new Random();
        int[] nums = new int[15];
        int k = 0;

        System.out.print("[");
        while (k < nums.length) {
            nums[k] = random.nextInt(100) -50;
            System.out.print(nums[k] + ", ");
            k++;
        }
        System.out.println("]");
        int min = nums[0];
        int i = 0;
        while (i < nums.length) {
            if (nums[i] < min) {
                min = nums[i];
            }
            i++;
        }
        System.out.println("Минимальное значение в массиве: " + min);

        int max = nums[0];
        int i1 = 0;
        while (i1 > nums.length) {
            if (nums[i1] > max) {
                max = nums[i1];
            }
            i1--;
        }
        System.out.println("Максимальное значение в массиве: " + max);

        System.out.println(" Я уже выгорел нужна помощь");











    }
}
