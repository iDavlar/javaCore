package Module3OOP.OOP.Exercise1;

public class Worker extends Employee {
    private static final int SALARY_MULTIPLIER = 3;

    public Worker(String name) {
        super(name);
    }

    @Override
    public int getSalary() {
        return super.getSalary() * SALARY_MULTIPLIER;
    }

    @Override
    void tellAboutYourself() {
        System.out.println("Hello, I am " + this.getName() + ", a worker and my salary is " + getSalary());
    }
}
