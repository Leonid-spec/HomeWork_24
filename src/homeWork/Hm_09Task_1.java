package homeWork;

public class Hm_09Task_1 {
    public static void main(String[] args) {
        /*
        Task 1
Написать метод, принимающий массив целых чисел и распечатывающий массив в обратной последовательности.
{1, 4, 3, 6, 7} -> распечатывает [7, 6, 3, 4, 1]
Перегрузить метод, если в него приходит индекс, то часть массива слева до этого индекса
распечатывается в обычном порядке, а начиная с этого индекса в обратном
{1, 4, 3, 6, 7} + индекс 2 - > распечатывает [1, 4, 7, 6, 3]
Еще одна перегрузка: метод принимает массив и булевый флаг. Если флаг == true -> печатает
массив в обратном порядке Если флаг == false -> печатает массив в прямом порядке
         */
        int[] array = {1, 4, 3, 6, 7};
        printArray(array);
        printArray(array, 2);
        printArray(array, true);
        printArray(array, false);
    }

    public static void printArray(int[] array) {
        //for(<начальная точка>; <условие выхода>; <операторы счетчика>)
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public static void printArray(int[] array, int index) {
        for (int i = 0; i < index; i++) {
            System.out.print(array[i] + " ");
        }
        for (int i = array.length - 1; i >= index; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void printArray(int[] array, boolean reverse) {
        if (reverse) {
            for (int i = array.length - 1; i >= 0; i--) {
                System.out.print(array[i] + " ");
            }
        } else {
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }
}


