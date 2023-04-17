
public class RomanNumeralListIterator {

    private RomanNumeralListNode node;

    public RomanNumeralListIterator(RomanNumeralListNode first) {
        node = first;
    }

    public boolean hasNext() {
        return (node != null);
    }

    public RomanNumeral next() {
        if (node == null)
            throw new NullPointerException("Linked list empty.");
        RomanNumeral currentData = node.data;
        node = node.next;
        return currentData;
    }

}