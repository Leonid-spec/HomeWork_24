package lesson_25;

import java.util.logging.SocketHandler;

public class Wrappers {

    public static void main(String[] args) {

        Integer wrapperInt = 5;
        System.out.println(wrapperInt);

        int primitiveInt = wrapperInt;


        Integer a = 127;
        Integer b = 127;
        System.out.println(a == b);


        Integer c = 50;
        Integer d = 50;
        System.out.println(c == d);

        System.out.println("=======================");

        Integer maxValue = Integer.MAX_VALUE;
        System.out.println(maxValue);
        System.out.println(Integer.MIN_VALUE);

        System.out.println("=======================");

        Integer e = Integer.valueOf(127);
        Integer f = Integer.valueOf(127);
        System.out.println(e == f);

        Integer intStr = Integer.valueOf("123");
        System.out.println(intStr + 100);

        Double doubleWrap = Double.valueOf(154.5);
        System.out.println(doubleWrap);

        System.out.println(Integer.parseInt("456") + 100);
        double d1 = Double.parseDouble("345.67") + 200;
        System.out.println(d1);

        System.out.println(doubleWrap);









    }
}
