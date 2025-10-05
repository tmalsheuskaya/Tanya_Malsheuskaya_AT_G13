package homework.day7.CollectionsTasks.Tasks;

import java.util.ArrayList;
import java.util.List;

public class Noodles {
    public static void main(String[] args) {
        List<String> noodles = new ArrayList<>();
        noodles.add("Hakka");
        noodles.add("Ramen");
        noodles.add("Hibachi");
        noodles.add("Schezwan");

        for (String noodle : noodles) {
            System.out.print(noodle + " ");
        }

        System.out.println();

        for (int i = 0; i < noodles.size(); i++) {
            noodles.set(i, noodles.get(i).replace('a', 'o').replace('A', 'O'));
        }

        for (int i = 0; i < noodles.size(); i++) {
            System.out.print(noodles.get(i) + " ");
        }
    }
}
