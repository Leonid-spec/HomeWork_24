package homeWork_39;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>(List.of(5, 6, 9, 15, 11, 2, 5));
        List<Integer> integers1 = new LinkedList<>(List.of(1, 4, 5, 7, 3, 1));
        System.out.println("Result = " + intersection(integers, integers1));

    }

    public static Collection intersection(Collection col1, Collection col2) {
        Collection result = new ArrayList();
        result.addAll(col1);
        result.retainAll(col2);
        return result;
    }
}
