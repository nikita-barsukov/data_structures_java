package selection_sort;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Random;
import static org.junit.Assert.*;

public class SelectionSortTest {
    private  SelectionSort ssrt;
    @Test
    public void selectionSortArrayLengthOne() throws Exception {
        int[] arr = new int[] {1};
        int[] arr_sorted = ssrt.sort(arr);
        assertArrayEquals(arr, arr_sorted);
    }
    @Test
    public void selectionSortArrayMonotonousIncrease() throws Exception {
        int[] arr = new int[] {1,2,3,4,5};
        int[] arr_sorted = ssrt.sort(arr);
        assertArrayEquals(arr, arr_sorted);
    }
    @Test
    public void selectionSortArrayMonotonousDecrease() throws Exception {
        int[] arr = new int[] {5,4,3,2,1};
        int[] arr_sorted = ssrt.sort(arr);
        assertArrayEquals(new int[]{1,2,3,4,5}, arr_sorted);
    }

    @Test
    public void selectionSortShuffledArray() throws Exception {
        int[] arr = new int[] {3,4,1,2,5};
        int[] arr_sorted = ssrt.sort(arr);
        assertArrayEquals(new int[]{1,2,3,4,5}, arr_sorted);
    }

    @Test
    public void bubbleSortRandomArray() {
        int[] arr = new int[10];
        Random rnd = new Random();
        for(int i = 0; i < 10; i++){
            arr[i] = rnd.nextInt(100);
        }

        int[] arr_sorted =  ssrt.sort(arr);

        boolean monotonous_increase = true;
        for(int i=0; i < arr_sorted.length - 2; i++) {
            monotonous_increase = monotonous_increase && !(arr_sorted[i] > arr_sorted[i+1]);
        }
        assertTrue(monotonous_increase);
    }
    @Before
    public void setUp() throws Exception {
        ssrt = new SelectionSort();
    }
}