package module8SOLID.builder.exercise1;

import java.time.LocalDate;

public interface InteractiveBuilder extends Builder {
    void showSetName();

    void showSetSurname();

    void showSetBirthYear();

    void showSetAddress();
}
