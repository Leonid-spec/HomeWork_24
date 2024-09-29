package homeWork;

public class Hm_09Task_4 {
    /*
    Task4 * (опционально)
Написать программу, выводящую на экран треугольник, состоящий из цифр от 1 до 6 такого вида:
     */
        public static void main(String[] args) {
            int berg = 11;
// //for(<начальная точка>; <условие выхода>; <операторы счетчика>)
            for (int i = 1; i <= berg; i++)
            {
                for (int a = 1; a <= i; a++) {
                    System.out.print(a);
                }
                System.out.println();
            }
        }
    }


