package recursion;

public class MergeSort {
    public void sort(int[] a) {
        mergeSort(a, 0, a.length -1);
    }

    private void mergeSort(int[] a, int start, int end) {
        if(start < end) {
            int mid = (int)Math.floor((end + start) / 2);
            mergeSort(a, start, mid);
            mergeSort(a, mid+1, end);
            merge(a, start, mid, end);
        }
    }

    private void merge(int[] a, int start, int mid, int end){
        int sizeOfLeft = mid - start + 1;
        int sizeOfRight = end - mid;

        int[] left = new int[sizeOfLeft];
        int[] right = new int[sizeOfRight];

        for(int i=0;i<sizeOfLeft; i++) {
            left[i] = a[start + i];
        }

        for(int j =0;j<sizeOfRight; j++){
            right[j] = a[mid + j + 1];
        }

        // merging right and left
        int left_arr_counter=0, right_arr_counter=0;
        for(int k = start; k<=end; k++){
            if((right_arr_counter >=sizeOfRight) ||
                    (left_arr_counter < sizeOfLeft &&
                            left[left_arr_counter] <= right[right_arr_counter])){
                a[k] = left[left_arr_counter];
                left_arr_counter++;
            } else {
                a[k] = right[right_arr_counter];
                right_arr_counter++;
            }
        }
    }
}
