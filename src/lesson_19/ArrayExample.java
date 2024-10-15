package lesson_19;

import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        int[] array = {3, 2, 1, 0};

        String arrayToString = Arrays.toString(array);
        System.out.println(arrayToString);
        System.out.println(Arrays.toString(array));

        System.out.println("===============");
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        System.out.println("================");
        int index = Arrays.binarySearch(array, 3);
        System.out.println("index " + index);

        System.out.println("===============");

        int[] test = {0, 2, 1, 3};
        System.out.println(array.equals(test));
        boolean isArraysEquals = Arrays.equals(array, test);
        System.out.println(isArraysEquals);

        int mismatchIndex = Arrays.mismatch(array, test);
        System.out.println(mismatchIndex);

        System.out.println("==========");
        int[][] arrayD = new int[3][4];
        System.out.println(Arrays.deepToString(arrayD));

        System.out.println("=============");
        int[] copyOfTest = Arrays.copyOf(test, 10);
        System.out.println(Arrays.toString(copyOfTest));
        System.out.println(Arrays.toString(copyOfTest));
        copyOfTest = Arrays.copyOf(test, 2);
        System.out.println(Arrays.toString(copyOfTest));

        System.out.println("===========");
        int[] ints = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
        int[] rangeFromInts = Arrays.copyOfRange(ints, 3, 10);
        System.out.println(Arrays.toString(rangeFromInts));
        int[] copyOfInts = Arrays.copyOf(ints, ints.length);
        System.out.println(Arrays.toString(copyOfInts));
        //


        //System.arraycopy принимает 5 параметров откуда берем,
        // с которого начинаем, куда вставить, с которого будем записывать, и сколько длину

        System.out.println("=============");
        int[] target = new int[10];
        System.arraycopy(ints, 9, target, 3, 5);
        System.out.println(Arrays.toString(target));



    }
}
