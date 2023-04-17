public class SortedRomanNumeralList extends RomanNumeralList {

    public SortedRomanNumeralList() {

    }

    public void add(RomanNumeral r) {
        int newNum = r.getValue();
        RomanNumeralListNode newNode = new RomanNumeralListNode(r);
        RomanNumeralListNode node = first.next;
        RomanNumeralListNode prevNode = first;
        while (node != null) {
            int oldNum = node.data.getValue();
            if (newNum >= oldNum) {
                // Insert the new node after the previous node and before the current node
                newNode.next = node;
                prevNode.next = newNode;
                return;
            }
            prevNode = node;
            node = node.next;
        }
        // If the new node is the smallest, insert it at the beginning of the list
        prevNode.next = newNode;
    }
}
