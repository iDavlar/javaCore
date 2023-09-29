package module8SOLID.builder.exercise1;

import java.time.LocalDate;
import java.util.Scanner;

public class InteractivePersonBuilder implements InteractiveBuilder {
    private String name;
    private String surname;
    private LocalDate birthYear;
    private String address;

    public Person createPerson() {
        return new Person(
                this.name,
                this.surname,
                this.birthYear,
                this.address
        );
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public void setBirthYear(LocalDate birthYear) {
        this.birthYear = birthYear;
    }

    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public void showSetName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        this.name = scanner.next();
    }

    @Override
    public void showSetSurname() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter surname: ");
        this.surname = scanner.next();
    }

    @Override
    public void showSetBirthYear() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter birth year: ");
        this.birthYear = LocalDate.of(scanner.nextInt(), 1, 1);
    }

    @Override
    public void showSetAddress() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter address: ");
        this.address = scanner.nextLine();

    }
}
