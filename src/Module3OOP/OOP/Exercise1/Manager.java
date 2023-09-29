package Module3OOP.OOP.Exercise1;

public class Manager extends Employee {
    private static final int SALARY_MULTIPLIER = 5;

    public Manager(String name) {
        super(name);
    }

    @Override
    public int getSalary() {
        return super.getSalary() * SALARY_MULTIPLIER;
    }

    @Override
    void tellAboutYourself() {
        System.out.println("Hello, I am " + this.getName() + ", a manager and my salary is " + getSalary());
    }
}
