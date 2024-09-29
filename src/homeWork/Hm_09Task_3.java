package homeWork;

import java.util.Random;

public class Hm_09Task_3 {
    /*
    Task 3 * (Опционально)
Заполните массив 50 случайными числами от 1 до 100. Программа должна найти, и вывести на экран все простые
 числа. Посчитайте сколько получилось таких чисел в массиве. Простое число - число, которое делится на
 цело только на 1 и само себя.
Пример простых чисел: 3, 5, 7, 11, 13 и т.д.
     */
        public static void main(String[] args) {
            int[] array = new int[50];
            Random random = new Random();
            //for(<начальная точка>; <условие выхода>; <операторы счетчика>)
            for (int i = 0; i < array.length; i++) {
                array[i] = random.nextInt(100) + 1;
            }

            int xmas = 0;
            System.out.println("numbers:");
            for (int num : array) {
                if (checks1(num)) {
                    System.out.print(num + " ");
                    xmas++;
                }
            }
            System.out.println("\nNumbers of simple numbers: " + xmas);
        }
        public static boolean checks1(int num) {
            if (num <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }


