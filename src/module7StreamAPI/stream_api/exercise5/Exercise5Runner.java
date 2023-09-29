package module7StreamAPI.stream_api.exercise5;


import java.util.*;
import java.util.stream.Collectors;

public class Exercise5Runner {
    public static void main(String[] args) {
        Person[] persons = generatePersons(100);

        System.out.println(Arrays.toString(persons));

        List<String> list = Arrays.stream(persons)
                .filter(p -> p.getAge() < 21)
                .peek(p -> System.out.println(p))
                .sorted(Comparator.comparing(Person::getSurname).thenComparing(Person::getName))
                .limit(4)
                .map(Person::getSurname)
                .collect(Collectors.toList());

        System.out.println(list);
    }

    private static Person[] generatePersons(int personNumber) {
        String[] names = {"Peter", "Mary", "John", "David", "Vlad", "Sergey"};
        String[] surnames = {"Parker", "Jane", "Snow", "Ivanov", "Chikhachev"};
        Random random = new Random();
        Person[] result = new Person[personNumber];

        for (int i = 0; i < personNumber; i++) {
            result[i] = new Person(
                    names[random.nextInt(names.length)],
                    surnames[random.nextInt(surnames.length)],
                    random.nextInt(15, 30)
            );
        }

        return result;
    }
}
