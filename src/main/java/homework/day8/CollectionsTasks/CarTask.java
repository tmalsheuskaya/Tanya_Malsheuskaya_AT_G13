package homework.day8.CollectionsTasks;

import homework.day8.PreparedClasses.Car;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CarTask {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();

        cars.add(new Car("Toyota", "Corolla"));
        cars.add(new Car("Ford", "Mustang"));
        cars.add(new Car("BMW", "X5"));

        for (Car car : cars) {
            System.out.println(car.getBrand() + ":" + car.getModel());
        }

        Map<String, Car> carMap = new HashMap<>();

        for (Car car : cars) {
            carMap.put(car.getBrand(), car);
        }

        for (String key : carMap.keySet()) {
            System.out.println(key);
        }

        for (Car value : carMap.values()) {
            System.out.println(value);
        }

        for (Map.Entry<String, Car> entry : carMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}