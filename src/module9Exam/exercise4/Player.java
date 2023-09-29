package module9Exam.exercise4;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Player {
    private String name;
    private Integer age;
    private boolean isActive;
}
