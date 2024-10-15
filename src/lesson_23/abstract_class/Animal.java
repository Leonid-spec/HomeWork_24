package lesson_23.abstract_class;

abstract class Animal {

    protected String name;


    public Animal(String name) {
        this.name = name;
    }

    abstract void eat();
    abstract void move();
    public void sayHello(){
        System.out.println("Hi from animal");
    }



}
