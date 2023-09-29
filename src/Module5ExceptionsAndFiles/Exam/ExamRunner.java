package Module5ExceptionsAndFiles.Exam;

import java.time.LocalDate;
import java.io.File;

public class ExamRunner {

    public static void main(String[] args) {
        PhoneBook phoneBook = new Contacts();
        phoneBook.addUser("Ivan", 123, LocalDate.now());
        phoneBook.addUser("Petr", 345, LocalDate.now());
        phoneBook.storeToFile(new File("phonebook.txt"));
        PhoneBook phoneBook2 = new Contacts();
        phoneBook2.loadFromFile(new File("phonebook.txt"));
        System.out.println(phoneBook.getNameByNumber(123).equals("Ivan"));
        System.out.println(phoneBook.getNumberByName("Petr") == 345);

    }
}
