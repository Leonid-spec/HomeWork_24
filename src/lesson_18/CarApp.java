package lesson_18;

import java.util.Arrays;

public class CarApp {
    public static void main(String[] args) {


        System.out.println("Static before objects car creating: ");
        System.out.println(Car.totalCarProduced);
        System.out.println("================ \n");

        Car car = new Car("BMW", 200);
        System.out.println(car.toString());

        Car car2 = new Car("VW", 300);
        System.out.println(car2.toString());

        Car car1 = new Car("Seat", 55);
        System.out.println(car1.toString());
        System.out.println("Static var: " + Car.totalCarProduced);
        Car.testStatic();

        int sum = MathUtils.sumOfInts(25, 10);
        System.out.println("sum: " + sum);



    }
}
