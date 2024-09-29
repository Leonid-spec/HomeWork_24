package lesson_04;

public class TypeCharExample {
    public static void main(String[] args) {

        char a = 'A'; // Переменная будет хранить букву А латинского алфавита
        char a1 = 65; // Переменная будет хранить букву А латинского алфавита, соответсвующую коду 65 в системе числения
        char a2 = 0x41; // Присваиваем число в 16-формате. что соответствует все той же букве а
        a2 = 0x0041; // полная форма записи числа в 16 системе счисления
        char a3 = '\u0041'; // еще один способ записи значения в 16 формате
        char x = '\u1508';

        System.out.println("a: " + a);
        System.out.println("a1: " + a1);
        System.out.println("a2: " + a2);
        System.out.println("a3: " + a3);
        System.out.println("x: " + x);

        char digit0 = 48;
        System.out.println("digit0: " + digit0);

        // digit0 = (char) (digit0 + 5);

        int var = 5;


        var +=5;
        System.out.println("var: " + var);
        var -=2;
        var /=1;
        var +=7;
        System.out.println("var: " + var);


    }
}
