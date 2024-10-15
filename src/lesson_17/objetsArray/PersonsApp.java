package lesson_17.objetsArray;

public class PersonsApp {
    public static void main(String[] args) {

        Person garry = new Person("Garry", 31, "Photo");

        System.out.println(garry.toString());

        Person john = new Person("John", 75, "Reading, music");

        System.out.println(john.toString());

        Person[] people = new Person[5];

        people[0] = garry;
        people[3] = john;
        people[1] = new Person("Tom", 5, "crying");

        System.out.println("================== \n");

        System.out.println(people[0].toString());
        System.out.println("people[0].getName(): " + people[0].getName());

        people[0].setName("Peter");

        System.out.println(people[0].toString());
        System.out.println(garry.toString());
        System.out.println("=============================");

        for (int i = 0; i < people.length; i++) {
            if (people[i] != null) {

                System.out.println(people[i].toString());
                System.out.println("people[i].getName(): " + people[i].getName());
            } else {
                System.out.println("Null");
            }

        }
        System.out.println("===============");

        Person test = new Person("Test", 50, "Sleep");
        people[2] = test;
        people[2].setName("Test1");
        test.setAge(52);
        System.out.println(test.toString());

        test = null;
        System.out.println(people[2].getHobby());
        test = people[1];


    }
}