package Module3OOP.Enum.Exercise2;

public class Cheese extends Food {
    public Cheese(String name) {
        super(name);
    }

    @Override
    public FoodType getFoodType() {
        return FoodType.DAIRY;
    }
}