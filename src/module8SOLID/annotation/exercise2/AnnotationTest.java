package module8SOLID.annotation.exercise2;

public class AnnotationTest {

    @Deprecated(since = "today")
    public String old() {
        return "text";
    }
}
