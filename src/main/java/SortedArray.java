import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

public class SortedArray {
    public static void main(String[] args) {

        int[] arr = {-1, 3, -3, 1, -5, 6, -7, 8, -9, 10};
        System.out.println(Arrays.toString(mySort(arr)));
    }
    static int[] mySort(int[] arr) {
        int[] primitive = IntStream.of(arr).boxed()
                .filter(number -> number >= 0)
                .sorted(Comparator.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();
        return primitive;
    }
}

