package homeWork;


import javax.sound.midi.Soundbank;
import java.util.Random;
import java.util.Scanner;

public class HomeWork_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        Task 1
Необходимо написать программу, которая предлагает пользователю ввести число на выбор: 1, 2 или 3.
Программа должна сказать, какое число ввёл пользователь: Один, Два, или Три (текстом)
         */
        System.out.println("======Task 1========");

        System.out.println("Введите число на выбор 1, 2 или 3");
        int yourNumber = scanner.nextInt();
        scanner.nextLine();
        if (yourNumber > 3) {
            System.out.println("Вы ввели неправильное число");
        }
        switch (yourNumber) {
            case 1:
                System.out.println("Вы ввели число -> один");
                break;
            case 2:
                System.out.println("Вы ввели число -> два");
                break;
            case 3:
                System.out.println("Вы ввели число -> три");
        }
        /*
        Task 2
Запишите в 4 переменные случайные числа от 0 до 100.
Выведите все 4 числа на экран.
Программа должна определить максимальное из этих четырех чисел и вывести результат на экран.
         */
        Random random = new Random();
        System.out.println("========Task 2========");

        int a = random.nextInt(101);
        int b = random.nextInt(101);
        int c = random.nextInt(101);
        int d = random.nextInt(101);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        if (d > max) {
            max =d;
        }
        System.out.println("Output");
        System.out.println("Максимальное число: " + max);

        /*
        Task 3 (Повышенной сложности, опционально)
Программа предлагает пользователю ввести четырехзначное число.
Ввод осуществляется только в формате строки (String).
Если введенное значение не является четырехзначным числом, должно выводиться сообщение об ошибке,
и программа завершает работу.
Проверить, является ли число "счастливым билетом". Для этого нужно сравнить сумму первых двух цифр с
суммой последних двух цифр.
Примеры:

Число 1450 -> (1+4) = 5; (5+0) = 5; 5 равно 5 - число счастливое.
Число 1654 -> (1+6) = 7; (5+4) = 9; 7 не равно 9 - число НЕ является счастливым.
         */
        System.out.println("=====Task 3 =====");
        System.out.println("Ведите любое четырех значное число");
        String yoursNumb = scanner.nextLine();

        if (yoursNumb.length() !=4) {
            System.out.println("Вы ввели не верное число");
        } else if (yoursNumb.length() ==4) {}
            int number = Integer.parseInt(yoursNumb);
            int firstHalf = (number / 1000) + ((number / 100) % 10);
            int secondHalf = ((number / 10) % 10) + (number % 10);
        if (firstHalf == secondHalf) {
            System.out.println("Число " + yoursNumb + " является счастливым билетом.");
        } else {
            System.out.println("Число " + yoursNumb + " не является счастливым билетом.");
        } // и даже интернет мне что то не сильно помог

        System.out.println("=======Task 4=========");
        /*
        Task 4
Напишите программу с использованием оператора switch:
Программа просит пользователя ввести число от 1 до 7. Если число равно 1,
выводим на консоль "Понедельник", 2 — "Вторник" и так далее. Если 6 или 7 — "Выходной".
         */
        System.out.println("Введите любое число от 1 до 7");
        int chance = scanner.nextInt();
        scanner.nextLine();
        switch (chance) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Выходной");
                break;
            case 7:
                System.out.println("Выходной");}

                System.out.println("=======Task 5========");
                /*
                Используйте оператор switch для решения задачи:
Ваш ребенок принес оценку за контрольную работу по математике. В школе 12-балльная система.
Запишите в переменную случайное число от 0 до 12.
Вы разрешаете ребенку смотреть телевизор не более 60 минут в день. На сегодня у него осталось 45 минут.
Если оценка от 10 до 12 баллов: скажите ребенку, как вы рады, и добавьте к оставшемуся времени 1 час.
Оценка от 7 до 9 баллов: похвалите ребенка и добавьте 45 минут.
Оценка от 4 до 6 баллов: нейтрально отнеситесь и добавьте 15 минут.
Оценка 3 балла: огорчитесь и вычтите 30 минут.
Оценка меньше 3 баллов: запретите телевизор на сегодня.
Выведите на экран оставшееся время для просмотра ТВ.

P.S. Проконтролируйте, чтобы ребенок не смотрел ТВ больше 60 минут в день.
                 */
                int nice = random.nextInt(13);
        System.out.println("Оценка в школе: " + nice);
                int tv = 45;
                if (nice > 4) {
                    tv = 45 + 60;
                    System.out.println("Время просмотра на сегодня: 60 минут");
                } else if (nice == 3) {
                    tv = 45 - 30;
                    System.out.println("Время просмотра на сегодня: " + tv);
                } else {
                    System.out.println("Время просмотра на сегодня: - Книги");
                }
        switch (nice) {
                    case 12:
                        System.out.println("Я очень рад, можешь смотреть телевизор целый час!");
                        break;
                    case 11:
                        System.out.println("Я очень рад, можешь смотреть телевизор целый час!");
                        break;
                    case 10:
                        System.out.println("Я очень рад, можешь смотреть телевизор целый час!");
                        break;
                    case 9:
                        System.out.println("Молодец, за твои старания можешь посмотреть еще 45 минут");
                        break;
                    case 8:
                        System.out.println("Молодец, за твои старания можешь посмотреть еще 45 минут");
                        break;
                    case 7:
                        System.out.println("Молодец, за твои старания можешь посмотреть еще 45 минут");
                        break;
                    case 6:
                        System.out.println("Ты достоин большего, а пока только на 15 минут больше");
                        break;
                    case 5:
                        System.out.println("Ты достоин большего, а пока только на 15 минут больше");
                        break;
                    case 4:
                        System.out.println("Ты достоин большего, а пока только на 15 минут больше");
                        break;
                    case 3:
                        System.out.println("Ты слишком много смотрел телевизор, теперь на 30 минут меньше");
                        break;
                    case 2:
                        System.out.println("на сегодня твой телевизор - это книги");
                        break;
                    case 1:
                        System.out.println("на сегодня твой телевизор - это книги");}
                        
                }



        }











