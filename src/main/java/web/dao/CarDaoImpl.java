package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao{

    private static List<Car> cars;


    {
        cars = new ArrayList<>();

        cars.add(new Car("Mers", "black", 111));

        cars.add(new Car("Vols", "red", 222));

        cars.add(new Car("BMW", "yellow", 333));

        cars.add(new Car("Mers", "red", 444));

        cars.add(new Car("Vaz", "white", 555));
    }

    @Override
    public List<Car> getAllCars() {
        return cars;
    }

    @Override
    public List<Car> getCarList(int count) {

        return (count >= 0) ? cars.subList(0, Math.min(count, cars.size())) : cars;
    }
}
