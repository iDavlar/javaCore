package Module5ExceptionsAndFiles.Files.Exercise4;


import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Exercise4Runner {
    public static void main(String[] args) {
        Person[] persons = generatePersons(10);
        File file = new File("data.dat");

        System.out.println("Output array:\n" + Arrays.toString(persons));
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            for (Person person : persons) {
                oos.writeObject(person);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        ArrayList<Person> inputPersonList = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            while (true) {
                inputPersonList.add((Person) ois.readObject());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println("All objects are done");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Input array:\n" + inputPersonList.toString());
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
                    random.nextInt(70)
            );
        }

        return result;
    }

}
