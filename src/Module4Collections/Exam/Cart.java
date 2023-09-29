package Module4Collections.Exam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Cart extends HashMap<Product, Integer> {

    private Integer totalCost = 0;

    public Integer getTotalCost() {
        return totalCost;
    }

    public ArrayList<Map.Entry<Product, Integer>> getProductsList() {
        return new ArrayList<Map.Entry<Product, Integer>>(super.entrySet());
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Cart.\n");
        sb.append("Goods:\n");
        for (Entry entry : super.entrySet()) {
            sb.append(
                    String.format("\t%s num: %s\n",
                            entry.getKey().toString(),
                            entry.getValue().toString())
            );
        }
        sb.append("Total cost: ").append(this.getTotalCost());
        return sb.toString();
    }

    @Override
    public Integer put(Product key, Integer value) {
        this.totalCost += value * key.getPrice();
        return super.put(key,
                value + (super.containsKey(key) ? super.get(key) : 0)
        );
    }

    public Integer put(Product key, Integer value, boolean replace) {
        if (replace && super.containsKey(key)) {
            this.remove(key);
        }
        return this.put(key, value);
    }

    @Override
    public Integer remove(Object key) {
        this.totalCost -= super.get(key) * ((Product) key).getPrice();
        return super.remove(key);
    }

    public Integer remove(Product key, boolean removeAll) {
        int value = super.get(key);
        if (removeAll || value == 1) {
            return this.remove(key);
        } else {
            this.totalCost -= key.getPrice();
            return super.put(key, --value);
        }
    }
}
