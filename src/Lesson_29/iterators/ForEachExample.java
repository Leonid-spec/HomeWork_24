package Lesson_29.iterators;

import lists.MyArrayList;
import lists.MyList;

import java.util.Iterator;

public class ForEachExample {
    public static void main(String[] args) {

        MyArrayList<String> list = new MyArrayList<>();

        list.add("Hello");
        list.add("World");
        list.add("List");
        list.add("Python");

        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()){
            String s = iterator.next();
            System.out.println(s);
        }


        // цикл for-each
        while (iterator.hasNext()){
            String s = iterator.next();

        }

        /*
        for (Тип переменной: коллекция) {
        действия переменной
         */
        for (String s : list){
            System.out.println(s);
        }

    }

}
