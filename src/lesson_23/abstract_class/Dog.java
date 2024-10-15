package lesson_23.abstract_class;

public class Dog extends Animal{

    public Dog (String name) {
        super(name);
    }


    @Override
    void eat() {
        System.out.println("Dog eat");
    }

    @Override
    public void sayHello() {
        super.sayHello();
        System.out.println("Dog " + name + " say Hello!");
    }

    @Override
    void move() {
        System.out.println("Dog" + name + "moving fast");
    }
}
