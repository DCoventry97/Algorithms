package sort;

import org.junit.Test;

import static org.junit.Assert.*;

public class SelectionSortTest {

    //tests swap function to ensure that it swaps the positions of 2 elements in an array.
    @Test
    public void testSwap(){
        int[] values = {3, 2};
        int[] expected = {2, 3};
        SelectionSort testSort = new SelectionSort();
        testSort.swap(values, 1, 0);
        assertArrayEquals(expected, values);
    }

    //tests sorting a small array which contains 3 elements.
    @Test
    public void testSortSmallArray(){
        int[] values = {2, 3, 1};
        int[] expected = {1, 2, 3};
        SelectionSort testSort = new SelectionSort();
        testSort.sort(values);
        assertArrayEquals(expected, values);
    }

    //tests sorting a larger array with 10 elements.
    @Test
    public void testSortLargeArray(){
        int[] values = {5, 2, 3, 8, 6, 9, 1, 10, 4, 7};
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        SelectionSort testSort = new SelectionSort();
        testSort.sort(values);
        assertArrayEquals(expected, values);
    }

    //tests sorting an array which is already sorted.
    @Test
    public void testSortedArray(){
        int[] values = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        SelectionSort testSort = new SelectionSort();
        testSort.sort(values);
        assertArrayEquals(expected, values);
    }

}