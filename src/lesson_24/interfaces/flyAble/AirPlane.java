package lesson_24.interfaces.flyAble;

public class AirPlane extends Transport implements FlyAble{


    public AirPlane(int capacity) {
        super(capacity);
    }



    @Override
    boolean takePassenger() {
        if (amount <capacity){
            amount++;
            return true;
        }
        return false;
    }

    @Override
    public void fly() {
        System.out.println("AirPlane flying");
    }
}
