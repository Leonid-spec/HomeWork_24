package vertex;

import java.util.Scanner;

public class Lesson_18 {
    //еобходимо вывести на экран числа от 1 до 5. На экране должно быть:
    public static void main(String[] args) {
  //      for (int i = 1; i <= 10; i++){
  //          System.out.println("3 * " + i + " = " + 3*i);
//  }
        System.out.println("put in any positive number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <=n; i++){
            sum = sum +i;
        }
        System.out.println(sum);
    }
}
