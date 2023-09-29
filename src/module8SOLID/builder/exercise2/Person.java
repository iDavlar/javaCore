package module8SOLID.builder.exercise2;

import lombok.*;

import java.time.LocalDate;

@AllArgsConstructor
@Builder
@Data
public class Person {
    private String name;
    private String surname;
    private BirthInfo birthInfo;
    private Address address;
}
