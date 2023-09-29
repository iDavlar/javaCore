package module8SOLID.annotation.exercise3;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Parameter;

public class Cat {
    public static Cat catCreator() {
        try {
            Constructor<Cat> constructor = Cat.class.getConstructor();
            return constructor.newInstance();
        } catch (NoSuchMethodException | InvocationTargetException
                 | InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    public static void catLife() {
        Cat.catCreator().eat().sleep(8);
    }

    public static void main(String[] args) {
        catLife();
    }

    public Cat eat() {
        System.out.println("Eat something");
        return this;
    }

    public Cat sleep(int hours) {
        System.out.println("Sleep for " + hours + " hours");
        return this;
    }

}
