package homework.day8.CollectionsTasks;

import homework.day8.PreparedClasses.Fruit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FruitTask {
    public static void main(String[] args) {
        List<Fruit> fruits = new ArrayList<>();
        fruits.add(new Fruit("Яблоко", 120));
        fruits.add(new Fruit("Банан", 80));
        fruits.add(new Fruit("Груша", 150));
        fruits.add(new Fruit("Апельсин", 200));


        for (Fruit fruit : fruits) {
            System.out.print(fruit.getName() + " ");
        }

        System.out.println();

        for (Fruit fruit : fruits) {
            System.out.print(fruit.getWeight() + " ");
        }

        Map<Integer, Fruit> fruitMap = new HashMap<>();

        int key = 1;
        for (Fruit fruit : fruits) {
            fruitMap.put(key++, fruit);
        }

        System.out.println();

        for (Integer k : fruitMap.keySet()) {
            System.out.print(k + " ");
        }
        System.out.println();

        for (Fruit f : fruitMap.values()) {
            System.out.println(f);
        }

        for (Map.Entry<Integer, Fruit> entry : fruitMap.entrySet()) {
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }

    }
}