package Module3OOP.OOP.Exercise1;

public class Crafter extends Worker {
    private static double plan = 1000.0;
    private double fact;

    public Crafter(String name, double fact) {
        super(name);
        this.fact = fact;
    }

    @Override
    public int getSalary() {
        return (int) (super.getSalary() * this.getFact() / plan);
    }

    private double getFact() {
        return fact;
    }
}
