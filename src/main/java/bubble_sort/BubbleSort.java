package bubble_sort;

public class BubbleSort {

    public int[] bubbleSort(int[] a) {
        for(int i=0; i < a.length-1; i++) {
            for(int j=0; j < a.length - 1 - i; j++){
                if (a[j] > a[j+1]){
                    int tmp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = tmp;
                }
            }
        }
        return a;
    }
}
