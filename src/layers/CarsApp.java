package layers;

import layers.repository.CarRepository;
import layers.repository.CarRepositoryImpl;
import layers.repository.UserRepository;
import layers.repository.UserRepositoryImpl;
import layers.service.MainService;
import layers.service.MainServiceImpl;
import layers.view.Menu;



public class CarsApp {
    public static void main(String[] args) {
        CarRepository carRepository = new CarRepositoryImpl();
        UserRepository userRepository = new UserRepositoryImpl();

        MainService service = new MainServiceImpl(carRepository, userRepository);

        Menu menu = new Menu(service);

        menu.run();


    }
}