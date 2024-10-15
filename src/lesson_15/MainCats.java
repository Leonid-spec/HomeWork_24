package lesson_15;

public class MainCats {
    public static void main(String[] args) {

        Cat cat = new Cat(); // create a new object class "Cat"


        cat.sayMeow();
        cat.run();
        cat.sleep();

        /*
        При создании обьекта класса все его поля инициализируются значениями по умолчанию
        Для всех числовых примитивных типов -> 0/0.0
        boolean -> False
        String and others -> null
         */

        String catName = cat.name;

        System.out.println("Name: " + catName);

        System.out.println("age: " + cat.age);
        System.out.println("========================");

        Cat cat1 = new Cat("Max");
        // new object class Cat
        // name трока которая была передана в конструкторе будет присвоена полю класса name
        System.out.println("Color: " + cat1.color);
        System.out.println("Name: " + cat1.name);
        System.out.println("==============");

        Cat cat2 = new Cat("Diamond", "red");

        cat2.whoAmI();

        System.out.println("=================");

        Cat barsik = new Cat("Barsik", "white", 2);
        barsik.whoAmI();



    }
}
