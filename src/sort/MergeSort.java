package sort;
import java.util.Arrays;

/**
 * Implementation of the merge sort algorithm, call mergeSort with an int array to sort them.
 */
public class MergeSort {

    /**
     * Sorts an int array by spliting the numbers up and then reordering them, otherwise called divide and conquer.
     * @param values int array to be sorted.
     * @return an int array containing the numbers in values, which are sorted from smallest to largest.
     */
    public int[] mergeSort(int[] values){
        if(values.length <= 1){
            return values;
        }
        int mid = values.length / 2;
        int[] left = Arrays.copyOfRange(values, 0, mid);
        int[] right = Arrays.copyOfRange(values, mid, values.length);
        left = mergeSort(left);
        right = mergeSort(right);
        int[] result = merge(left, right);
        return result;
    }

    /**
     * Merges two int arrays together in a sorted order and returns an array containing all values of the two arrays.
     * @param left The sub-array to the left of the middle point to be merged with right.
     * @param right The sub-array to the right of the middle point to be merged with left.
     * @return A sorted int array that contains all values in left and right.
     */
    public int[] merge(int[] left, int[] right){
        int maxSize = (left.length + right.length);
        int lIndex = 0;
        int rIndex = 0;
        int index = 0;
        int[] sortedValues = new int[maxSize];

        while(left.length > lIndex && right.length > rIndex){
            if(left[lIndex] < right[rIndex]){
                sortedValues[index] = left[lIndex];
                lIndex++;
            }else{
                sortedValues[index] = right[rIndex];
                rIndex++;
            }
            index++;
        }

        while(left.length > lIndex){
            sortedValues[index] = left[lIndex];
            index++;
            lIndex++;
        }

        while(right.length > rIndex){
            sortedValues[index] = right[rIndex];
            index++;
            rIndex++;
        }

        return sortedValues;
    }

}
