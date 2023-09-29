package Module3OOP.Enum.Exercise2;

public class Exercise2Runner {
    public static void main(String[] args) {
        Food[] stew = {
                new Beef("marbled"),
                new Potatoes("garden")
        };

        Food[] cheesePotatoes = {
                new Cheese("mozzarella"),
                new Potatoes("garden")
        };

        Vegetarian dude = new Vegetarian();
        System.out.println("Stew is"
                + (dude.isVegetarian(stew) ? "" : " no")
                + " vegetarian");

        System.out.println("Cheese potatoes is"
                + (dude.isVegetarian(cheesePotatoes) ? "" : " no")
                + " vegetarian");
    }
}
