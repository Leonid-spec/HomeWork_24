package homeWork_20;

import java.awt.*;

public class Circle extends Shape {
    private double radius;

    public Circle(String name) {
        super(name);
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Площадь круга: " + area);
    }
}



