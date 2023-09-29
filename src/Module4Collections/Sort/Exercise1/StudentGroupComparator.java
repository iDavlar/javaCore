package Module4Collections.Sort.Exercise1;

import java.util.Comparator;

public class StudentGroupComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.getGroup().compareTo(s2.getGroup());
    }
}
