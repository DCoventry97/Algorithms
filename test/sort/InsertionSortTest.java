package sort;

import org.junit.Test;

import static org.junit.Assert.*;

public class InsertionSortTest {

    //tests swap function of insertion sort.
    @Test
    public void testSwap(){
        int[] values = {3, 2};
        int [] expected = {2, 3};
        InsertionSort testSort = new InsertionSort();
        values = testSort.swap(values, 1);
        assertArrayEquals(expected, values);
    }

    //tests sorting a small array with 2 unordered elements.
    @Test
    public void testSortOnSmallUnsortedArray(){
        int values[] = {2, 1};
        int expected[] = {1, 2};
        InsertionSort testSort = new InsertionSort();
        values = testSort.sort(values);
        assertArrayEquals(expected, values);
    }

}