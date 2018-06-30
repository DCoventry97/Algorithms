package sort;

import org.junit.Test;

import static org.junit.Assert.*;

public class MergeSortTest {

    //Tests merge function with 2 elements in an array.
    @Test
    public void testMerge(){
        int[] a1 = {2};
        int[] a2 = {3};
        int[] expected = {2, 3};
        MergeSort test = new MergeSort();
        int[] values = test.merge(a1, a2);
        assertArrayEquals(expected, values);
    }

    //Tests merge function with a large array of int's.
    @Test
    public void testLargeMerge(){
        int[] a = {2, 3,6};
        int[] b = {1, 4, 5};
        int[] expected = {1, 2, 3, 4, 5, 6};
        MergeSort test = new MergeSort();
        int[] values = test.merge(a, b);
        assertArrayEquals(expected, values);
    }

    //Tests Mergesort function with an array of int's.
    @Test
    public void testMergeSort(){
        int[] values = {4, 6, 2, 3, 1, 5};
        int[] expected = {1, 2, 3, 4, 5, 6};
        MergeSort test = new MergeSort();
        values = test.mergeSort(values);
        assertArrayEquals(expected, values);
    }

}