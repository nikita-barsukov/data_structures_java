package insertion_sort;

public class InsertionSort {
    public int[] sort(int[] a){
        for(int i=0; i<a.length; i++){
            int tmp = a[i];
            int j = i-1;

            while(j >=0 && tmp < a[j]) {
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = tmp;
        }
        return a;
    }
}
