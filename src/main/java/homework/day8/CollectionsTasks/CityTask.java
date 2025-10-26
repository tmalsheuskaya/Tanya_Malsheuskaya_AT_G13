package homework.day8.CollectionsTasks;

import homework.day8.PreparedClasses.City;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CityTask {
    public static void main(String[] args) {
        List<City> cities = new ArrayList<>();
        cities.add(new City("Москва", 12000000));
        cities.add(new City("Нью-Йорк", 8400000));
        cities.add(new City("Париж", 2200000));

        for (City city : cities) {
            System.out.print(city.getName() + " ");
        }
        System.out.println();

        for (City city : cities) {
            System.out.print(city.getPopulation() + " ");
        }
        System.out.println();

        Map<String, City> cityMap = new HashMap<>();

        for (City city : cities) {
            cityMap.put(city.getName(), city);
        }

        int totalPopulation = 0;
        for (City city : cityMap.values()) {
            totalPopulation += city.getPopulation();
        }

        System.out.println(totalPopulation);
    }
}