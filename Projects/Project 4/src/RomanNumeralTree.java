import java.util.TreeMap;

/**
 * RomanNumeralTree represents a sorted tree-based collection of Roman numerals.
 */
public class RomanNumeralTree {

    private TreeMap<Integer, String> map;

    /**
     * Constructs a RomanNumeralTree object with an empty TreeMap using a custom comparator for sorting.
     */
    public RomanNumeralTree() {
        map = new TreeMap<>(new IntegerComparator());
    }

    /**
     * Adds a RomanNumeral to the tree.
     *
     * @param r the RomanNumeral to be added
     */
    public void add(RomanNumeral r) {
        int value = r.getValue();
        String symbol = r.getSymbol();

        map.put(value, symbol);
    }

    /**
     * Returns a string representation of the Roman numerals in the tree, in their Roman numeral form.
     *
     * @return the string representation of Roman numerals
     */
    public String toRomanString() {
        String romanString = "";

        for (String symbol : map.values()) {
            romanString += symbol + "\n";
        }
        return romanString;
    }

    /**
     * Returns a string representation of the Roman numerals in the tree, in their Arabic numeral form.
     *
     * @return the string representation of Arabic numerals
     */
    public String toArabicString() {
        String arabicString = "";

        for (int value : map.keySet()) {
            arabicString += value + "\n";
        }
        return arabicString;
    }
}