package homework.day10;

import java.util.Arrays;
import java.util.List;

public class Persons {

    public static class Person {
        public String name;
        public int age;
        public Sex sex;

        public Person(String name, int age, Sex sex) {
            this.name = name;
            this.age = age;
            this.sex = sex;
        }

        public enum Sex {
            MAN, WOMEN
        }
        @Override
        public String toString() {
            return "name='" + name + "', age=" + age + ", sex=" + sex;
        }
    }



    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("Вася", 13, Person.Sex.MAN),
                new Person("Катя", 28, Person.Sex.WOMEN),
                new Person("Вова", 24, Person.Sex.MAN),
                new Person("Маша", 38, Person.Sex.WOMEN),
                new Person("Роман Петрович", 72, Person.Sex.MAN)
        );

        int countClassic = 0;
        for (Person p : people) {
            if ((p.sex == Person.Sex.WOMEN && p.age >= 18 && p.age <= 55) ||
                    (p.sex == Person.Sex.MAN && p.age >= 18 && p.age <= 60)) {
                countClassic++;
            }
        }
        System.out.println(countClassic);

        long countStream = people.stream()
                .filter(p -> (p.sex == Person.Sex.WOMEN && p.age >= 18 && p.age <= 55) ||
                        (p.sex == Person.Sex.MAN && p.age >= 18 && p.age <= 60))
                .count();

        System.out.println(countStream);


    }
}
