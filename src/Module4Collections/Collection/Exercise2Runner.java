package Module4Collections.Collection;

import java.util.*;

public class Exercise2Runner {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> values = new ArrayList<Integer>(100);
        for (int i = 0; i < 100; i++) {
            values.add(random.nextInt(100));
        }
        System.out.println("list");
        System.out.println(values);
        System.out.println("Sorted by stream:");
        System.out.println(values.stream().distinct().toList());
        System.out.println("Sorted by HashSet:");
        System.out.println(new HashSet<Integer>(values));
        System.out.println("Sorted by TreeSet:");
        System.out.println(new TreeSet<Integer>(values));
        System.out.println("Sorted by method:");
        System.out.println(removeIdentical(values));

    }

    public static ArrayList<Integer> removeIdentical(ArrayList<Integer> list) {
        list = new ArrayList<>(list);

        int index = 0;
        for (int i = 0; i < list.size(); i++) {
            int value = list.get(i);
            int lastIndex = list.lastIndexOf(value);
            while (index != lastIndex) {
                list.remove(lastIndex);
                lastIndex = list.lastIndexOf(value);
            }
            index++;
        }

        return list;
    }
}
