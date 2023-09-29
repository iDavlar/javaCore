package Module4Collections.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Exercise1Runner {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> marks = new ArrayList<Integer>(20);
        for (int i = 0; i < 20; i++) {
            marks.add(random.nextInt(4) + 2);
        }

        System.out.println(marks);
        removeAll(marks, 2);
        System.out.println(marks);

        System.out.println("The max mark: " + getMaxMarks(marks));
    }

    private static void removeAll(ArrayList<Integer> marks, int removedValue) {
        marks.removeIf(n -> n == removedValue);
    }

    private static int getMaxMarks(ArrayList<Integer> marks) {
        Iterator<Integer> iterator = marks.iterator();
        int maxMarks = 0;
        while (iterator.hasNext()) {
            int currentElem = iterator.next();
            if (currentElem > maxMarks) {
                maxMarks = currentElem;
            }
        }
        return maxMarks;
    }
}
