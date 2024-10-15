package homeWork_23;

public class TestApp {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(5),
        new Rectangle(4,6),
        new Triangle(3, 4, 3, 4, 5)

        };
        double totalArea = 0;
        double totalPerimeter = 0;
        for (Shape shape : shapes){
            totalArea += shape.getArea();
            totalPerimeter += shape.getPerimeter();
        }
        System.out.println(totalArea);
        System.out.println(totalPerimeter);

    }
}

