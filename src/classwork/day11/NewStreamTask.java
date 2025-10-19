package classwork.day11;

import homework.day10.Persons;

import java.util.Arrays;
import java.util.List;

public class NewStreamTask {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("мама", "мыла", "раму", "чисто");

        List<Persons.Person> people = Arrays.asList(
                new Persons.Person("Вася", 13, Persons.Person.Sex.MAN),
                new Persons.Person("Катя", 28, Persons.Person.Sex.WOMEN),
                new Persons.Person("Вова", 24, Persons.Person.Sex.MAN),
                new Persons.Person("Маша", 38, Persons.Person.Sex.WOMEN),
                new Persons.Person("Роман Петрович", 72, Persons.Person.Sex.MAN)
        );


    }
}
