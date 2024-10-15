package lesson_24.interfaces.flyAble;

public class Flyers {
    public static void main(String[] args) {
        AirPlane airPlane = new AirPlane(50);
        FlyAble duck = new Duck();

        FlyAble[] flyAbles = new FlyAble[2];
        flyAbles[0] = airPlane;
        flyAbles[1] = duck;

        for (int i = 0; i < flyAbles.length; i++) {
            FlyAble flyAble = flyAbles[i];
            flyAble.fly();

        }

    }
}
