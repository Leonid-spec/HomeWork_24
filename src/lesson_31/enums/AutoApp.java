package lesson_31.enums;

public class AutoApp {

    public static void main(String[] args) {
        Color color = Color.RED;
        System.out.println(color);

        Auto auto = new Auto("ModelS", Color.BLUE);
        System.out.println(auto);

        auto.setColor(color);
        System.out.println(auto);

        System.out.println("==================");
        // возвращает массив всех значений
        Color[] colors = Color.values();
        for (Color currentColor : colors){
            System.out.println(currentColor);
        }
        // Возвращает enum по строковому имени
        Color color1 = Color.valueOf("RED");
        System.out.println(color1);


        // Получить имя константы
        String name = Color.RED.name();
        System.out.println(name + " ! ");

        // Получить порядковый номер c 0
        int ordinal = Color.GREEN.ordinal();
        System.out.println("ordinal: " + ordinal);

        // Enum безопасно сравнивать значение ==
        if (auto.getColor() == Color.GREEN){
            System.out.println("Color Green");
        }else {
            System.out.println("Non Green");
        }

        System.out.println("================");
        // Очень часто используется в switch
switch (color){
    case RED:
        System.out.println("Red");
        break;
    default:
        System.out.println("Other some");
}
    }
}
