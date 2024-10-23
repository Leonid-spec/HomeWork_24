package Lesson_29.persons;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;
class TestExample {
    // метод который выполняется перед каждым тестовым методом
    @BeforeEach
    void setUp(){
        System.out.println("метод @BeforeEach");
    }
    /*
    @BeforeAll // метод запускается только один раз перед выполнением первого теста
    @AfterEach // после каждого теста
    AfterAll   // запускается только один раз после выполнения всех тестовых методов
    @Disabled // указывает что тест отключен и выполняться не будет
    @Nested // позволяет создать вложенный тестовый класс, может быть использован для логической группировки тестовых методов
    */
    // указывает что метод является тестовым
    @Test
    public void testAddition(){
        System.out.println("Addition");

        int result = 2 + 2;

        // ожидаемое значение 4
        //  реальное значение в переменной result

        // методы проверки утверждений
        // asserEquals(expected, actual) - проверяет равны ли два значения
        Assertions.assertEquals(4, result); // проверяет равны ли значения
        Assertions.assertNotEquals(5, result); // тест будет пройден если не ожидаемый результат не совпадает с фактическим
        Assertions.assertTrue(result>=4); // проверяет что условие верно
        assertFalse(result>5); // условие возвращает False
        assertNull(null); // проверяет что объект равен null
        assertNotNull("String"); // не равен null

    }
    @Disabled
    @Test
    public void emptyTest(){
        System.out.println("TestEmpty");
        // пустой тестовый метод считается пройденным
    }


    @ParameterizedTest
    @ValueSource(strings = {"apple", "banana", "chery"})
    public void testFruits(String fruit){
        System.out.println(fruit);
        assertTrue(fruit.length() > 2);

    }
  
}