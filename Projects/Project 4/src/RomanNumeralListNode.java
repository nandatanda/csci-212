/**
 * RomanNumeralListNode represents a node in a singly linked list of Roman numerals.
 */
public class RomanNumeralListNode {

    RomanNumeral data;
    RomanNumeralListNode next;

    /**
     * Constructs a RomanNumeralListNode object with the specified data and next node.
     *
     * @param data the Roman numeral data stored in the node
     * @param next the next node in the linked list
     */
    public RomanNumeralListNode(RomanNumeral data, RomanNumeralListNode next) {
        this.data = data;
        this.next = next;
    }

    /**
     * Constructs a RomanNumeralListNode object with null data and null next node.
     */
    public RomanNumeralListNode() {
        this.data = null;
        this.next = null;
    }

    /**
     * Constructs a RomanNumeralListNode object with the specified data and null next node.
     *
     * @param data the Roman numeral data stored in the node
     */
    public RomanNumeralListNode(RomanNumeral data) {
        this.data = data;
        this.next = null;
    }
}