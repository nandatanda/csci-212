import java.util.Comparator;

public class IntegerComparator implements Comparator<Integer> {

    public int compare(Integer o1, Integer o2) {
        return Integer.compare(o1, o2);
    }
}