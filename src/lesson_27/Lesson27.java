package lesson_27;

import lists.MyArrayList;

import java.util.Arrays;

public class Lesson27 {
    public static void main(String[] args) {

        MyArrayList<Integer> integers = new MyArrayList<>();
        integers.addAll(1, 2, 3, 4, 5, 200);
        System.out.println(integers);

        integers.add(1000);
        System.out.println(integers);

        System.out.println("size: " + integers.size());

        System.out.println("is empty: " + integers.isEmpty());

        int idx = integers.indexOf(200);
        System.out.println("integers.indexOf(200): " + idx);

        integers.set(idx, -300);
        System.out.println(integers);

        System.out.println("contains 500: " + integers.contains(500));

        Integer value = integers.get(50);
        System.out.println("value: " + value);

        value = integers.get(3);
        System.out.println(value);

        System.out.println("\n======================= \n");

        integers.remove(3);
        System.out.println(integers);
        System.out.println(integers.remove(Integer.valueOf(5)));
        System.out.println(integers);

        System.out.println("\n================ \n");
        Integer[] array = integers.toArray();
        System.out.println(Arrays.toString(array));


        MyArrayList<String> strings = new MyArrayList<>();
        strings.add("Hello");
        String[] strArray = strings.toArray();
        System.out.println("link: " + Arrays.toString(strArray));





    }
}
