package homeWork_28;

import lists.MyArrayList;

public class RemoveApp {
    private static Object RectangleUtils;
    public static void main(String[] args) {
        MyArrayList<Rectangle> rectangless = new MyArrayList<Rectangle>();

        rectangless.add(new Rectangle(5.0, 3.0));
        rectangless.add(new Rectangle(4.0, 2.0));
        rectangless.add(new Rectangle(5.0, 3.0)); // Дубликат
        rectangless.add(new Rectangle(6.0, 4.0));
        rectangless.add(new Rectangle(5.0, 3.0));// дубликат

        System.out.println("Список до удаления дубликатов:");


    }
}
