package homeWork;
/*
Task 2
Написать метод, который находит среднее значение элементов в массиве (среднее арифметическое).
 */
public class Hm_11Task2 {
    public static void main(String[] args) {
        int[] numbers = {8, 11, 1, 0, 8};
        double average = countAverage(numbers);
        System.out.println("Среднее значение элементов массива: " + average);
    }
    public static double countAverage(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (double) sum / array.length;
    }
}


