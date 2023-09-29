import java.util.Collections;
import java.util.HashMap;
import java.util.Random;
import java.util.SortedMap;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    int i = 0;

    public static void main(String[] args) {
        System.out.println(isIsomorphic("egg", "add"));
        System.out.println(isIsomorphic("foo", "bar"));
        System.out.println(isIsomorphic("paper", "title"));

        System.out.println(isIsomorphic("add", "egg"));
        System.out.println(isIsomorphic("bar", "foo"));
        System.out.println(isIsomorphic("title", "paper"));
    }

    public static boolean isIsomorphic(String s, String t) {
        if (s.equals(t)) {
            return true;
        } else if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Character> charMap = new HashMap<>();
        char[] charS = s.toCharArray();
        char[] charT = t.toCharArray();
        for (int i = 0; i < charS.length; i++) {
            if (charMap.containsKey(charS[i])) {
                if (!charMap.get(charS[i]).equals(charT[i])) {
                    return false;
                }
            } else {
                if (charMap.containsValue(charT[i])) {
                    return false;
                }
                charMap.put(charS[i], charT[i]);
            }
        }

        return true;
    }
}