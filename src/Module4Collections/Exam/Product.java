package Module4Collections.Exam;

import java.util.Objects;

public class Product {
    private final String name;
    private final Integer price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return price == product.price && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Product(");
        sb.append(name).append(", ");
        sb.append(price);
        sb.append(')');
        return sb.toString();
    }

}
