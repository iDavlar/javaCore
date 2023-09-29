package Module4Collections.Sort.Exercise1;

import java.util.Comparator;

public class StudentAverageScoreComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        Float averageScore = s1.getAverageScore();
        return averageScore.compareTo(s2.getAverageScore());
    }
}
