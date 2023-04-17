public class RomanNumeralList {

    protected RomanNumeralListNode first;
    protected RomanNumeralListNode last;
    protected int length;

    public RomanNumeralList() {
        RomanNumeralListNode ln = new RomanNumeralListNode();
        first = ln;
        last = ln;
        length = 0;
    }

    public void printList() {
        RomanNumeralListNode p = first.next;
        while (p != null) {
            System.out.println(p.data);
            p = p.next;
        }
    }

    public void printRoman() {
        RomanNumeralListNode node = first.next;
        while (node != null) {
            System.out.println(node.data.getNumeral());
            node = node.next;
        }
    }

    public void printArabic() {
        RomanNumeralListNode node = first.next;
        while (node != null) {
            System.out.println(node.data.getValue());
            node = node.next;
        }
    }

    public RomanNumeralListIterator reset() {
        return new RomanNumeralListIterator(first.next);
    }

}