package lesson_09;

public class TernaryOperator {
    public static void main(String[] args) {

        int x = 15;
        String result;
        if (x > 0){
            result = "Пложительное";
        }else {
            result = "Отрицательное";
        }

        String res1 = (x >= 0) ? "положительный": "отрицательное";

        System.out.println("число " + result);

    }
}
