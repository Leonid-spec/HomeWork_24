package homeWork_26;

import lists.MyArrayList;

public class MainClass {
    public static void main(String[] args) {
        Pair<String> pair = new Pair<>("Hello", "World");
        System.out.println(pair.getFirst()); // Вывод: Hello
        System.out.println(pair.getSecond()); // Вывод: World

        pair.swap();
        System.out.println(pair.getFirst()); // Вывод: World
        System.out.println(pair.getSecond()); // Вывод: Hello
//
    }

}
