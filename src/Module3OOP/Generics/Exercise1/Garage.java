package Module3OOP.Generics.Exercise1;

public class Garage<T extends Vehicle> {
    private T vehicle;

    public Garage(T vehicle) {
        this.vehicle = vehicle;
    }

    public String getVehiclesName() {
        return this.vehicle.getName();
    }
}
