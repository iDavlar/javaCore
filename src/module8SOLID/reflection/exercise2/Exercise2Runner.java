package module8SOLID.reflection.exercise2;

import module8SOLID.reflection.exercise1.Man;

import java.lang.reflect.InvocationTargetException;

public class Exercise2Runner {
    public static void main(String[] args) {
        try {
            Exercise2Runner.class.getMethod("printHelloWorld").invoke(Exercise2Runner.class);
        } catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    public static void printHelloWorld(){
        System.out.println("Hello world!");
    }
}
