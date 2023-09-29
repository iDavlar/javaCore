package Module3OOP.OOP.Exercise2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public abstract class Flower {
    private double price;
    private Date receiptDate;
    private int shelfLife;
    private String color;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getReceiptDate() {
        return receiptDate;
    }

    public void setReceiptDate(Date receiptDate) {
        this.receiptDate = receiptDate;
    }

    public int getShelfLife() {
        return shelfLife;
    }

    public void setShelfLife(int shelfLife) {
        this.shelfLife = shelfLife;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Date getExpiryDate() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(this.getReceiptDate());
        calendar.add(Calendar.DATE, this.getShelfLife());

        return calendar.getTime();
    }

    public abstract Flower clone();

    public abstract int getMaxShelfLife();

    @Override
    public String toString() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return color + " flower " + dateFormat.format(receiptDate) + " - " + dateFormat.format(this.getExpiryDate()) + " : " + price;
    }
}
