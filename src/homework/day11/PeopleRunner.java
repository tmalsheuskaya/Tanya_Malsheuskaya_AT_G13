package homework.day11;

import homework.day7.CollectionsTasks.PreparedClasses.Person;

import java.util.stream.Stream;
import java.io.PrintWriter;

public class PeopleRunner {
    public static void main(String[] args) {
        try (PrintWriter writer = new PrintWriter("average_age.txt")) {

            double averageAge = Stream.of(
                            new Person(32, "Коля"),
                            new Person(24, "Оля"),
                            new Person(55, "Вася"),
                            new Person(63, "Маша")
                    )
                    .filter(p -> p.getAge() < 60)
                    .sorted((p1, p2) -> p1.getName().compareTo(p2.getName()))
                    .map(p -> new Person(p.getAge() + 4, p.getName()))
                    .mapToInt(Person::getAge)
                    .average()
                    .orElse(0);

            writer.println(averageAge);

        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());
        }
    }
}
