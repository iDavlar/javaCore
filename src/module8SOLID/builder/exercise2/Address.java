package module8SOLID.builder.exercise2;

import lombok.*;

@AllArgsConstructor
@Builder
@Data
public class Address {
    private String country;
    private String city;
    private String street;
    private Integer houseNumber;

}
