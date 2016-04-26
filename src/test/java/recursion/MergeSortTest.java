package recursion;

import org.junit.Before;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

public class MergeSortTest {
    private MergeSort mrgsrt;
    @Before
    public void setUp() throws Exception {
        mrgsrt = new MergeSort();
    }

    @Test
    public void insertionSortArrayLengthOne() throws Exception {
        int[] arr = new int[] {1};
        mrgsrt.sort(arr);
        assertArrayEquals(arr, new int[] {1});
    }
    @Test
    public void insertionSortArrayMonotonousIncrease() throws Exception {
        int[] arr = new int[] {1,2,3,4,5};
        mrgsrt.sort(arr);
        assertArrayEquals(arr, new int[] {1,2,3,4,5});
    }
    @Test
    public void insertionSortArrayMonotonousDecrease() throws Exception {
        int[] arr = new int[] {5,4,3,2,1};
        mrgsrt.sort(arr);
        assertArrayEquals(new int[]{1,2,3,4,5}, arr);
    }

    @Test
    public void insertionSortShuffledArray() throws Exception {
        int[] arr = new int[] {3,4,1,2,5};
        mrgsrt.sort(arr);
        assertArrayEquals(new int[]{1,2,3,4,5}, arr);
    }

    @Test
    public void insertionSortRandomArray() {
        int[] arr = new int[10];
        Random rnd = new Random();
        for(int i = 0; i < 10; i++){
            arr[i] = rnd.nextInt(100);
        }

        mrgsrt.sort(arr);

        boolean monotonous_increase = true;
        for(int i=0; i < arr.length - 2; i++) {
            monotonous_increase = monotonous_increase && !(arr[i] > arr[i+1]);
        }
        assertTrue(monotonous_increase);
    }

}