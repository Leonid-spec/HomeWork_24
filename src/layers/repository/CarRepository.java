package layers.repository;

import layers.model.Car;
import layers.utils.MyList;


/*
CRUD - операции
- Create (Создание) - добавление новых данных
- Read (Чтение) - получение или чтение данных
- Update (Обновление) - изменение существующих данных
- Delete (Удаление) - удаление данных
 */


    public interface CarRepository {

        // Create - add
        void addCar(String model, int year, double price);

        // READ
        // получить список всех машин
        MyList<Car> getAllCars();

        // получить авто по id
        Car getById(int id);

        // Получить список машин по модели
        MyList<Car> getCarsByModel(String model);

        // Получить список свободных машин
        MyList<Car> getFreeCars();

        // Delete
        void deleteCar(Car car);



    }