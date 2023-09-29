package Module3OOP.OOP.Exercise1;

public class Administrator extends Manager {
    private double kpi;

    public Administrator(String name, double kpi) {
        super(name);
        this.kpi = kpi;
    }

    @Override
    public int getSalary() {
        return (int) (super.getSalary() * getKpi());
    }

    public double getKpi() {
        return kpi;
    }

}
