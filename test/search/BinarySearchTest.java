package search;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTest {

    //tests comparing the target with a single value in values that is the same.
    @Test
    public void comparisonWithSameValue(){
        BinarySearch searcher = new BinarySearch();
        int target = 5;
        int[] values = {5};

        assertTrue(searcher.search(target, values, 0, 0));
    }

    //tests comparing the target with a single value in values that is different.
    @Test
    public void comparisonWithDifferentValue(){
        BinarySearch searcher = new BinarySearch();
        int target = 5;
        int[] values = {3};

        assertFalse(searcher.search(target, values, 0, 0));
    }

    //tests that the search algorithm moves to the smaller side if the middle value is greater than the target.
    @Test
    public void movesToSmallerSideOfIndex(){
        BinarySearch searcher = new BinarySearch();
        int target = 2;
        int[] values = {2, 5, 7};

        assertTrue(searcher.search(target, values, 0, 2));
    }

    //tests that the search algorithm moves the the larger side if the middle value is less than the target.
    @Test
    public void movesToGreaterSideOfIndex(){
        BinarySearch searcher = new BinarySearch();
        int target = 3;
        int [] values = {1, 2, 3};
        assertTrue(searcher.search(target, values, 0, 2));
    }


}