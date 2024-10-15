package homeWork_18;

public class Calculator {

    public static int plus(int a, int b) {
        return a + b;
    }

    public static int minus(int a, int b) {
    return a - b;
    }

    public static int multiply(int a, int b) {
    return a * b;
    }
    public static int divide(int a, int b) {
        if (b==0){
            return Integer.MAX_VALUE;
        }
    return a / b;
    }
    public static final double Pi = 3.141592653589793;
        public static double round(double radius){
            return 2*Pi*radius;
    }
    public static double area(double radius){
            return Pi * radius * radius;
    }

}
