package lesson_15;

public class Cat {
    public String name;
    public String color;
    public int age;
// конструктор класса
    // специальный тип метода, основная задача - установить начальные значения свойств
    /*
    имя конструктора совпадает с именем класса
    конструктор не имеет возвращаемого типа
    конструктор вызывается автоматически при создании обьекта
     */

    public Cat(String catName) {
        name = catName;

    }
    public Cat() {

    }

    public Cat(String catName, String color){
        name = catName;
        this.color = color;
        //ключевое слово this используется внутри класса для ссылки на текущий обьект
        // поможет для разрешения конфликта имен между полями класса и параметрами методов
    }

    public Cat(String name, String color, int age) {
        this(name, color);
        //Вызываю конструктор класса, принимающий две стринги
        //Соответсвующие поля будут проинициализированы
        //ключевое слово This может быть использована для вызова других конструкторов класса
        //или для передачи текущего обьекта в качестве параметра метода
  //      this.name = name;
  //      this.color = color;
        this.age = age;

    }

    public void sleep() {
        System.out.println("I am sleep!");
    }

    public void run() {
        System.out.println("I am run!");
    }

    public void sayMeow() {
        System.out.println("Meow!");
    }
    public void whoAmI() {
        System.out.printf("Я котик %s, мой возраст: %d мой окрас: %s\n", name, age, color);
    }

}
