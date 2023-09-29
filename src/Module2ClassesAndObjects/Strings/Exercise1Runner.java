package Module2ClassesAndObjects.Strings;

import Module2ClassesAndObjects.ClassesAndObjects.Phone;

public class Exercise1Runner {
    public static void main(String[] args) {
        doStringsMethods("I like Java!!!");
        doStringsMethods("I don't like Java!");
    }

    public static void doStringsMethods(String str) {
        System.out.println("Последний символ: " + str.charAt(str.length() - 1));
        System.out.println("Закантивается на \"!!!\": " + str.endsWith("!!!"));
        System.out.println("Начинается на \"I like\": " + str.startsWith("I like"));
        if (str.contains("Java")) {
            System.out.println("Содержит \"Java\"!");
            System.out.println("На позиции: " + str.indexOf("Java"));
        } else {
            System.out.println("Не содержит \"Java\"!");
        }
        System.out.println(str.replace("a", "o"));
        System.out.println(str.toUpperCase());
        System.out.println(str.substring(0, str.indexOf("Java"))
                + str.substring(str.indexOf("Java") + "Java".length() , str.length()));
    }
}
