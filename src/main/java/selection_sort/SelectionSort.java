package selection_sort;

public class SelectionSort {
    public int[] sort(int[] a) {
        for (int i=0; i < a.length-1; i++) {
            int smallest = a[i];
            int pos_of_smallest = i;
            for (int j=i; j<a.length; j++) {
                if(a[j] < smallest) {
                    smallest = a[j];
                    pos_of_smallest = j;
                }
            };
            a[pos_of_smallest] = a[i];
            a[i] = smallest;
        };
        return a;
    }
}
