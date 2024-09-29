package homeWork;
/*
ask 1
Написать метод со следующим функционалом:
На вход метод принимает массив целых чисел и число - длину нового массива.
Метод должен создать и распечатать массив заданной в параметрах длинны.
В начало массива должны быть скопированы элементы из входящего массива:
 */
public class Hm_10Task1 {
    public static void main(String[] args) {
        int[] Array = {1, 2, 3, 4, 5,};
        int Lenght = 8; //длина массива
        int[] NewArray = PrintArray(Array, Lenght);

        // новый масив
        for (int i : NewArray) {
            System.out.print(i + " ");
        }
    }
    public static int[] PrintArray(int[] asItIs, int NewLength) {
        int[] NewArray = new int[NewLength];
        int Length = Math.min(asItIs.length, NewLength);

        for (int i = 0; i < Length; i++) {
            NewArray[i] = asItIs[i];
        }
        return NewArray;
    }
}



