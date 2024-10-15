package lesson_16;

import lesson_15.Cat;

public class Lesson16 {
    public static void main(String[] args) {
        int x = 10;

        Cat catVar = new Cat();
        /*
        Создается новый объект.
        Вызывается конструктор для инициализации полей объекта.
         */
        catVar.whoAmI();
        System.out.println(catVar.name);

        catVar.name = "Eblan";
        System.out.println(catVar.name);
        catVar.whoAmI();

        Cat barsik = new Cat("Barsik", "grey", 3);
        barsik.whoAmI();
        System.out.println(barsik.name);
        System.out.println(barsik.color);
        System.out.println(barsik.age);
        barsik.age = 12;

        Cat cat1 = new Cat("Barsik", "white", 5);
        cat1.whoAmI();

        Cat catClone = cat1;
        cat1.whoAmI();
        cat1.age = 100;
        cat1.whoAmI();
        catClone.whoAmI();


    }
}
