package Module3OOP.Enum.Exercise2;

public class Vegetarian {
    public boolean isVegetarian(Food[] foods) {
        for (Food food : foods) {
            if (!food.getFoodType().isVegetarian) {
                return false;
            }
        }
        return true;
    }
}
