package layers.model;

import layers.utils.MyArrayList;
import layers.utils.MyList;


public class User {
    private String email;
    private String password;
    private Role role;
    private final MyList<Car> userCars;

    public User(String email, String password) {
        this.email = email;
        this.password = password;
        this.role = Role.USER;
        this.userCars = new MyArrayList<>();
    }

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", userCars=" + userCars +
                '}';
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public MyList<Car> getUserCars() {
        return userCars;
    }
}