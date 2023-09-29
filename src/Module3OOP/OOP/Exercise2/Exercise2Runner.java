package Module3OOP.OOP.Exercise2;

import java.text.SimpleDateFormat;
import java.util.Arrays;

public class Exercise2Runner {
    public static void main(String[] args) {
        Florist florist = new Florist();

        Flower[] bouquet = florist.createBouquet();
        System.out.println("You bouquet:");
        System.out.println(Arrays.toString(bouquet));
        System.out.println("and it's cost: " + florist.priceTheBouquet(bouquet));
        System.out.println("Used colors: " + Arrays.toString(florist.determineTheColours(bouquet)));
        System.out.println("Bouquet will expiring: "
                + new SimpleDateFormat("yyyy-MM-dd").format(florist.determineExpiryDate(bouquet)));
    }
}
