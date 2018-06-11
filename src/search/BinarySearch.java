package search;

/**
 * Binary Search class, finds if an integer array containes a target integer.
 */
public class BinarySearch {

    /**
     * Performs a binary search upon a sorted integer array, returns a boolean for if the target value if in the array.
     * @param target The target value to be searched for.
     * @param values A sorted array of integers to be searched through.
     * @return boolean value for if  target is found in values array.
     */
    public boolean search(int target, int[] values, int left, int right){
        if(left > right){
            return false;
        }

        int mid = (left + right) /2;
        if(values[mid] == target){
            return true;
        } else {
            if (values[mid] < target){
                return(this.search(target, values, mid + 1, right));
            } else {
                return (this.search(target, values, left, mid - 1));
            }
        }

    }
}
