package Module3OOP.OOP.Exercise2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Carnation extends Flower {
    public static int MAX_SHELF_LIFE = 9;

    @Override
    public Flower clone() {
        return new Carnation();
    }

    @Override
    public int getMaxShelfLife() {
        return MAX_SHELF_LIFE;
    }

    @Override
    public String toString() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return getColor() + " carnation " + dateFormat.format(getReceiptDate()) + " - " + dateFormat.format(this.getExpiryDate()) + " : " + getPrice();
    }
}
