//mergesort 
/*timeComplexity=O(nlogn) */

public class recur9 {
    public static void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];
        int i = si;// iterator for left part
        int j = mid + 1;// iterator for right part
        int k = 0;// iterator for temp array
        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= ei) {
            temp[k++] = arr[j++];
        }
        //copy temp to original array
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }

    }

    public static void mergeSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        mergeSort(arr, si, mid);// left part
        mergeSort(arr, mid + 1, ei);// right part
        merge(arr, si, mid, ei);// merging take place
    }

    public static void main(String[] args) {
    int arr[]={6,3,9,5,2,8};
    mergeSort(arr, 0, arr.length-1);
    for( int val:arr){
        System.out.println(val);
    }
    }
}
