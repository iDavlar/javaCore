package Module4Collections.Exam;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;

public class Manager {

    public static void main(String[] args) {
        Cart cart = new Cart();
        Product cake = new Product("Cake", 500);
        addToCart(cart, cake, 2);
        addToCart(cart, new Product("Bread", 100), 1);
        addToCart(cart, new Product("Fish", 2500), 3);
        addToCart(cart, new Product("Meet", 2000), 5);

        System.out.println(cart);

        addToCart(cart, cake, 4);
        addToCart(cart, new Product("Meet", 2100), 2);
        System.out.println(cart);

        showCart(cart);
        showCart(cart);
        showCart(cart);

    }

    public static void addToCart(Cart cart, Product key, Integer value) {
        boolean replace = false;
        if (cart.containsKey(key)) {
            Scanner sc = new Scanner(System.in);
            System.out.println("The item's already in the basket. Replace it?(y/n)");
            replace = (sc.next().toLowerCase() == "y" ? true : false);
        }
        cart.put(key, value, replace);
    }

    public static void showCart(Cart cart) {
        Comparator comparator = getComparator();
        ArrayList products = cart.getProductsList();
        products.sort(comparator);
        System.out.println(products);
    }

    private static Comparator getComparator() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select a sorting method:");
        System.out.println("0 - by Name");
        System.out.println("1 - by Price");
        System.out.println("2 - by Name after Price");
        switch (sc.next()) {
            case "1":
                return new CartEntryPriceComparator();
            case "2":
                return new CartEntryNameComparator().thenComparing(new CartEntryPriceComparator());
            default:
                return new CartEntryNameComparator();
        }
    }
}
