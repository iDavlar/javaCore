package Module3OOP.OOP.Exercise1;

public abstract class Employee {
    private static final int MIN_SALARY_RATE = 15000;

    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return MIN_SALARY_RATE;
    }

    abstract void tellAboutYourself();
}
