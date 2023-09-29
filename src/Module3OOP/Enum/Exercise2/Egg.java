package Module3OOP.Enum.Exercise2;

public class Egg extends Food {
    public Egg(String name) {
        super(name);
    }

    @Override
    public FoodType getFoodType() {
        return FoodType.UNKNOWN;
    }
}