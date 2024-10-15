package lesson_20.transport;

import java.util.Random;

public class TransportApp {
    public static void main(String[] args) {

        Bus bus = new Bus("Bus-X1", 2020, 10);

        System.out.println(bus.toString());

        bus.start();
        bus.stop();

        System.out.println("Bus model " + bus.getModel());
        System.out.println("Bus capacity " + bus.getCapacity());

        System.out.println("============Train===========");
        Train train = new Train("Skoda ", 2022, 40, 4);
        System.out.println(train.toString());
        train.start();
        System.out.println(train.getModel());
        train.setCountWagons(10);
        System.out.println("Capacity: " + train.getCapacity());
        System.out.println("Wagons: " + train.getCountWagons());

        System.out.println("=========Bus=======");

        Bus bus1 = new Bus("Bus-X2", 2024, 15);
        System.out.println(bus1.getCountPassengers());
        System.out.println(bus1.takePassenger());
        System.out.println(bus1.getCountPassengers());
        System.out.println("========");
        System.out.println(bus1.takePassenger());
        System.out.println(bus1.getCountPassengers());
        System.out.println("========");
        System.out.println(bus1.takePassenger());
        System.out.println(bus1.getCountPassengers());
        System.out.println("========");
        System.out.println(bus1.takePassenger());
        System.out.println(bus1.getCountPassengers());
        System.out.println("========");
        System.out.println(bus1.getCountPassengers());
        System.out.println(bus1.dropPassenger());
        System.out.println("========");
        System.out.println(bus1.dropPassenger());
        System.out.println(bus1.getCountPassengers());
        System.out.println("========");
        System.out.println(bus1.dropPassenger());
        System.out.println(bus1.getCountPassengers());
        System.out.println("========");
        System.out.println(bus1.dropPassenger());
        System.out.println(bus1.getCountPassengers());







    }
}
