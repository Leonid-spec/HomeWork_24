package lesson_20.transport;

public class Bus extends Vehicle{

    private int capacity;
    private int countPassengers;

    public Bus(String model, int year, int capacity) {
       // we have to create object of parents.
        super(model, year); // call constructor
        this.capacity = capacity;

    }
    public boolean takePassenger(){
        if (countPassengers < capacity) {
            countPassengers++;
            System.out.println("Passenger came in: " + this.getModel());
            return true;
        }
        System.out.printf("Bus %s have no free place. Passenger %d more\n",
                this.getModel(), countPassengers);
        return false;
    }
    public boolean dropPassenger(){
        if (countPassengers > 0){
            countPassengers--;
            System.out.println("One geted out: " + this.getModel());
            return true;
        }
        System.out.printf("No passengers: " + this.getModel());
        return false;

    }

    public int getCapacity() {
        return capacity;
    }

    public int getCountPassengers() {
        return countPassengers;
    }
}
