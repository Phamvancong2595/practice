package main.java.org.core.collector;

import main.java.org.core.collector.Person;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class Sample {
    public static List<Person> createPeople() {
        return List.of(
                new Person("AA", 18),
                new Person("AA", 19),
                new Person("CC", 20),
                new Person("DD", 21),
                new Person("FF", 22),
                new Person("FF", 23),
                new Person("GG", 24),
                new Person("HH", 25),
                new Person("KK", 26),
                new Person("KK", 27)
                );
    }


    public static void main(String[] args) {
        System.out.println(
                createPeople()
                        .stream()
                        .collect(partitioningBy(p -> p.getAge() %2 == 0))
        );
                Map<String, Integer> countByName =
                        createPeople()
                        .stream()
                        .collect(
                                Collectors.groupingBy(
                                        Person::getName,
                                        Collectors.collectingAndThen(
                                                counting(),
                                                Long::intValue
                                        )));
                createPeople()
                        .stream()
                        .mapToInt(Person::getAge)
                        .max();
        String name = createPeople()
                .stream()
                .collect(
                        collectingAndThen(
                        maxBy(Comparator.comparing(
                                        Person::getAge)),
                                person -> person.map(Person::getName)
                                        .orElse("")));

//        System.out.println(
//                createPeople()
//                        .stream()
//                        .collect(
//                                groupingBy(
//                                        Person::getAge,
//                                        mapping(Person::getName,
//                                                filtering(t -> t.length() > 4)
//                                        )))
//        );
        List<Integer> numbers = List.of(1,2,3);
        numbers
                .stream()
                .flatMap(e -> Stream.of( e - 2, e + 1))
                .collect(
                        toUnmodifiableList()
                );

        List<Person> people = createPeople();
        System.out.println( people.stream()
                .map(Person::getName)
                .flatMap(n -> Stream.of(n.split("")))
                .collect(toList()));
        System.out.println(people
                .stream()
                .collect(
                        groupingBy(
                                Person::getAge,
                        mapping(
                                Person::getName,
                                toUnmodifiableList())
                )));
        System.out.println(
                people
                        .stream()
                        .collect(
                                groupingBy(Person::getAge,
                                        flatMapping(
                                                person -> Stream.of(person.getName().split("")),
                                                toUnmodifiableList()
                                        ))
                        )
        );

    }
}
