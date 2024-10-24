package homeWork_30.persons;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

// тесты будут выполняться по алфавитному порядку в названии тестовых методов
@TestMethodOrder(MethodOrderer.MethodName.class)
public class orderedTestByName {

    @Test
    void testB(){
        System.out.println("B");
    }

    @Test
    void testA(){
        System.out.println("A");
    }

    @Test
    void testD(){
        System.out.println("D");
    }

    @Test
    void testC(){
        System.out.println("C");
    }
}
