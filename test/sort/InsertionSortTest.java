package sort;

import org.junit.Test;

import static org.junit.Assert.*;

public class InsertionSortTest {

    @Test
    public void testSwap(){
        int[] values = {3, 2};
        int [] expected = {2, 3};
        InsertionSort testSort = new InsertionSort();
        values = testSort.swap(values, 0);
        assertArrayEquals(expected, values);
    }

}