package Lesson_29.persons;

public class Person {
    private String email;
    private String password;

    public Person(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (isEmailValid(email)) {
            this.email = email;
        }
    }

    /*
    winneraftersales@gmail.com
    Должна присутствовать @ и только одна // done
    должна присутствовать точка после собаки // done
    после последней точки есть два или более символов // done
    латинский алфавит, цифры, -, _, . @.
    до собаки должен быть хотя бы один символ // done
    первый символ должна быть буква // done
     */

    private boolean isEmailValid(String email) {

        // должна присутствовать собачка
        int indexAt = email.indexOf('@');
        //  int lastAt = email.lastIndexOf('@');
        if (indexAt == -1 || indexAt != email.lastIndexOf('@')) return false;

        //  должна присутствовать точка после собаки
        int dotIndexAt = email.indexOf('.', indexAt + 1);
        if (dotIndexAt == -1) return false;

        //после последней точки есть два или более символов
        int lastSymbols = email.lastIndexOf('.', ' ' + 1);
        if (lastSymbols <= 1) return false;

        //латинский алфавит, цифры,
        boolean trueSymbols = email.matches(".*[a-zA-Z]+.*");
        if (trueSymbols) {
        } else {  return false;}
        // // до собаки должен быть хотя бы один символ или цифра
        boolean beginSymbols = email.matches("[a-zA-Z0-9].*");
        if (beginSymbols) {
        } else {  return false;}

        // цифры, -, _, . @.
        boolean specSymbols = email.matches(".*[-_.@].*");
        if (specSymbols){}else {return false;};

          /*
    1. длина >= 8
2. Должна быть мин 1 цифра
3. Должна быть мин 1 маленькая буква
4. Должна быть мин 1 большая буква
5. Должна быть мин 1 спец. символ (!%$@&*()[].,-)
     */


        boolean minlength = password.length() >8;
        if (minlength){
        }else {return false;}

        // 2. Должна быть мин 1 цифра
        boolean minOneDigit = password.matches(".*[0-9].*");
        if (minOneDigit){
        }else {return false;}

        // 3. Должна быть мин 1 маленькая буква
        boolean minOneSmallChar = password.matches(".*[a-z].*");
        if (minOneSmallChar){
        }else {return false;}
        // 4. Должна быть мин 1 большая буква
        boolean minOneBigChar = password.matches(".*[A-Z].*");
        if (minOneBigChar){
        }else {return false;}
        // 5. Должна быть мин 1 спец. символ (!%$@&*()[].,-)
        boolean minOneSpecSym = password.matches(".*[!%$@&*()[.,-]].*");
        if (minOneSpecSym){
        }else {return false;}



        // Возвращает тру если символ буква
        Character.isAlphabetic('c');
        // возвращает тру если символ цифра
        Character.isDigit('1');
        Character.isLetter('3');
        Character.isLetterOrDigit('-');
        return true;

    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Person{" +
                "email ='" + email + '\'' +
                ", password ='" + password + '\'' +
                '}';
    }

}
