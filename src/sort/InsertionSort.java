package sort;

/**
 * Insertion sort implementation that takes an array and will order it.
 */
public class InsertionSort {

    /**
     * Swaps the positions of 2 ints in the array.
     * @param values Array of Integers to be sorted.
     * @param index The index value of an int in vales to be swapped with a value in same array at position index - 1.
     * @return An int array which is the same as values but the required integers to be swapped have swapped.
     */
    public int[] swap(int[] values, int index){
        int buffer = values[index];
        values[index] = values[index - 1];
        values[index - 1] = buffer;
        return values;

    }

    /**
     * implements selection sort which can be used to sort an int array. 
     * @param values The int array to be sorted.
     * @return An array of sorted integers.
     */
    public int[] sort(int[] values){
        int i = 1;
        while (i < values.length){
            int j = i;
            while (j > 0 && values[j-1] > values[j]){
                values = this.swap(values, j);
                j = j -1;
            }
            i = i + 1;
        }

        return values;
    }
}
