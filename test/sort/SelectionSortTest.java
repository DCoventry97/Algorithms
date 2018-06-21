package sort;

import org.junit.Test;

import static org.junit.Assert.*;

public class SelectionSortTest {

    @Test
    public void TestSwap(){
        int[] values = {3, 2};
        int[] expected = {2, 3};
        SelectionSort testSort = new SelectionSort();
        testSort.swap(values, 1, 0);
        assertArrayEquals(expected, values);
    }

}