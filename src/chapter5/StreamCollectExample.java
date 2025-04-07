package chapter5;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamCollectExample {

    public static void main(String[] args) {

        List<Person1> people = List.of(
                new Person1("Alice", 25, "Engineer"),
                new Person1("Bob", 20, "Artist"),
                new Person1("Charlie", 30, "Engineer"),
                new Person1("David", 28, "Artist"),
                new Person1("Eve", 22, "Designer")
        );

//        System.out.println("Original list of people: " + people);

        //Collect into a list (Collect results into a new list)
        List<String> names = people.stream()
                .map(Person1::getName)
                .toList();
//        System.out.println("Collected names: " + names);

        //Group by profession
        Map<String, List<Person1>> groupingByProfession = people.stream()
                .collect(Collectors.groupingBy(Person1::getProfession));
//        System.out.println("Grouped by profession: " + groupingByProfession);

        //Partition people into groups based on age
        Map<Boolean, List<Person1>> partitionedByAge = people.stream()
                .collect(Collectors.partitioningBy(person1 -> person1.getAge() > 25));
//        System.out.println("Partitioned by age(Older than 25 " + partitionedByAge);

        //Collect to a set
        Set<String> uniqueProfessions = people.stream()
                .map(Person1::getProfession)
                .collect(Collectors.toSet());
//        System.out.println("Unique professions: " + uniqueProfessions);

        //Collect to a map
        Map<String, Person1> peopleMap = people.stream()
                .collect(Collectors.toMap(Person1::getName, person1 -> person1));
        System.out.println("People map: " + peopleMap);

    }

}
