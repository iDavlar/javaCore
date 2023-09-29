package Module2ClassesAndObjects.Strings;


public class Exercise3Runner {
    public static void main(String[] args) {
        String str1 = "шалаш";
        String str2 = "шашлык";
        System.out.println("\"" + str1 + "\" палиндром - " + isPalindrome(str1));
        System.out.println("\"" + str2 + "\" палиндром - " + isPalindrome(str2));
    }

    public static boolean isPalindrome(String str) {
        return str.toLowerCase().equals(
                new StringBuilder(str.toLowerCase()).reverse().toString()
        );
    }
}
