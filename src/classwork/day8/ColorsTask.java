package classwork.day8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ColorsTask {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Orange");
        colors.add("White");
        colors.add("Black");

        for (String color :colors) {
            System.out.println(color);
        }

        colors.add(1, "Pink");
        colors.add(3, "Yellow");

        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i) + " ");
        }

        System.out.println(colors.get(1) + " " + colors.get(5));

    }
}
