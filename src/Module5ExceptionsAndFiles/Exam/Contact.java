package Module5ExceptionsAndFiles.Exam;

import java.time.LocalDate;

public class Contact {
    private String name;
    private int number;
    private LocalDate createdDate;

    public Contact(String name, int number, LocalDate createdDate) {
        this.name = name;
        this.number = number;
        this.createdDate = createdDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer();
        sb.append(name).append(',');
        sb.append(number).append(',');
        sb.append(createdDate);
        return sb.toString();
    }
}
