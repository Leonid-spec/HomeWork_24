package lesson_21;

public class AutoPark {
    public static void main(String[] args) {

        BusDriver  busDriver = new BusDriver ("John", "LN-1995685");

        Autobus bus = new Autobus(busDriver,15);

        BusDriver busDriver1 = new BusDriver("Margo", "AE-254631");
        Autobus bus1 = new Autobus(busDriver1,24);

        System.out.println("Bus: " + bus.toString() );
        System.out.println("Bus1: " + bus1.toString());

        BusDriver peter = new BusDriver("Peter", "Ln-55666");
        bus1.setDriver(peter);
        System.out.println(bus1.toString());

        System.out.println("===============");
        System.out.println("Numbers of passengers: " + bus.getCountPassenger());
        bus.showListOfPassenger();

        Passenger passenger = new Passenger("John");
        Passenger margo = new Passenger("Margo");
        bus.takePassenger(passenger);

        bus.showListOfPassenger();
        bus.takePassenger(margo);
        bus.takePassenger(margo);

    }

}
