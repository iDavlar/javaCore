package Module4Collections.Sort.Exercise1;

import java.util.*;

public class Exercise1Runner {
    public static void main(String[] args) {
        LinkedList<Student> students = new LinkedList<Student>();
        students.add(new Student("Peter", "A", 5.0f));
        students.add(new Student("Semen", "B", 3.0f));
        students.add(new Student("Sergei", "C", 2.9f));
        students.add(new Student("Sam", "A", 2.0f));
        students.add(new Student("Anne", "B", 3.1f));

        System.out.println("Students: " + students);
        System.out.println("Without bad student: " + delBadStudents(students));

        Collections.sort(students);
        System.out.println("Sorted by name: " + students);

        students.sort(new StudentGroupComparator());
        System.out.println("Sorted by group: " + students);

        students.sort(new StudentAverageScoreComparator());
        System.out.println("Sorted by average score: " + students);

        students.sort(new StudentGroupComparator().thenComparing(new StudentAverageScoreComparator()));
        System.out.println("Sorted by average score after group: " + students);

    }

    private static LinkedList<Student> delBadStudents(LinkedList<Student> students) {
        students = new LinkedList<Student>(students);
        //students.removeIf(n -> n.isBad());
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().isBad()) {
                iterator.remove();
            }
        }
        return students;
    }
}
