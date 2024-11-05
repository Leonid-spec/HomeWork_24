//package lesson_30.persons;
//
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Disabled;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.*;
//
//import java.util.stream.Stream;
//
//import static org.junit.jupiter.api.Assertions.*;
//class TestExample {
//    // метод который выполняется перед каждым тестовым методом
//    @BeforeEach
//    void setUp(){
//        System.out.println("метод @BeforeEach");
//    }
//    /*
//    @BeforeAll // метод запускается только один раз перед выполнением первого теста
//    @AfterEach // после каждого теста
//    AfterAll   // запускается только один раз после выполнения всех тестовых методов
//    @Disabled // указывает что тест отключен и выполняться не будет
//    @Nested // позволяет создать вложенный тестовый класс, может быть использован для логической группировки тестовых методов
//    */
//    // указывает что метод является тестовым
//    @Test
//    public void testAddition(){
//        System.out.println("Addition");
//
//        int result = 2 + 2;
//
//        // ожидаемое значение 4
//        //  реальное значение в переменной result
//
//        // методы проверки утверждений
//        // asserEquals(expected, actual) - проверяет равны ли два значения
//        Assertions.assertEquals(4, result); // проверяет равны ли значения
//        Assertions.assertNotEquals(5, result); // тест будет пройден если не ожидаемый результат не совпадает с фактическим
//        Assertions.assertTrue(result>=4); // проверяет что условие верно
//        assertFalse(result>5); // условие возвращает False
//        assertNull(null); // проверяет что объект равен null
//        assertNotNull("String"); // не равен null
//
//    }
//    @Disabled
//    @Test
//    public void emptyTest(){
//        System.out.println("TestEmpty");
//        // пустой тестовый метод считается пройденным
//    }
//
//
//    @ParameterizedTest
//    @ValueSource(strings = {"apple", "banana", "chery"})
//    public void testFruits(String fruit){
//        System.out.println(fruit);
//        assertTrue(fruit.length() > 2);
//
//    }
//
//    @ParameterizedTest
//    @ValueSource(ints = {1, 2, -1, 4, 5})
//    void testInts(int value){
//        System.out.println("current value: " + value);
//        Assertions.assertTrue(value > -5);
//    }
//
//    // CSV Comma-Separated-Value
//    // Источник данных в формате CSV
//    @ParameterizedTest
//    @CsvSource({"apple, 1", "banana, 2", "cherry, 3"})
//    void testWithCSVSource(String fruit, int rank){
//        System.out.println(fruit + " | " + rank);
//        assertTrue(fruit.length() > 4 && rank > 0);
//    }
//
//    // источник данных файл в формате CSV
//    @ParameterizedTest
//    @CsvFileSource(resources = "data.csv")
//    void testCsvFileSource(String fruit, int rank, boolean flag){
//        System.out.println(fruit + " | " + rank + " | " + !flag);
//        assertTrue(rank > 0);
//    }
//    // источник данных - method
//    @ParameterizedTest
//    @MethodSource("testDataFruits")
//    void testMethodSource(String fruit){
//        System.out.println(fruit);
//        assertNotNull(fruit);
//
//    }
//
//    static Stream<String>testDataFruits(){
//        return Stream.of("apple","banana","cherry");
//    }
//
//    @ParameterizedTest
//    @MethodSource("testDataInt")
//    void testMethodSource2(int value){
//        System.out.println("current value: " + value);
//        assertNotEquals(100, value);
//    }
//
//    static Stream<Integer>testDataInt(){
//        return Stream.of(1,2,-1,4,5);
//    }
//
//    @ParameterizedTest
//    @MethodSource("testDataArguments")
//    void testMethodSource3(int value, int expected, boolean isEquals){
//        System.out.println(value + " | " + expected + " | " + isEquals);
//        int result = value * value;
//     //   assertEquals(isEquals, result);
//        assertEquals(isEquals, result == expected);
//    }
//
//    static Stream<Arguments>testDataArguments(){
//        return Stream.of(
//                Arguments.of(2,4, true),
//                Arguments.of(3,9,true),
//                Arguments.of(4,15,false)
//        );
//    }
//
//    @ParameterizedTest
//    @MethodSource("testPersonsData")
//    void testPersonsData(Person person, String newmail) {
//        System.out.println(person);
//        System.out.println(newmail);
//    }
//
//    static Stream<Arguments>testPersonsData(){
//        return  Stream.of(
//                Arguments.of(new Person("test@mail.com", "passkasfgS"), "new123@mail.com"),
//                Arguments.of(new Person("inadsf.mail.com", "aksdfghO"), "mail.test.asf")
//        );
//    }
//
//}