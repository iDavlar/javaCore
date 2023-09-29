package Module4Collections.Map.Exercise4;


import java.util.*;

public class Exercise4Runner {
    public static void main(String[] args) {

        System.out.println("MCMLXXXVI = " + romanToArabic("MCMLXXXVI")); // 1986
        System.out.println("XXI = " + romanToArabic("XXI")); // 21
        System.out.println("MMMM = " + romanToArabic("MMMM")); // 4000
        System.out.println("MMMMMCMXCIX = " + romanToArabic("MMMMMCMXCIX")); // 5999
        System.out.println("MCMXCVII = " + romanToArabic("MCMXCVII")); // 1997

    }

    private static long romanToArabic(String romanNumber) {
        HashMap<String, Long> romanToArabic = getRomanToArabicMap();

        char[] chars = romanNumber.toCharArray();
        long[] values = new long[chars.length];

        for (int i = 0; i < chars.length; i++) {
            values[i] = romanToArabic.get(String.valueOf(chars[i]));
            if (i > 0 && values[i - 1] < values[i]) {
                values[i - 1] = -values[i - 1];
            }
        }

        long result = 0;
        for (long value : values) {
            result += value;
        }
        return result;
    }

    private static HashMap<String, Long> getRomanToArabicMap() {
        HashMap<String, Long> romanToArabic = new HashMap<>();
        romanToArabic.put("M", 1000L);
        romanToArabic.put("D", 500L);
        romanToArabic.put("C", 100L);
        romanToArabic.put("L", 50L);
        romanToArabic.put("X", 10L);
        romanToArabic.put("V", 5L);
        romanToArabic.put("I", 1L);
        return romanToArabic;
    }

}
