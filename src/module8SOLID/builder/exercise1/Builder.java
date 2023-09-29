package module8SOLID.builder.exercise1;

import java.time.LocalDate;

public interface Builder {
    void setName(String name);

    void setSurname(String surname);

    void setBirthYear(LocalDate birthday);

    void setAddress(String address);
}
