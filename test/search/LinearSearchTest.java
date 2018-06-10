package search;

import org.junit.Test;

import static org.junit.Assert.*;

public class LinearSearchTest {

    //tests that it compares values correctly when it is comparing with the same value.
    @Test
    public void comparisonWithSameValue(){
        LinearSearch searcher = new LinearSearch();
        int target = 5;
        int [] values = new int[1];
        values[0] = 5;

        assertTrue(searcher.search(target, values));
    }

    //tests that it compares values correctly when comparing with a different value.
    @Test
    public void comparisonWithDifferentValue(){
        LinearSearch searcher = new LinearSearch();
        int target = 5;
        int[] values = new int[1];
        values[0] = 2;

        assertFalse(searcher.search(target, values));
    }

    //tests that it moves to the next value in array if current value != target.
    @Test
    public void movesToNextValue(){
        LinearSearch searcher = new LinearSearch();
        int target = 2;
        int[] values = {1, 2};
        assertTrue(searcher.search(target, values));
    }

    //tests that it returns false when target is not in values array.
    @Test
    public void targetNotInValues(){
        LinearSearch searcher = new LinearSearch();
        int target = 5;
        int[] values = {1, 3, 4, 2};
        assertFalse(searcher.search(target, values));
    }

}