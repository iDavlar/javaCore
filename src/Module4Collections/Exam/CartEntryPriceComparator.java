package Module4Collections.Exam;

import java.util.Comparator;
import java.util.Map;

public class CartEntryPriceComparator implements Comparator<Map.Entry<Product, Integer>> {
    @Override
    public int compare(Map.Entry<Product, Integer> e1, Map.Entry<Product, Integer> e2) {
        return e1.getKey().getPrice().compareTo(e2.getKey().getPrice());
    }
}
