package Module4Collections.Sort.Exercise2;

import java.security.KeyStore;
import java.util.Comparator;
import java.util.Map;

public class EntryValueComparator<T extends Comparable, V extends Comparable> implements Comparator<T> {

    private Map<T, V> map;

    public EntryValueComparator(Map<T, V> map) {
        this.map = map;
    }

    @Override
    public int compare(T e1, T e2) {
        if (map.containsKey(e1) && map.containsKey(e2)) {
            return map.get(e1).compareTo(map.get(e2));
        } else {
            return e1.compareTo(e2);
        }
    }
}
