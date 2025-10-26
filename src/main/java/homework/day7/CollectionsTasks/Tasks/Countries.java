package homework.day7.CollectionsTasks.Tasks;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Countries {
    public static void main(String[] args) {
        List<String> countries = new ArrayList<>();
        countries.add("Андора");
        countries.add("Португалия");
        countries.add("Англия");
        countries.add("Замбия");

        for (int i = 0; i < countries.size(); i++) {
            System.out.print(countries.get(i));
            if (i < countries.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        int countShortNames = 0;
        for (String country : countries) {
            if (country.length() < 7) {
                countShortNames++;
            }
        }
        System.out.println(countShortNames);

        for (int i = 0; i < countries.size(); i++) {
            System.out.println(countries.get(i));
        }


    }
}
