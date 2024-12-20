package layers.service;

import layers.model.Car;
import layers.model.User;
import layers.utils.MyList;


public interface MainService {


    // Create - add
    void addCar(String model, int year, double price);

    // READ
    // получить список всех машин
    MyList<Car> getAllCars();

    // получить авто по id
    // Car getById(int id);

    // Получить список машин по модели
    MyList<Car> getCarsByModel(String model);

    // Получить список свободных машин
    MyList<Car> getFreeCars();

    // Update
    boolean updateCarPrice(int id, double price);

    boolean takeCar(int id);

    // Delete
    Car deleteCar(int id);

    User registerUser(String email, String password);

    boolean loginUser(String email, String password);

    void logout();

}