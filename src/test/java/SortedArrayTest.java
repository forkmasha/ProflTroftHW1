import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SortedArrayTest {

    @Test
    public void sortNumbers() {
        int[] arr = {3, 2, 1, -4, 5, 6, 7, -8, 10, 9};
        int[] expected = {10, 9, 7, 6, 5, 3, 2, 1};
        assertArrayEquals(expected, SortedArray.getPositiveReverseSortedNumbers(arr));
    }

    @Test
    public void negativeNumbers() {
        int[] arr = {-1, -2, -3, -8, -4};
        int[] expected = {};
        assertArrayEquals(expected, SortedArray.getPositiveReverseSortedNumbers(arr));
    }

    @Test
    public void emptyArray() {
        int[] arr = {};
        int[] expected = {};
        assertArrayEquals(expected, SortedArray.getPositiveReverseSortedNumbers(arr));
    }

    @Test
    public void positiveNumbers() {
        int[] arr = {3, 4, 5, 6, 7, 9, 10};
        int[] expected = {10, 9, 7, 6, 5, 4, 3};
        assertArrayEquals(expected, SortedArray.getPositiveReverseSortedNumbers(arr));
    }
}