package homeWork;

public class Hm_14Task2 {
    public static void main(String[] args) {
        /*
        Task 2
Сумма четных чисел
Напишите метод, который вычисляет сумму всех четных чисел в массиве.
         */
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = sumNumbers(numbers);
        System.out.println("Сумма четных чисел: " + sum);
            }
            public static int sumNumbers(int[] array) {
        int sum = 0;
        for (int number : array) {
            if (number % 2 == 0) {
                sum += number;
                    }
                }
                return sum;
            }
        }
