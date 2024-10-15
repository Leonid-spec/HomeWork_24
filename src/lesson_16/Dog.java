package lesson_16;

public class Dog {
    String name;
    int weight;

    public Dog(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    String info() {
        return "I am dog " + name + ", my weight is " + weight;
    }

    void eat(){
        System.out.println("I am eat!");
        weight++;
    }


    void run(){


        while (weight < 5) {
            System.out.println("Fuck off, i am n.a.f");
            System.out.println("I need to eat, i am so sik: " + weight);

            eat();
        }

        System.out.println("I am run");
        weight -=2;
        System.out.println("My weight after run: " + weight);
    }


}
