package Module2ClassesAndObjects.Strings;


public class Exercise4Runner {
    public static void main(String[] args) {
        System.out.println("Two middle characters of \"string\" is "
                + getTwoMiddles("string"));
        System.out.println("Two middle characters of \"code\" is "
                + getTwoMiddles("code"));
        System.out.println("Two middle characters of \"Practice\" is "
                + getTwoMiddles("Practice"));
        System.out.println("Two middle characters of \"Try\" is "
                + getTwoMiddles("Try"));
    }

    public static String getTwoMiddles(String str) {
        int strLength = str.length();
        if (strLength % 2 != 0) {
            return "odd length";
        } else {
            strLength /= 2;
            return str.substring(strLength - 1, strLength + 1);
        }

    }
}
