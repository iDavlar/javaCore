package Module4Collections.Map.Exercise5;


import java.util.Deque;
import java.util.LinkedHashMap;
import java.util.LinkedList;

public class Exercise5Runner {
    private static LinkedHashMap<Integer, String> arabicToRoman = getArabicToRomanMap();

    public static void main(String[] args) {

        System.out.println("1986 = " + arabicToRoman(1986)); // MCMLXXXVI
        System.out.println("21 = " + arabicToRoman(21)); // XXI
        System.out.println("4000 = " + arabicToRoman(4000)); // MMMM
        System.out.println("5999 = " + arabicToRoman(5999)); // MMMMMCMXCIX
        System.out.println("1997 = " + arabicToRoman(1997)); // MCMXCVII
        System.out.println("1888 = " + arabicToRoman(1888)); // MDCCCLXXXVIII

    }

    private static String arabicToRoman(int arabicNumber) {
        if (arabicNumber > 5999) {
            return "Impossible to convert";
        }

        Deque<String> romanNumbers = new LinkedList<>();
        int digit = 0;
        for (int i = arabicNumber; i > 0; i /= 10) {
            int minDigitNumber = (int) Math.pow(10, digit++);
            String minDigitRoman = arabicToRoman.get(minDigitNumber);
            int curNumber = i % 10 * minDigitNumber;

            while (!arabicToRoman.containsKey(curNumber) && curNumber > 0) {
                curNumber -= minDigitNumber;
                romanNumbers.addFirst(minDigitRoman);
            }
            if (curNumber > 0) {
                romanNumbers.addFirst(arabicToRoman.get(curNumber));
            }
        }

        StringBuilder result = new StringBuilder();
        while (!romanNumbers.isEmpty()) {
            result.append(romanNumbers.pollFirst());
        }

        return result.toString();
    }

    private static LinkedHashMap<Integer, String> getArabicToRomanMap() {
        LinkedHashMap<Integer, String> ArabicToRoman = new LinkedHashMap<>();
        ArabicToRoman.put(1000, "M");
        ArabicToRoman.put(900, "CM");
        ArabicToRoman.put(500, "D");
        ArabicToRoman.put(400, "CD");
        ArabicToRoman.put(100, "C");
        ArabicToRoman.put(90, "XC");
        ArabicToRoman.put(50, "L");
        ArabicToRoman.put(40, "XL");
        ArabicToRoman.put(10, "X");
        ArabicToRoman.put(9, "IX");
        ArabicToRoman.put(5, "V");
        ArabicToRoman.put(4, "IV");
        ArabicToRoman.put(1, "I");
        return ArabicToRoman;
    }

}
