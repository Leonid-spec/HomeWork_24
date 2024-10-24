package homeWork_30.persons;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

// порядок запуска методов теста будет определяться аннотацией @order
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OrderedTest {

    @Test
    @Order(10)
    void firstTest(){
        System.out.println("firstTest");
    }

    @Test
    @Order(20)
    void secondTest(){
        System.out.println("secondTest");
    }

    @Test
    @Order(30)
    void thirdTest(){
        System.out.println("thirdTest");
    }

    @Test
    @Order(15)
    void between(){
        System.out.println("between");
    }

}


