import java.util.Comparator;

public class IntegerComparator implements Comparator<Integer> {

    public int compare(Integer x, Integer y) {
        return Integer.compare(x, y);
    }
}