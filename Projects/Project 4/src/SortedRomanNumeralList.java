import java.util.TreeMap;

public class SortedRomanNumeralList {

    private TreeMap<Integer, String> map;

    public SortedRomanNumeralList() {
        map = new TreeMap<>(new IntegerComparator());
    }

    public void add(RomanNumeral r) {
        int value = r.getValue();
        String symbol = r.getSymbol();

        map.put(value, symbol);
    }

    public String getRomanString() {
        String romanString = "";

        for (String symbol : map.values()) {
            romanString += symbol + "\n";
        }
        return romanString;
    }

    public String getArabicString() {
        String arabicString = "";

        for (int value : map.keySet()) {
            arabicString += value + "\n";
        }
        return arabicString;
    }
}
