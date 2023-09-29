package module8SOLID.annotation.exercise1;

import java.lang.reflect.Method;

public class Exercise1Runner {
    public static void main(String[] args) {
        Method[] methods = Exercise1Runner.class.getMethods();
        for (Method m : methods) {
            if (m.isAnnotationPresent(AcademyInfo.class)) {
                System.out.println(m);
            }
        }
    }

    @AcademyInfo(year = "2023")
    public static void hello() {

    }

    public static void world() {

    }
}
