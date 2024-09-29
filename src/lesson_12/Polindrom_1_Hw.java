package lesson_12;

public class Polindrom_1_Hw {
    public static void main(String[] args) {
        int[] array = {5, 8, 9, 10, 9, 8, 5};
        System.out.println(isPalidrome(array));

    }

    public static boolean isPalidrome(int[] array) {
        if (array == null || array.length == 0) {
            return false;
        }

        int n = array.length;
        for (int i = 0; i < n / 2 ; i++) {
            if (array[i] != array[n -1 -i]) {
                return false;
            }

        }
        return true;
    }
}
