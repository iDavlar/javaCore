package Module5ExceptionsAndFiles.Exam;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Contacts implements PhoneBook {

    ArrayList<Contact> contactsList = new ArrayList<>();
    HashMap<String, Contact> nameMap = new HashMap<>();
    HashMap<Integer, Contact> numberMap = new HashMap<>();

    @Override
    public void addUser(String name, int number, LocalDate createdDate) {
        Contact contact = new Contact(name, number, createdDate);
        contactsList.add(contact);
        nameMap.put(contact.getName(), contact);
        numberMap.put(contact.getNumber(), contact);
    }

    @Override
    public int getNumberByName(String name) {
        try {
            return nameMap.get(name).getNumber();
        } catch (NullPointerException e) {
            throw new NullPointerException("There is no number for name: " + name);
        }
    }

    @Override
    public String getNameByNumber(int number) {
        try {
            return numberMap.get(number).getName();
        } catch (NullPointerException e) {
            throw new NullPointerException("There is no name with number: " + number);
        }
    }

    @Override
    public void storeToFile(File phoneBookFile) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(phoneBookFile))) {
            for (Contact contact : contactsList) {
                bw.write(contact.toString());
                bw.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void loadFromFile(File phoneBookFile) {
        try (BufferedReader br = new BufferedReader(new FileReader(phoneBookFile))) {
            this.contactsList.clear();
            this.nameMap.clear();
            this.numberMap.clear();
            String contactString;
            while ((contactString = br.readLine()) != null) {
                String[] contactData = contactString.split(",");
                this.addUser(contactData[0],
                        Integer.parseInt(contactData[1]),
                        LocalDate.parse(contactData[2]));
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
