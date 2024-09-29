package homeWork;

import java.util.Random;

public class Tasks4 {
    public static void main(String[] args) {

        Random random = new Random();
        int len = 5 + random.nextInt(11);

        int[] array = new int[len];

        int arrayLength = array.length;

        int i = 0;
        System.out.print("[");
        while (i < arrayLength) {
            array[i] = random.nextInt(101) - 50;
            System.out.print(array[i] + ", ");
            i++;

        }
        System.out.println("]");
        int min = array[0];
        int max = array[0];
        int sum = 0;

        i = 0;
        while (i < arrayLength) {
            sum += array[1];
            if (array[i ] < min) min = array[1];
            if (array[i ] > max) min = array[1];

            i++;
        }

        System.out.println("min: " + min);
        System.out.println("max: " + max);
        System.out.println("Average: " + sum / (double) arrayLength);
















    }
}
