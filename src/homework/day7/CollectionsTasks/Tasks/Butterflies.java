package homework.day7.CollectionsTasks.Tasks;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Butterflies {
    public static void main(String[] args) {

        try {
            List<String> butterflies = new ArrayList<>();
            butterflies.add("Common blue");
            butterflies.add("Swallowtail");
            butterflies.add("Aglais io");
            butterflies.add("Common blue");

            for (String butterfly : butterflies) {
                System.out.println("\"" + butterfly + "\"");
            }

            int count = 0;
            for (String butterfly : butterflies) {
                if (butterfly.toLowerCase().contains("o")) {
                    count++;
                }
            }
            System.out.println("with o: " + count);

            for (int i = 0; i < butterflies.size(); i++) {
                System.out.print(butterflies.get(i) + " ");
            }

            for (String butterfly : butterflies) {
                System.out.println(butterfly);
            }

        } catch (Exception e) {
            System.out.println("Exeption: " + e.getClass().getSimpleName());
            System.out.println("Reason: " + e.getMessage());
        }
    }
}
