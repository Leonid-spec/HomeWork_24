package homeWork_31;

public class FourSeasonsApp {
    public static void main(String[] args) {
        for (FourSeasons fourSeasons : FourSeasons.values()){

            System.out.println(fourSeasons.getNameSeason() + ":" + fourSeasons.testMethod());
        }

    }
}
