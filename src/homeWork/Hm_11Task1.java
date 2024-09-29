package homeWork;
/*
Task 1
Написать метод, который считает сумму всех элементов в массиве.
 */
public class Hm_11Task1 {
    public static void main(String[] args) {
        int[] numbers = {7, 18, 9, 47, 3};
        int sum = countAll(numbers);
        System.out.println("Сумма всех чисел массива: " + sum);
    }
    public static int countAll(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
}


