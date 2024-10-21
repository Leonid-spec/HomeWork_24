package homWork_27;

public class PersonApp {
    public static void main(String[] args) {
        try {
            // Создание объекта Person
            Person person = new Person("KKKKK@jjjj.ll", "ikjo!olOlkj!");

            // Установка нового email и пароля
            person.setEmail("llk@kkf.fj");
            person.setPassword("!!flakdKK3");

            // Вывод информации об объекте Person
            System.out.println("New email: " + person.getEmail());
            System.out.println("New password: " + person.getPassword());

        } catch (IllegalArgumentException e) {
            System.out.println("Mistake: " + e.getMessage());
        }
    }
}

