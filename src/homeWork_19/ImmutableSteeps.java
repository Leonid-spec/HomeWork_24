package homeWork_19;
/*
••	Объявите final поля x и y типа int.
•	Инициализируйте их через конструктор.
•	Попытайтесь создать методы-сеттеры для изменения значений x и y.
•	Объясните, почему значения полей не могут быть изменены после создания объекта.
 */
public class ImmutableSteeps {
    private final int x;
    private final int y;

    public ImmutableSteeps(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
