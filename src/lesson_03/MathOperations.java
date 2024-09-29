package lesson_03;

public class MathOperations {
    public static void main(String[] args) {
        // Ctrl + D скопировать строку
        // Ctrl + Shift перемещать строку по куду

        int var1 = 20;
        int var2 =7;

        int result;

        // Сложение
        // 20 + 7 -> 27 -> result
        result = var1 + var2;

        // Результат вычислений выражения в правой части (от знака =) присваивается в переменную в левой части
        System.out.println("result: " + result);


        result = 15 +6;
        System.out.println("result: " + result);

        result = var1 + 5;
        System.out.println("result: " + result);

        result = result + 5;
        System.out.println("result: " + result);

        // Вычитание
        result = var1 - var2;
        System.out.println("result - : " + result);

        // умножение
        result = var1 * var2;
        System.out.println("result * : " + result);

        // x = 1 + 2 *2; -> 5
        result = (1 + 2) * 2;
        System.out.println("result 1 + 2 * 2 : " + result);

        // Целочисленное деление /
        result = var1 / var2; // 2.79999
        System.out.println("result / " + result);

        System.out.println(15 / 5);
        System.out.println("16 / 5: " + 16 / 5);

        // % остаток от деления
        System.out.println("Целочисленное деление 4 / 2: " + (4 / 2)); // 2
        System.out.println("Остаток от деления деление 4 % 2: " + (4 % 2)); // 0

        System.out.println("( 5 / 10) = " + ( 5 / 10));
        System.out.println("( 5 / 10) = " + ( 5 % 10));

        System.out.println(" ====================== /n");

        double doubleVar1 = 20.0;
        double doubleVar2 = 7.0;
        double resultD = doubleVar1 / doubleVar2;
        System.out.println("resultD: " + resultD);



    }
}
