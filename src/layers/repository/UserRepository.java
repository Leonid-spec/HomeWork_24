package layers.repository;

import layers.model.User;


public interface UserRepository {

    User addUser(String email, String password);

    boolean isEmailExists(String email);

    User getUserByEmail(String email);
}