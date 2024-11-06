package lesson_40.set;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetExample {


    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set = new HashSet<>(20);
        set = new HashSet<>(List.of(1, 2, 3, 4, 5, 6, 6, 7, 3));

        System.out.println(set);


    }
}
