package lesson_05;

public class StringExample {
    public static void main(String[] args) {

        String string = "Java"; // объявление и инициализация переменной типа String

        String string1 = new String("Hello");; // Тоже создание новой строки (не рекомендуемый)

        System.out.println(string);
        System.out.println("===============");

        // 1. Получить количество символов в строке (длина строки)

        int length = string.length();
        System.out.println("length " + length);
        System.out.println("==================");

        // 2. Метод позволяет перевести все символы в верхний регистр
        System.out.println(string.toUpperCase());
        System.out.println("=========================");

        // String иммутабельна (неизменна)
        // Если я хочу сохранить результат работы метода, я должен сохранить его в какуюто переменную
        String stringUpper = string.toUpperCase();

        System.out.println("stringUpper: " + stringUpper);
        System.out.println("string: " + string);

        // ToLowerCase() - переводит все символы в нижний регистр
        // Результат работы мы можем сохранить и в туже самую переменную. Переписав ее значение.
        stringUpper = stringUpper.toLowerCase();
        System.out.println("stringUpper: " + stringUpper);
        System.out.println("==============");

        String str1 = "One";
        String str2 = " ";
        String str3 = "hello";

        // Различные варианты склеивания / обьединения строк

        // Конкантенация
        String concatStr = str1 + str2 + str3;
        System.out.println("concatStr: " + concatStr);

        // Конкатенация vs мат. сложения
        System.out.println(1 + 3);

        //        1 + 3 = сложение -> сложения 4  " : " = конкатенация -> "4 : + 2 = конкатенация -> "4 : 23"
        System.out.println(1 + 3 + " : " + 2 + 3);
        System.out.println(1 + 3 + " : " + (2 + 3));

        // Конкатенация 2.

        String concatStr2 = str1.concat(str2);
        System.out.println("concatStr2: " + concatStr2);

        // цепочка методов

        String concatStr3 = str1.concat(str2).concat(str3).concat("!");
        System.out.println("concatStr3: " + concatStr3);

        // Конкатенация3
        // "One", "Hello", "Java"
        String concatStr4 = str1 + " " + str3 + " " + "Java";
        System.out.println("concatStr4: " + concatStr4);

        concatStr4 = String.join(" ", str1, str3, "Java");
        System.out.println("concatStr4: " + concatStr4);

        System.out.println("================");

        String digits = "0123456789";
        System.out.println("digits.lenth() " + digits.length());
        // Взять символ из строки по его индексу (номеру
        char firstChar = digits.charAt(0); // взять символ под номером 0 из строки digits
        char lastChar = digits.charAt(digits.length() - 1);
        // независимо от фактической длины строки, индекс последнего всегда будет равен (длина - 1)

        System.out.println("firstChar: " + firstChar);
        System.out.println(digits.charAt(4));
        System.out.println("lastChar: " + lastChar);

        System.out.println("============");

        // Выделение подстроки
        String subString = digits.substring(2);
        //выделить строку со второго индекса и до конца строки

        System.out.println("digits: " + digits); // изначальная строка остается неизменной
        System.out.println("subString: " + subString);

        String subString2 = digits.substring(2, 7); //взять символы со 2 (включительно по 7 (не включительно)
        System.out.println("subString2: " + subString2);






    }
}
