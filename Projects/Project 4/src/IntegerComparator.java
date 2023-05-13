import java.util.Comparator;

/**
 * Comparator implementation for comparing Integer objects.
 * This comparator compares Integers in their natural order.
 */
public class IntegerComparator implements Comparator<Integer> {

    /**
     * Compares two Integer objects for order.
     *
     * @param x the first Integer to compare
     * @param y the second Integer to compare
     * @return a negative integer, zero, or a positive integer as the first Integer is less than,
     * equal to, or greater than the second Integer
     */
    public int compare(Integer x, Integer y) {
        return Integer.compare(x, y);
    }
}