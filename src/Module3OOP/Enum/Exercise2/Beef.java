package Module3OOP.Enum.Exercise2;

public class Beef extends Food {
    public Beef(String name) {
        super(name);
    }

    @Override
    public FoodType getFoodType() {
        return FoodType.MEAT;
    }
}
