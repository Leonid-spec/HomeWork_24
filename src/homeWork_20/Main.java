package homeWork_20;

    public class Main {
        public static void main(String[] args) {
            // Создание объектов классов Rectangle и Circle
            Rectangle rectangle = new Rectangle("Прямоугольник");
            Circle circle = new Circle("Круг");

            // Установка значений для полей
            rectangle.setDimensions(5, 10);
            circle.setRadius(7);

            // Установка имени фигуры
            rectangle.displayInfo();
            circle.displayInfo();

            // Вычисление и вывод площади
            rectangle.calculateArea();
            circle.calculateArea();
        }
    }



