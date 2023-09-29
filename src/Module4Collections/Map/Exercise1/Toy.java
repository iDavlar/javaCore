package Module4Collections.Map.Exercise1;

public class Toy {
    private String name;
    private int fromAge;
    private int price;

    public Toy(String name, int fromAge, int price) {
        this.name = name;
        this.fromAge = fromAge;
        this.price = price;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Toy(");
        sb.append(name);
        sb.append(", ").append(fromAge);
        sb.append(", ").append(price);
        sb.append(")");
        return sb.toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFromAge() {
        return fromAge;
    }

    public void setFromAge(int fromAge) {
        this.fromAge = fromAge;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
