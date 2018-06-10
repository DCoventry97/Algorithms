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

    @Test
    public void comparisonWithDifferentValue(){

    }

}