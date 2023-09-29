package Module3OOP.OOP.Exercise2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Lily extends Flower {
    public static int MAX_SHELF_LIFE = 7;

    @Override
    public Flower clone() {
        return new Lily();
    }

    @Override
    public int getMaxShelfLife() {
        return MAX_SHELF_LIFE;
    }

    @Override
    public String toString() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return getColor() + " lily " + dateFormat.format(getReceiptDate()) + " - " + dateFormat.format(this.getExpiryDate()) + " : " + getPrice();
    }
}
