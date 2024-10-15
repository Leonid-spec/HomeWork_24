package lesson_20;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class StringBuilderExample {
    public static void main(String[] args) {
        String str = "Java " + "is" + " " + "the" + " " + "best";

        StringBuilder sb1 = new StringBuilder(str);
        StringBuilder sb = new StringBuilder("Hello");

        sb.append(" ").append("Java");

        String string = sb.toString();
        System.out.println(string);

        StringBuilder sb2 = new StringBuilder("Hello World");
        sb2.insert(6, "beautiful ");
        System.out.println(sb2);

        StringBuilder sb3 = new StringBuilder("Hello World");
        sb3.replace(6, 11, "Java");
        System.out.println(sb3);

        StringBuilder sb4 = new StringBuilder("Hello World");
        sb4.delete(5, 11);
        System.out.println(sb4);

        StringBuilder sb5 = new StringBuilder("Hello World");
        sb5.reverse();
        System.out.println(sb5);

        System.out.println("sb5.length(): " + sb5.length());

        char ch = sb5.charAt(3);
        System.out.println(ch);
        sb = new StringBuilder("Hello World");
        String subString = sb.substring(3);
        System.out.println(subString);

        subString = sb.substring(6, 9);
        System.out.println(subString);

        sb = new StringBuilder("Hello");
        sb.setLength(10);
        System.out.println(sb);

        sb.setLength(3);
        System.out.println(sb);
        System.out.println(phraseString());

        StringBuffer stringBuffer= new StringBuffer();


    }

    public static String phraseString(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Put in a few words");
        String input = sc.nextLine();

        String[] words = input.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            sb.append(word.charAt(0));

        }


        return sb.toString().toUpperCase();
    }

}
