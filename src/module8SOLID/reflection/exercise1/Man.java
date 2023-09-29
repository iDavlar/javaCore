package module8SOLID.reflection.exercise1;

import java.lang.reflect.Field;
import java.util.Arrays;

public class Man {
    private String name;

    public Man(String name) {
        this.name = name;
    }

    public static void showClassInfo() {
        System.out.println("Class " + Man.class.getName() + ":");
        System.out.println("Constructors:\n" + Arrays.toString(Man.class.getConstructors()));
        System.out.println("Fields:\n" + Arrays.toString(Man.class.getDeclaredFields()));
        System.out.println("Methods:\n" + Arrays.toString(Man.class.getDeclaredMethods()));
        System.out.println("Classes:\n" + Arrays.toString(Man.class.getDeclaredClasses()));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
