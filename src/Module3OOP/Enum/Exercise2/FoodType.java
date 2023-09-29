package Module3OOP.Enum.Exercise2;

public enum FoodType {
    PORRIDGE(true), BREAD(true), SOUP(true),
    VEGETABLE(true), NUT(true), FRUIT(true),
    DAIRY(true), FISH(false), GREENS(true),
    MEAT(false), UNKNOWN(false);

    public boolean isVegetarian;

    FoodType(boolean isVegetarian) {
        this.isVegetarian = isVegetarian;
    }
}
