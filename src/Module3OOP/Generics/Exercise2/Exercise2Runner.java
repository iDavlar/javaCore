package Module3OOP.Generics.Exercise2;


import javax.swing.*;

public class Exercise2Runner {
    public static void main(String[] args) {
        FunBox<String> funBox = new FunBox<>();
        funBox.add("first");
        funBox.add("second");
        funBox.add("third");
        funBox.add("fourth");

        getItemFromBox(funBox, 2);

        BoreBox<Integer> boreBox = new BoreBox<>(
                new Integer[]{
                        17,
                        19,
                        22,
                        56,
                        17
                }
        );

        getItemFromBox(boreBox, 2);

    }

    public static void getItemFromBox(CanGiveItems box, int index) {
        try {
            System.out.println((index + 1) + " item of " + box.getBoxName() + " is: " + box.getItem(index));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
