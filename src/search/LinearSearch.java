package search;

/**
 * class containing a method which performs a linear search on an array of integers.
 */
public class LinearSearch {

    /**
     * Searches an array of integers linearly to try and find the target integer.
     * @param target The integer being searched for.
     * @param values An Array of integers that will be searched for the target, this  does not have to be ordered.
     * @return Boolean for if values contains the target.
     */
    public boolean search(int target, int[] values){
        for(int i : values) {
            if (i == target) {
                return true;
            }
        }
        return false;
    }

}
