//package lesson_30.persons;
//
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.MethodSource;
//
//import java.util.stream.Stream;
//
//public class TestPassword {
//    Person person;
//    String startEmail = "john@test.com";
//    String startPassword = "qwerty1Q$";
//
//    @BeforeEach
//    void setUp(){
//        person = new Person(startEmail,startPassword);
//    }
//    @Test
//    void testValidPasswordSet(){
//        String validPassword = "qwerty1Q$";
//
//        person.setPassword(validPassword);
//        System.out.println("getPassword: " + person.getPassword());
//        Assertions.assertEquals(validPassword, person.getPassword());
//    }
//
//    @ParameterizedTest
//    @MethodSource("invalidPasswordData")
//    void testInvalidPasswordTest(String invalidPassword){
//                person.setPassword(invalidPassword);
//                Assertions.assertNotEquals(invalidPassword,person.getPassword());
//                Assertions.assertEquals(startPassword, person.getPassword());
//    }
//
//    static Stream<String>invalidPasswordData(){
//        return Stream.of(
//                "123654",
//                "123456789",
//                "111111O",
//                "qwerty1Qp",
//                "a'klfhb;(q346",
//                "Om.afdbn98*9436k"
//        );
//    }
//
//
//
//
//}
