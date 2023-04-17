public class UnsortedRomanNumeralList extends RomanNumeralList {

    public UnsortedRomanNumeralList() {

    }

    public void append(RomanNumeral s) {
        RomanNumeralListNode n = new RomanNumeralListNode(s);
        last.next = n;
        last = n;
        length++;
    }
}
