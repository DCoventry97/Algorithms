package sort;

/**
 *A class which implements a selection sort on an array of integers.
 */
public class SelectionSort {

    /**
     * Swaps 2 integers in an array, using the index positions of the numbers to be swapped.
     * @param values The int array that containes the numbers to be swapped.
     * @param movedNumberIndex The array index of the number that is being swapped.
     * @param newPosition The array index that the number is being swapped into.
     */
    public void swap(int[] values, int movedNumberIndex, int newPosition){
        int temp = values[newPosition];
        values[newPosition] = values[movedNumberIndex];
        values[movedNumberIndex] = temp;
    }

    /**
     * Implementation of selection sort.
     * @param values the int array that is to be sorted.
     */
    public void sort(int[] values){
        for (int i = 0; i < values.length; i++){

            int min = i;
            for (int j = i; j < values.length; j++){
                if(values[j] < values[min]){
                    min = j;
                }
            }
            this.swap(values, min, i);

        }
    }

}
