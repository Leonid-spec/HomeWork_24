package lesson_22;

public class CastingExample {
    public static void main(String[] args) {
        Animal animal = new Cat();
        Animal animal1 = new Dog();
        Animal animal2 = new Hamster();

        System.out.println("\n===============");

        Animal[] animals = new Animal[3];
        animals[0] = animal;
        animals[1] = animal1;
        animals[2] = animal2;

        for (int i = 0; i < animals.length; i++) {
            animals[i].voice();

        }

        int i1 = 100;
        double d1 = i1;

        System.out.println(d1);



    }
}
