package consultation_11;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class MagicDemo {
    public static void main(String[] args) throws Exception {
        Person person = new Person("John");

        // finding private field with name
        Field nameField = Person.class.getDeclaredField("name");
        //magic worlds
        nameField.setAccessible(true);
        //setting new name
        nameField.set(person, "Maria");

        //checking
        System.out.println("New name " + nameField.get(person));

        //protecting - back to the beginning
        nameField.setAccessible(false);


        //finding private method "say hello"
        Method sayHelloMethod = Person.class.getDeclaredMethod("sayHello");

        // opening this
        sayHelloMethod.setAccessible(true);

        // call method
        sayHelloMethod.invoke(person);

        //back to the beginning

        sayHelloMethod.setAccessible(false);

        Method testMethod = Person.class.getDeclaredMethod("test", String.class);
        testMethod.setAccessible(true);
        testMethod.invoke(person, "Java");
        testMethod.setAccessible(false);





    }
}
