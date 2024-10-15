package homeWork_23;

public class Triangle extends Shape{
    private double base, height, sideA, sideB, sideC;

    public Triangle(double base, double height, double sideA, double sideB, double sideC) {
        this.base = base;
        this.height = height;
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    double getArea() {
        return (base * height) / 2;
    }

    @Override
    double getPerimeter() {
        return sideA + sideB + sideC;
    }
}
