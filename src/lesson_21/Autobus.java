package lesson_21;

import java.util.Arrays;

public class Autobus {

    private static int counter = 1;

    private final int id;

    private BusDriver driver;
    private AutoPilot autoPilot;

    private final int capacity;
    private int countPassenger;

    private final Passenger[] passengers;

    public Autobus(BusDriver busDriver, int capacity) {
        this.id = counter;
        counter++;
        this.capacity = capacity;
        this.driver = busDriver;
        this.autoPilot = new AutoPilot("AP-v001");
        this.passengers = new Passenger[capacity];
    }

    public void showListOfPassenger(){
        if (countPassenger ==0){
            System.out.println("[]");
            return;
        }
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < countPassenger; i++) {
            sb.append(passengers[i].toString());
            sb.append((i < countPassenger -1) ? ", " : "]");
        }
        System.out.println(sb.toString());
    }

    public boolean takePassenger(Passenger passenger){
        if (passenger == null) return false;
        if (countPassenger < capacity){
            if (isPassengerInBus(passenger)){
                System.out.printf("Passenger id %d allready exist with id %d\n", passenger.getId(), this.id);
                return false;
            }
            passengers[countPassenger] = passenger;
            countPassenger++;
            System.out.printf("Пассажир id %d get in bus id %d\n", passenger.getId(), this.id);
            return true;

        }

        System.out.printf("Bus number id %d have no free place!\n", this.id);
        return false;

    }

    private boolean isPassengerInBus(Passenger passenger){
        for (int i = 0; i < countPassenger; i++) {
            if (passengers[i].getId() == passenger.getId()) {
                return true;
            }

        }
        return false;
    }

    public void setDriver(BusDriver driver) {
        this.driver = driver;
    }

    public int getId() {
        return id;
    }

    public BusDriver getDriver() {
        return driver;
    }

    public AutoPilot getAutoPilot() {
        return autoPilot;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCountPassenger() {
        return countPassenger;
    }

    public String toString(){
        return "Autobus: {id: " + id + ", capacity: " + capacity +
                "; driver: " + driver.toString() + "; autoPilot: " + autoPilot.toString() +
                "}";
    }
}
