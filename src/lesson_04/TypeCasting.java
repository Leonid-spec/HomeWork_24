package lesson_04;

public class TypeCasting {
    public static void main(String[] args) {

        /*
        два способа преобразования типов данных
        1, неявное преобразование (автоматическое)
        2, явное преобразование (кастинг)
         */

        // неявное преобразование происходит автоматически, когда значение меньшего типа данных
        // преобразуется в больший

        byte byteVal = 123;
        int intVal;
        intVal = byteVal; // неявное преобразование типа byte в тип int
        System.out.println("intVal: " + intVal);


        double doubleValue = intVal; // преобразование из inta в double
        System.out.println("doubleValue: " + doubleValue);

        // явное преобразование
        // требуется, когда нужно преобразовать из большего в меньшее типа данных
        // может привести к потере данных

        double doubleVal = 42.9;
        int int1 = (int) doubleVal; // явное преобразование из double в int

        System.out.println("doubleVal: " + doubleVal);
        System.out.println("int1: " + int1);

        short shortVal = (short) int1;
        System.out.println("shortVal: " + shortVal);

        double bigDouble = 3_000_000_000_000_000_000.00; // Тип double вмещает гораздо больший диапазон
        // чисел (в том числе и в целой части
        // сначала пишем то что мы хотим, потом пишем то из чего мы хотим
        // например мы хотим из int  в double
        // тогда это будет = double блабла = int

        // преобразования в вычислениях

        System.out.println("=============================");

        int x = 20;
        int y = 7;

        double result;

        result = x / y;

        // int. 2. -> неявное преобразование 2.0 -> result

        System.out.println("result: " + result);

        // 20.0 / 7.0 -> 2.85 -> result
        result = x / 7.0;
        /*
        когда выражение (в формуле) присутствует несколько типов данных, то все меньшие типы данных автоматически,
        не явно, кастируются к более к более широкому типу
         */
        System.out.println("result: " + result);

        result = (float) x / y; // будет произведено обычное деление (не целочисленное)

        System.out.println("result float cast: " + result);

        /*
        1. int x -> явно преобразован во float
        2. int y ->  не явно преобразован во float
        3. произведено деление 20.0f / 7/0f ->2.85f
        4. 2.85f -> не явно (авто) преобразуется в тип double
         */

        result = (float) x / y;
        System.out.println("result float cast: " + result);

        result = (double) x / y;
        System.out.println("result float cast: " + result);


    }
}
