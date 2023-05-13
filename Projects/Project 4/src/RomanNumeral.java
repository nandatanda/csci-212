import java.util.HashMap;
import java.util.Map;

/**
 * Represents a Roman numeral and provides methods to manipulate and compare Roman numerals.
 */
public class RomanNumeral {

    private String symbol;
    private int value;

    /**
     * Constructs a RomanNumeral object with the specified symbol.
     *
     * @param symbol the Roman numeral symbol
     */
    public RomanNumeral(String symbol) {
        this.symbol = symbol;
        this.value = valueOf(symbol);
    }

    /**
     * Returns the symbol of the RomanNumeral.
     *
     * @return the symbol of the RomanNumeral
     */
    public String getSymbol() {
        return symbol;
    }

    /**
     * Sets the symbol of the RomanNumeral and updates its value.
     *
     * @param symbol the new symbol for the RomanNumeral
     */
    public void setSymbol(String symbol) {
        this.symbol = symbol;
        this.value = valueOf(symbol);
    }

    /**
     * Returns the integer value of the RomanNumeral.
     *
     * @return the integer value of the RomanNumeral
     */
    public int getValue() {
        return value;
    }

    /**
     * Returns the string representation of the integer value of the RomanNumeral.
     *
     * @return the string representation of the integer value
     */
    public String getValueString() {
        return Integer.toString(value);
    }

    /**
     * Checks if this RomanNumeral is equal to the specified RomanNumeral.
     * Two RomanNumeral objects are considered equal if their integer values are equal.
     *
     * @param r the RomanNumeral to compare to
     * @return {@code true} if the RomanNumeral objects are equal, {@code false} otherwise
     */
    public boolean equals(RomanNumeral r) {
        return value == r.getValue();
    }

    /**
     * Returns the integer value of a Roman numeral string.
     *
     * @param s the Roman numeral string
     * @return the integer value of the Roman numeral
     * @throws IllegalArgumentException if the Roman numeral string is invalid
     */
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