package sort;

/**
 *
 */
public class SelectionSort {

    public void swap(int[] values, int movedNumberIndex, int newPosition){
        int temp = values[newPosition];
        values[newPosition] = values[movedNumberIndex];
        values[movedNumberIndex] = temp;
    }

}
