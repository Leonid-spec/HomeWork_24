package homWork_27;

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
        } else {
            throw new IllegalArgumentException("Invald mail");
        }
    }

private boolean isEmailValid(String email){
        if (email == null){
            return false;
        }
// 1. Должна присутствовать @ и только одна
    int indexAT = email.indexOf('@');
        if (indexAT == -1 || indexAT != email.lastIndexOf('@')){
            return false;
        }
    // 2. Должна присутствовать точка после собаки
    int dotIndexAt = email.indexOf('.', indexAT +1);
        if (dotIndexAt == -1){
            return false;
        }
    // 3. После последней точки есть два или более символов
    int lastDotIndex = email.lastIndexOf('.');
        if (lastDotIndex == -1 || email.length() - lastDotIndex <=2){
            return false;
        }

    // 4. Алфавит, цифры, '-', '_', '.', '@'
    if (!email.matches("^[a-zA-Z0-9-_.@]+$")){
        return false;
    }
    // 5. До собаки должен быть хотя бы один символ
    if (indexAT <1){
        return false;
    }
    // 5. До собаки должен быть хотя бы один символ
    if (!Character.isAlphabetic(email.charAt(0))){
        return false;
    }
    return true;

}

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (isPasswordValid(password)) {
            this.password = password;
        } else {
            throw new IllegalArgumentException("Invalid Password");
        }
    }
    private boolean isPasswordValid(String password){
        if (password.length() < 8) return false;

        boolean minOneDigit = password.matches(".*[0-9].*");
        if (!minOneDigit) return false;
        boolean minOneSmallChar = password.matches(".*[a-z].*");
        if (!minOneDigit) return false;
        boolean minOneBigChar = password.matches(".*[A-Z].*");
        if (!minOneBigChar) return false;
        boolean minOneSpecSym = password.matches(".*[!%$@&*()[.,-]].*");
        if (!minOneSpecSym) return false;

        return true;
    }

    @Override
    public String toString() {
        return "Person{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
