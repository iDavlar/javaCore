package module8SOLID.reflection.exercise3;

import module8SOLID.reflection.exercise1.Man;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Exercise3Runner {
    public static void main(String[] args) {
        Class<? extends Map> classMap = HashMap.class;
        System.out.println("Class " + classMap.getName() + ":");
        System.out.println("Extended:\n" + classMap.getSuperclass());
        System.out.println("Implemented:\n" + Arrays.toString(classMap.getInterfaces()));
        System.out.println("Constructors:\n" + Arrays.toString(classMap.getConstructors()));
        System.out.println("Fields:\n" + Arrays.toString(classMap.getDeclaredFields()));
        System.out.println("Methods:\n" + Arrays.toString(classMap.getDeclaredMethods()));
        System.out.println("Classes:\n" + Arrays.toString(classMap.getDeclaredClasses()));
    }
}
