package homework.day7.CollectionsTasks.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Birds {
    public static void main(String[] args) {
        List<String> birds = new ArrayList<>(Arrays.asList("Чайка", "Дрозд", "Бусел", "Голубь", "Воробей", "Цапля"));

        for (String bird : birds) {
            System.out.println("--" + bird + "--");
        }

        int countVowels = 0;
        String vowels = "аеёиоуыэюяАЕЁИОУЫЭЮЯ";

        for (String bird : birds) {
            int vowelCount = 0;
            for (char c : bird.toCharArray()) {
                if (vowels.indexOf(c) >= 0) {
                    vowelCount++;
                }
            }
            if (vowelCount > 1) {
                countVowels++;
            }
        }
        System.out.println(countVowels);

        for (int i = 0; i < birds.size(); i++) {
            System.out.print(birds.get(i) + " ");
        }

        System.out.println();

        birds.set(2, "Синица");

        for (String bird : birds) {
            System.out.print(bird + " ");
        }
    }
}

/* Создать список строк birds из 5 птиц (Чайка, Дрозд, Бусел, Голубь, Воробей, Цапля) через (Arrays.asList())
Проитерировать список через for-each и отпечатать слова в консоль с новой строки в виде --Чайка--
Посчитать сколько птиц содержат больше 1 гласной и вывести в число в консоль
Проитерировать список по индексу и отпечатать слова в консоль через пробел
Заменить 3-й элемент списка на Синица
Проитерировать список через for-each и отпечатать слова в консоль через пробел */