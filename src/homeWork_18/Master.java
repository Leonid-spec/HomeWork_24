package homeWork_18;

public class Master {
    public static void main(String[] args) {
        Dog dog = new Dog("Shark", 10, 53);
        Dog dog1 = new Dog("Bobik", 15, 53);
        Dog dog2 = new Dog("Krisp", 25, 53);
        dog.jump();
        dog.train();
        dog.jumpBarrier(35);

        dog1.jump();
        dog1.train();
        dog1.jumpBarrier(35);

        dog2.jump();
        dog2.train();
        dog2.jumpBarrier(35);

    }
}
