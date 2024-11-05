//package homeWork_30.persons;
//
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.MethodSource;
//
//import java.util.stream.Stream;
//
//public class PersonTest {
//
//    Person person;
//    String startEmail = "john@test.com";
//    String startPassword = "qwerty1Q$";
//
//
//    @BeforeEach
//    void setUp(){
//        person = new Person(startEmail,startPassword);
//    }
//
//    /*
//    Берем валидный
//    устанавливаем сеттером валидный email person
//    мы ожидаем: что у person в поле имейл будет валидный
//    имейл который установили
//    на шаге 2 проверить равенство person.getEmail()
//    с валидным имейл,
//    который мы установили
//     */
//
//    @Test
//    void testValidEmailSet(){
//        String validEmail = "valid@test.com";
//
//        person.setEmail(validEmail);
//        System.out.println("getEmail: " + person.getEmail());
//
//        Assertions.assertEquals(validEmail, person.getEmail());
//
//    }
//
//    /*
//    берем не валидный имейл
//    устанавливаем сеттером не валидный имейл в персон
//    ожидаем результат: имейл установлен не будет.
//    т.е. значение имейл у персона не будет равно не валидному имейлу
//    значение поля имейл у персон останется прежним
//     */
//
//
//    @ParameterizedTest
//    @MethodSource("invalidEmailData")
//    void testInvalidEmailTest(String invalidEmail){
//        person.setEmail(invalidEmail);
//        Assertions.assertNotEquals(invalidEmail, person.getEmail());
//        Assertions.assertEquals(startEmail, person.getEmail());
//    }
//
//
//    static Stream<String> invalidEmailData(){
//        return Stream.of(
//                "testmail.net",
//                "tes@@tmail.net",
//                "test@mai@l.net",
//                "test@mailnet",
//                "test@mail.ne.t",
//                "test@mail.net.",
//                "test@mail.t",
//                "test@ma!il.net",
//                "test@mailnet",
//                "t#est@mail.net",
//                "@testmail.net",
//                "1test@mail.net",
//                "_t@mail.net"
//
//        );
//    }
//
//}
///*
//    winneraftersales@gmail.com
//    Должна присутствовать @ и только одна // done
//    должна присутствовать точка после собаки // done
//    после последней точки есть два или более символов // done
//    латинский алфавит, цифры, -, _, . @.
//    до собаки должен быть хотя бы один символ // done
//    первый символ должна быть буква // done
//     */