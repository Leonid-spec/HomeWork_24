package homeWork_38;


import java.util.Arrays;
import java.util.Comparator;

public class SportsmanApp {
    public static void main(String[] args) {
        Sportsman[] sportsmen = new Sportsman[5];
        sportsmen[0] = new Sportsman("Bill Armstrong", 18, 21);
        sportsmen[1] = new Sportsman("Donald Trump", 120, 32);
        sportsmen[2] = new Sportsman("Master Drackula", 572, 150);
        sportsmen[3] = new Sportsman("Terminator", 27, 24);
        sportsmen[4] = new Sportsman("Loid Xristmas", 36, 55);

        System.out.print("Simple ");
        System.out.println(Arrays.toString(sportsmen));
        Arrays.sort(sportsmen);

        System.out.print("By name     ");
        System.out.println(Arrays.toString(sportsmen));

        SportsmanScoreComparator sportsmanScoreComparator = new SportsmanScoreComparator();
        Arrays.sort(sportsmen, sportsmanScoreComparator);

        System.out.print("By scores     ");
        System.out.println(Arrays.toString(sportsmen));

        Arrays.sort(sportsmen, new Comparator<Sportsman>() {
            @Override
            public int compare(Sportsman sportsman1, Sportsman sportsman2) {
                return sportsman1.getAge() - sportsman2.getAge();
            }
        });

        System.out.print("By ages ");
        System.out.println(Arrays.toString(sportsmen));
    }
}