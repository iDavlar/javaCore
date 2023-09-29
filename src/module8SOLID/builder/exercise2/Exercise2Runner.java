package module8SOLID.builder.exercise2;

import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

public class Exercise2Runner {
    public static void main(String[] args) {
        Person person = Person.builder()
                .name("Daniil")
                .surname("Ardukov")
                .address(
                        Address.builder()
                                .city("Actay")
                                .country("Kazahstan")
                                .houseNumber(8)
                                .street("3")
                                .build()
                )
                .birthInfo(
                        BirthInfo.builder()
                                .birthday(LocalDate.of(1997, Month.NOVEMBER, 28))
                                .birthTime(LocalTime.now())
                                .height(50.0)
                                .weight(3500.0)
                                .build()
                )
                .build();

        System.out.println(person);
    }


}
