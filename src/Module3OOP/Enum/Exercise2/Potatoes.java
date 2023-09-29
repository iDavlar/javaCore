package Module3OOP.Enum.Exercise2;

public class Potatoes extends Food {
    public Potatoes(String name) {
        super(name);
    }

    @Override
    public FoodType getFoodType() {
        return FoodType.VEGETABLE;
    }
}