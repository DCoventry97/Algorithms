package sort;

public class InsertionSort {

    public int[] swap(int[] values, int index){
        int buffer = values[index];
        values[index] = values[index + 1];
        values[index + 1] = buffer;
        return values;

    }
}
