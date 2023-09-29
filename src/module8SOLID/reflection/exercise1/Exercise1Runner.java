package module8SOLID.reflection.exercise1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Exercise1Runner {
    public static void main(String[] args) {
        Man man = new Man("Ivan");
        Class<? extends Man> classMan = man.getClass();
        try {
            classMan.getMethod("showClassInfo").invoke(man);
        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
