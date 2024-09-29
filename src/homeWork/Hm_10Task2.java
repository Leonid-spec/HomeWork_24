package homeWork;
/*
Task 2
Написать метод, принимающий на вход массив строк.
Метод должен вернуть массив, состоящий из самой короткой и самой длинной строки изначального массива.
 */
public class Hm_10Task2 {
    public static void main(String[] args) {
        String[] Array = {"DasAuto", "Geschenk", "Ohne", "Prodigi", "AbraKadaBra"};
        String[] Array2 = longer(Array);

        for (String str : Array2) {
            System.out.println(str);
        }
    }
    public static String[] longer(String[] strings) {
        if (strings == null || strings.length == 0) {
            return new String[0];
        }

        String shortest = strings[0];
        String longest = strings[0];

        for (String str : strings) {// ищем самое короткое или длинное
            if (str.length() < shortest.length()) {
                shortest = str;
            }
            if (str.length() > longest.length()) {
                longest = str;
            }
        }
        return new String[]{"самое короткое слово: " + shortest, "самое длинное слово: " + longest};
    }
}


