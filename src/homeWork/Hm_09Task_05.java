package homeWork;

public class Hm_09Task_05 {
    /*
    Task 5
Написать метод, который принимает массив строк. Вывести на экран все символы самой длинной строки из массива.
Пример:
    { "One", "Two", "Twenty" } ->
T
w
e
n
t
y
     */
        public static void main(String[] args) {
            String[] array = {"Xmas", "Hanuka", "Organiser"};
            words (array);
        }

        public static void words(String[] array) {

            String biggerWords = "";
            for (String str : array) {
                if (str.length() > biggerWords.length()) {
                    biggerWords = str;
                }
            }

            System.out.println("Bigger word of the world:");
            for (char c : biggerWords.toCharArray()) {
                System.out.println(c);
            }
        }
    }


