package lerningGPT;

public class lerning {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        String average = calculateAverage(numbers);
        System.out.println("Average result " + average);
    }

    public static String calculateAverage(int[] numbers){
        int sum = 0;
        for (int number : numbers){
            sum += number;
        }
        double average = (double) sum / numbers.length;
        return "Average numbers " + average;
    }
}

