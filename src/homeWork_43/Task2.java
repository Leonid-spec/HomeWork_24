package homeWork_43;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {
        String str = "Каждый раз, когда я сажусь в попытке выучить Джава, понимаю то, что я ничего не понимаю. Отведенное время на изучение кажется просто катастрофически маленьким";

        List<String> words = Arrays.asList(str.toLowerCase().trim().replaceAll("[^a-zA-Zа-яА-Я ]", "").split("\\s+"));
        List<String> result = words.stream().filter(s -> s.length() > 0 & s.charAt(0) == 'д').collect(Collectors.toList());
        System.out.println(result);
    }
}

