package by.minsk.itakademy.arturzimin;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

public class Main {

    public static List<Person> list = new ArrayList<>();

    public static void main(String[] args) {


        GeneratorPerson.generatePerson(GeneratorPerson.randomNameAndSurname()
                , GeneratorPerson.randomNameAndSurname(), ThreadLocalRandom.current().nextInt(15, 30));
        for (int i = 0; i < 100; i++) {
            GeneratorPerson.generatePerson(GeneratorPerson.randomNameAndSurname()
                    , GeneratorPerson.randomNameAndSurname(), ThreadLocalRandom.current().nextInt(15, 30));

        }
        list.stream()
                .filter(e -> e.age < 21)
                .forEach(System.out::println);
        List<String> filteredBySurnamePerson=list.stream()
                .sorted(Comparator.comparing(Person::getSurname))
                .sorted(Comparator.comparing(Person::getName))
                .limit(4)
                .map(e->e.getSurname())
                .collect(Collectors.toList());

        System.out.println("List surname Person = "+filteredBySurnamePerson);






    }
}
