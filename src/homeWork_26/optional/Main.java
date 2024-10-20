package homeWork_26.optional;

import java.util.ArrayList;


public class Main {
    public static <T, U> void printTwoLists(MyArrayList<T> list1, ArrayList<U> list2) {
        System.out.println("Первый список:");
        for (T element : list1) {
            System.out.println(element);
        }

        System.out.println("Второй список:");
        for (U element : list2) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {

        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);

        ArrayList<String> strList = new ArrayList<>();
        strList.add("A");
        strList.add("B");
        strList.add("C");

//        printTwoLists(intList, strList);

    }


}



