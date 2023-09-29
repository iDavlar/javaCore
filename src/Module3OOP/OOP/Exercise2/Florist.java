package Module3OOP.OOP.Exercise2;

import java.util.*;
import java.util.concurrent.Flow;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Florist {

    private static final Flower[] FLOWERS_TYPES = {
            new Rose(),
            new Tulip(),
            new Lily(),
            new Carnation(),
            new ForgetMeNot()
    };
    private static final double[] PRICES = {
            500,
            439.9,
            300,
            600,
            999.99
    };
    private static final String[] COLORS = {
            "yellow",
            "black",
            "green",
            "violet",
            "gray",
            "blue",
            "red",
            "white"
    };

    private static final Date[] RECEIPT_DATES = {
            new Date(),
            new Date(123, Calendar.AUGUST, 1),
            new Date(123, Calendar.JULY, 31),
            new Date(123, Calendar.AUGUST, 5),
            new Date(123, Calendar.AUGUST, 6),
            new Date(123, Calendar.AUGUST, 13),
            new Date(123, Calendar.JULY, 25),
            new Date(123, Calendar.AUGUST, 29)
    };

    public Flower[] createBouquet() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Flowers in bouquet: ");
        int numberOfFlowers = scanner.nextInt();

        return generateBouquet(numberOfFlowers);
    }

    private Flower[] generateBouquet(int numberOfFlowers) {
        Flower[] result = new Flower[numberOfFlowers];
        for (int i = 0; i < numberOfFlowers; i++) {
            result[i] = generateFlower();
        }

        return result;
    }

    private Flower generateFlower() {
        Random random = new Random();
        int index = random.nextInt(FLOWERS_TYPES.length);

        Flower result = FLOWERS_TYPES[index].clone();
        result.setPrice(PRICES[index]);
        result.setColor(COLORS[random.nextInt(COLORS.length)]);
        result.setReceiptDate(RECEIPT_DATES[random.nextInt(RECEIPT_DATES.length)]);
        result.setShelfLife(random.nextInt(result.getMaxShelfLife()));

        return result;
    }

    public double priceTheBouquet(Flower[] flowers) {
        double result = 0;
        for (Flower flower : flowers) {
            result += flower.getPrice();
        }
        return result;
    }

    public String[] determineTheColours(Flower[] flowers) {
        ArrayList<String> arrayList = new ArrayList<>();
        for (Flower flower : flowers) {
            arrayList.add(flower.getColor());
        }
        return arrayList.stream().distinct().toArray(String[]::new);
    }

    public Date determineExpiryDate(Flower[] flowers) {
        Date maxDate = new Date(0, Calendar.JANUARY, 1);
        for (Flower flower : flowers) {
            Date currentExpiryDate = flower.getExpiryDate();
            if (maxDate.compareTo(currentExpiryDate) < 0) {
                maxDate = currentExpiryDate;
            }
        }
        return maxDate;
    }
}
