package vertex;

import java.util.Scanner;

public class Lesson_16 {
    public static void main(String[] args) {
  //      System.out.println("put in any numbers from 1 to 3");
  //      Scanner inputFigure = new Scanner(System.in);
  //      int i = inputFigure.nextInt();
  //      if (i == 1) {
  //          System.out.println("your number: " + i);
  //      } else if (i == 2) {
  //          System.out.println("your number: " + 2);
  //      } else if (i == 3) {
  //          System.out.println("your number: " + 3);
  //      }
  //      else {
  //          System.out.println("your puted wrong number");
  //      }
 //       System.out.println("put in number 1");
 //       Scanner inputFigure = new Scanner(System.in);
 //       int i = inputFigure.nextInt();
 //       if (i == 1){
 //           System.out.println("your number is: " + i);
 //       }
        System.out.println("put in any number from 1 to 6");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        switch (number){
            case 1:
                System.out.println("your number is 1: ");break;
            case 2:
                System.out.println("your number is 2: ");break;
            case 3:
                System.out.println("your number is 3: ");break;
            case 4:
                System.out.println("your number is 3: ");break;
            default:
                System.out.println("your number is wrong");
        }




    }
}
