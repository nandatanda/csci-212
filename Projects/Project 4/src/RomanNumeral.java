import java.util.HashMap;
import java.util.Map;

public class RomanNumeral {

    private String symbol;
    private int value;

    public RomanNumeral(String s) {
        symbol = s;
        value = valueOf(s);
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String s) {
        symbol = s;
        value = valueOf(s);
    }

    public int getValue() {
        return value;
    }

    public String getValueString() {
        // Return the numeral's arabic conversion as a String
        return Integer.toString(value);
    }

    public boolean equals(RomanNumeral r) {
        // Compare the integer value of two RomanNumeral objects
        return value == r.getValue();
    }

    private int valueOf(String s) throws IllegalArgumentException {
        // Create a map to store the translation of each Roman numeral character
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        // Return the integer value of a Roman numeral
        int result = 0;
        int previousValue = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            int value = map.getOrDefault(c, 0);
            if (value == 0) {
                throw new IllegalArgumentException("Invalid Roman numeral: " + s);
            }
            if (value < previousValue) {
                result -= value;
            } else {
                result += value;
            }
            previousValue = value;
        }
        return result;
    }
}