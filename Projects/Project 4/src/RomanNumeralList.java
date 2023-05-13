/**
 * RomanNumeralList represents a singly linked list of Roman numerals.
 * It provides operations to add elements, and retrieve the list as a string in Roman or Arabic numeral form.
 */
public class RomanNumeralList {

    protected RomanNumeralListNode first;
    protected RomanNumeralListNode last;
    protected int length;

    /**
     * Constructs an empty RomanNumeralList object.
     * Initializes the first and last nodes of the list.
     */
    public RomanNumeralList() {
        RomanNumeralListNode ln = new RomanNumeralListNode();
        first = ln;
        last = ln;
        length = 0;
    }

    /**
     * Appends a Roman numeral to the end of the list.
     *
     * @param numeral the Roman numeral to be appended
     */
    public void append(RomanNumeral numeral) {
        RomanNumeralListNode node = new RomanNumeralListNode(numeral);
        last.next = node;
        last = node;
        length++;
    }

    /**
     * Returns a string representation of the Roman numerals in the list, in their Roman numeral form.
     *
     * @return the string representation of Roman numerals
     */
    public String toRomanString() {
        String romanString = "";
        RomanNumeralListNode node = first.next;
        while (node != null) {
            romanString += (node.data.getSymbol() + "\n");
            node = node.next;
        }
        return romanString;
    }

    /**
     * Returns a string representation of the Roman numerals in the list, in their Arabic numeral form.
     *
     * @return the string representation of Arabic numerals
     */
    public String toArabicString() {
        String arabicString = "";
        RomanNumeralListNode node = first.next;
        while (node != null) {
            arabicString += (node.data.getValue() + "\n");
            node = node.next;
        }
        return arabicString;
    }
}
