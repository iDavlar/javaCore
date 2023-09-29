package Module5ExceptionsAndFiles.Exam;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

public class ContactsText {

    Contacts contacts;

    @Test
    public void testAddUser() {
        try {
            assertTrue(contacts.getNameByNumber(123).equals("Ivan"));
            assertTrue(contacts.getNumberByName("Ivan") == 123);
        } catch (Exception e) {
            fail("Not found");
        }
    }

    @Test
    public void testGetNumberByName() {
        try {
            assertTrue(contacts.getNumberByName("Ivan") == 123);
        } catch (Exception e) {
            fail("Not found");
        }
        try {
            contacts.getNumberByName("Gth");
            fail("Must not exist!");
        } catch (Exception e) {
            assertTrue(true);
        }
    }

    @Test
    public void testGetNameByNumber() {
        try {
            assertTrue(contacts.getNameByNumber(123).equals("Ivan"));
        } catch (Exception e) {
            fail("Not found");
        }
        try {
            contacts.getNameByNumber(4645);
            fail("Must not exist!");
        } catch (Exception e) {
            assertTrue(true);
        }
    }

    @Test
    public void testStoreToFile() {
        try {
            contacts.storeToFile(new File("testphonebook.txt"));
        } catch (Exception e) {
            fail("Something goes wrong!");
        }
    }

    @Test
    public void testLoadFromFile() {
        try {
            contacts.storeToFile(new File("testphonebook.txt"));
            contacts.loadFromFile(new File("testphonebook.txt"));
        } catch (Exception e) {
            fail("Something goes wrong!");
        }

        try {
            contacts.loadFromFile(new File("test123phonebook.txt"));
            fail("Something goes wrong!");
        } catch (Exception e) {

        }
    }

    @BeforeEach

    public void createContacts() {
        contacts = new Contacts();
        contacts.addUser("Ivan", 123, LocalDate.now());
    }

}
