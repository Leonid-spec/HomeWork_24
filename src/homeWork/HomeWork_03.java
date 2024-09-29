package homeWork;

public class HomeWork_03 {
    public static void main(String[] args) {
        int myAge = 41;
        double milkPrice = 60.67;
        char Leonid;
        String name = "Leonid";



       int number = 0;
       int number1 = 1;
       int number2 = 2;
       int number3 = 3;
       int result = (number + number1 + number2 + number3) / 4;

       int rest = (number + number1 + number2 + number3) % 4;

        System.out.println("rest " + rest);

        System.out.println("result " + result);

        // Сколько программа отбросила в дробной части? не разобрался

        // Стоимость товара
        double price1 = 253.65;
        double price2 = 22.58;
        int discount = 10;
        double sumPrice = (price1 + price2) * discount / 100;
        double priceWithDiscount = (price1 + price2) - sumPrice;


        System.out.println("сумма скидки в деньгах " + sumPrice); // так и не понял как вычесть проценты
        System.out.println("цена с учетом скидки " + priceWithDiscount);



        // Вычисление средней температуры

        int mon = 32;
        int tue = 38;
        int win = 30;
        int thu = 39;
        int fri = 25;
        int sut = 27;
        int sun = 29;

        int days = 7;

        int sumDays = (mon + tue + win + thu + fri + sut + sun);

        int sumDaysAverage = (mon + tue + win + thu + fri + sut + sun) / days;
        // double averageTemp = sumDays / days; // обрезается дробная часть

        double averageTemp = sumDays / (double) days;

        System.out.println("Средняя температура " + averageTemp);


        // Четные числа всегда возвращают 0, потому что они делятся на 2,
        // в то время как нечетные числа всегда возвращают остаток, равный 1.




    }
}
