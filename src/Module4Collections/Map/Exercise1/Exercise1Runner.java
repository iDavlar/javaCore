package Module4Collections.Map.Exercise1;


import java.util.HashMap;
import java.util.Map;

public class Exercise1Runner {
    public static void main(String[] args) {
        HashMap<String, Toy> toys = new HashMap<>();
        toys.put("doll", new Toy("barbie", 6, 1000));
        toys.put("robot", new Toy("Karl", 8, 600));
        toys.put("constructor", new Toy("lego", 12, 2000));

        System.out.println("For each entries");
        for (Map.Entry entry : toys.entrySet()) {
            System.out.printf("Key = %s value = %s\n",
                    entry.getKey(),
                    entry.getValue().toString());
        }

        System.out.println("For each keys");
        for (String key : toys.keySet()) {
            System.out.printf("Key = %s\n", key);
        }

        System.out.println("For each values");
        for (Toy value : toys.values()) {
            System.out.printf("Value = %s\n", value.toString());
        }


    }

}
