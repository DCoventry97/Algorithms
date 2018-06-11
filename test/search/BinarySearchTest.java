package search;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTest {

    @Test
    public void comparisonWithSameValue(){
        BinarySearch searcher = new BinarySearch();
        int target = 5;
        int[] values = {5};

        assertTrue(searcher.search(target, values));
    }
    

}