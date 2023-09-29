package module8SOLID.builder.exercise1;

import java.time.LocalDate;

public class Person {
    private String name;
    private String surname;
    private LocalDate birthYear;
    private String address;

    public Person(String name, String surname, LocalDate birthYear, String address) {
        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
        this.address = address;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Person{");
        sb.append("name='").append(name).append('\'');
        sb.append(", surname='").append(surname).append('\'');
        sb.append(", birthYear=").append(birthYear);
        sb.append(", address='").append(address).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(LocalDate birthYear) {
        this.birthYear = birthYear;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
