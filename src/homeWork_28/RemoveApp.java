//package homeWork_28;
//
//import lists.MyArrayList;
//import lists.MyList;
//
//public class RemoveApp {
//    public static void main(String[] args) {
//        MyArrayList<Rectangle> rectangles = new MyArrayList<>();
//        rectangles.add(new Rectangle(5.0, 3.0));
//        rectangles.add(new Rectangle(4.0, 2.0));
//        rectangles.add(new Rectangle(5.0, 3.0)); // Дубликат
//        rectangles.add(new Rectangle(6.0, 4.0));
//        rectangles.add(new Rectangle(5.0, 3.0)); // Дубликат
//
//        System.out.println("Список до удаления дубликатов:");
//        for (Rectangle rect : rectangles) {
//            System.out.println(rect);
//        }
//
//        Rectangle rectangleToRemove = new Rectangle(5.0, 3.0);
//        RectangleUtils.removeDuplicates(rectangles, rectangleToRemove);
//
//        System.out.println("\nСписок после удаления дубликатов:");
//        for (Rectangle rect : rectangles) {
//            System.out.println(rect);
//        }
//    }
//}
//
