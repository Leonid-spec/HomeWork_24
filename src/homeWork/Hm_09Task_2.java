package homeWork;

public class Hm_09Task_2  {
    public static void main(String[] args) {
        /*
        Написать метод, принимающий на вход целое число. Метод должен вывести на экран 2 в степени этоЧисло
Например: Если в метод пришло число 3 - метод должен вывести число 8 (так как 2 в степени 3 = 8)
класс Math для нахождения степени числа использовать нельзя;)
         */
        int number = 2;
        task (number);
    }

    public static void task(int x) {
        int result = 1;
        //for(<начальная точка>; <условие выхода>; <операторы счетчика>)
        for (int i = 0; i < x; i++) {
            result *= 2;
        }
        System.out.println("2 в степени " + x + " = " + result);
    }
}


