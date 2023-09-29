package Module4Collections.Sort.Exercise1;

public class Student implements Comparable<Student> {
    private String name;
    private String group;
    private float averageScore;

    public Student(String name, String group, float averageScore) {
        this.name = name;
        this.group = group;
        this.averageScore = averageScore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public float getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(float averageScore) {
        this.averageScore = averageScore;
    }

    public boolean isBad() {
        return this.averageScore < 3.0f;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Student(");
        sb.append(name);
        sb.append(", ").append(group);
        sb.append(", ").append(averageScore);
        sb.append(")");
        return sb.toString();
    }

    @Override
    public int compareTo(Student s) {
        return this.name.compareTo(s.name);
    }
}
