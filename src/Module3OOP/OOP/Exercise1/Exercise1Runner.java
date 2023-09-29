package Module3OOP.OOP.Exercise1;

public class Exercise1Runner {
    public static void main(String[] args) {
        Employee[] employees = {
                new Crafter("Semen", 977),
                new Crafter("Vova", 650),
                new Crafter("Joe", 1000),
                new Crafter("Sveta", 1200),
                new Administrator("Max", 0.97),
                new Administrator("Kirill", 1.2),
                new Administrator("John", 0.7)
        };

        for (Employee employee : employees) {
            employee.tellAboutYourself();
        }
    }
}
