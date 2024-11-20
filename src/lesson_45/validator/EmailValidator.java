package lesson_45.validator;

public class EmailValidator {
    // throw - Ключевое слово используемое для явного выброса исключения (создание объекта исключения)

    public static void isEmailValid(String email) throws EmailValidateException {

        // 1. Должна присутствовать @
        int indexAt = email.indexOf('@');
        // int lastAt = email.lastIndexOf('@');
        if (indexAt == -1 || indexAt != email.lastIndexOf('@')) throw new EmailValidateException("@ error");

        // 2. Точка после собаки
        int dotIndexAfterAt = email.indexOf('.', indexAt + 1);
        if (dotIndexAfterAt == -1) throw new EmailValidateException(". after @ error");


        // 3. После последней точки есть 2 или более символов
        // test@fazx.com.ne.t
        int lastDotIndex = email.lastIndexOf('.');
        if (lastDotIndex + 2 >= email.length()) throw new EmailValidateException("last . error");

        // 4.  Алфавит, цифры, '-', '_', '.', '@'
        /*
        Я беру каждый символ. Проверяю, что он не является "запрещенным"
        И если нахожу не подходящий символ - возвращаю false
         */
        for (int i = 0; i < email.length(); i++) {
            char ch = email.charAt(i);

            // Если символ удовлетворяет одному из условий на "правильность"
            boolean isPass = (Character.isAlphabetic(ch) ||
                    Character.isDigit(ch) ||
                    ch == '-' ||
                    ch == '_' ||
                    ch == '.' ||
                    ch == '@');

            // Если любой символ НЕ подходящий, сразу возвращаем false
            if (!isPass) throw new EmailValidateException("illegal symbol");

            /*
            Равнозначные выражения.
            if (!Character.isAlphabetic(ch) && !Character.isDigit(ch) && ch != '-' && ch != '_' && ch != '.' && ch != '@') return false;
            if (!(Character.isAlphabetic(ch) || Character.isDigit(ch) || ch == '-' || ch == '_' || ch == '.' || ch == '@')) return false;
             */
        }

        // 5. До собаки должен быть хотя бы 1 символ == собака не первая в строке. Т.е. ее индекс не равен 0
        if (indexAt == 0) throw new EmailValidateException("@ should not first");

        // 6. Первый символ - должна быть буква
        // Если 0-й символ НЕ является буквой, то email не подходит = return false;
        char firstChar = email.charAt(0);
        if (!Character.isAlphabetic(firstChar)) throw new EmailValidateException("first symbol should be alphabetic");


        // Все проверки пройдены. email подходит.


    }


    public static void isPasswordValid(String password) throws PasswordValidatorException {
        if (password == null || password.length() < 8) {
            //System.out.println("Password should be at least 8 characters");
            throw new PasswordValidatorException("Password should be at least 8 characters");
        }

        boolean isDigit = false;
        boolean isUpperCase = false;
        boolean isLowerCase = false;
        boolean isSpecialSymbol = false;

        // альтернативный способ объявление переменных
        boolean[] result = new boolean[4]; // false, false, false, false

        String symbols = "!%$@&*()[].,-";

        // Перебираю символы
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            if (Character.isDigit(ch)) isDigit = true; // res[0] = true
            if (Character.isUpperCase(ch)) isUpperCase = true; // res[1] = true
            if (Character.isLowerCase(ch)) isLowerCase = true; //  res[2] = true
            if (symbols.indexOf(ch) >= 0) isSpecialSymbol = true;
            // if (symbols.contains(String.valueOf(ch))) isSpecialSymbol = true;

        }

      //  System.out.printf("%s | %s | %s | %s\n", isDigit, isUpperCase, isLowerCase, isSpecialSymbol);

        if (!isDigit) {
            throw new PasswordValidatorException("В пароле нет ни одной цифры");
        }

        if(!isUpperCase){
            throw new PasswordValidatorException("В пароле отсутствует заглавная буква");
        }
        if(!isLowerCase){
            throw new PasswordValidatorException("В пароле отсутствует маленькая буква");
        }
        if(!isSpecialSymbol){
            throw new PasswordValidatorException("В пароле отсутствует хотя бы один специальный символ !%$@&*()[].,-");
        }

        // Если хотя бы в одной переменной останется значение false, то весь пароль НЕ будет признан валидным = (признан не валидным)
       // return isDigit && isUpperCase && isLowerCase && isSpecialSymbol;

    }
}