package classwork.day11;

import homework.day10.Persons;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTask {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("мама", "мыла", "раму", "чисто");

        List<Persons.Person> people = Arrays.asList(
                new Persons.Person("Вася", 13, Persons.Person.Sex.MAN),
                new Persons.Person("Катя", 28, Persons.Person.Sex.WOMEN),
                new Persons.Person("Вова", 24, Persons.Person.Sex.MAN),
                new Persons.Person("Маша", 38, Persons.Person.Sex.WOMEN),
                new Persons.Person("Роман Петрович", 72, Persons.Person.Sex.MAN)
        );

        System.out.println(words.stream().anyMatch("мама"::equals));
        System.out.println(words.stream().allMatch(s -> s.contains("м")));
        System.out.println(words.stream().map(s -> s + "м").toList());
        System.out.println(words.stream().flatMap(s -> Arrays.stream(s.split("а"))).filter(s -> !s.isEmpty()).collect(Collectors.toList()));
        System.out.println(words.stream().sorted().toList());
        System.out.println(words.stream().sorted((s, s2) -> -s2.compareTo(s)).distinct().collect(Collectors.toList()));
        System.out.println(people.stream().sorted((p1, p2) -> {
            if (p1.sex!=p2.sex) {
                return p1.sex.compareTo(p2.sex);
            } else {
                return p1.age - p2.age;
            }
        }).toList());

        String maxChar = words.stream()
                .flatMap(s -> Arrays.stream(s.split("")))
                .max(String::compareTo)
                .get();

        System.out.println("Максимальный символ: " + maxChar);

        System.out.println(people.stream().min(Comparator.comparingInt((p1) -> p1.age)).get());

        System.out.println(words.stream().mapToInt(String::length).sum());
        System.out.println(words.stream().filter(word -> word.length() % 2 != 0)
                .mapToInt(String::length)
                .sum());



    }
}
