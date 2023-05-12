
public class RomanNumeralListNode {

    RomanNumeral data;
    RomanNumeralListNode next;

    public RomanNumeralListNode(RomanNumeral data, RomanNumeralListNode next) {
        this.data = data;
        this.next = next;
    }  // constructor

    public RomanNumeralListNode() {
        this.data = null;
        this.next = null;
    }  // constructor

    public RomanNumeralListNode(RomanNumeral data) {
        this.data = data;
        this.next = null;
    }  // constructor

}