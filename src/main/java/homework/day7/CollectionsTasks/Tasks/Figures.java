package homework.day7.CollectionsTasks.Tasks;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Figures {
    public static void main(String[] args) {
        List<String> figures = new ArrayList<>(Arrays.asList("Овал", "Прямоугольник", "Круг", "Квадрат", "Эллипс"));

        for (String i : figures) {
            System.out.println(i);
        }

        try (FileWriter writer = new FileWriter("figures.txt")) {
            for (String figure : figures) {
                writer.write(figure + "-");
            }
        } catch (Exception e) {
            System.out.println("Exeption: " + e.getClass().getSimpleName());
            System.out.println("Reason: " + e.getMessage());
        }


        int countWithoutI = 0;
        for (String figure : figures) {
            if (!figure.contains("и")) {
                countWithoutI++;
            }
        }
        System.out.println(countWithoutI);

        for (int i = 0; i < figures.size(); i++) {
            System.out.print(figures.get(i) + " ");

        }

        figures.add(2, "Треугольник");
        System.out.println();

        for (String figure : figures) {
            System.out.print(figure + " ");
        }
    }


}