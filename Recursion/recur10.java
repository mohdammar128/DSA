public class recur10 {
    public static int Partition(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si-1;// jagah banan raha hai pivot sey small element key liye
        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;

            }
        }
        i++;
        int temp = arr[ei];
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;

    }
    public static void QuickSort(int arr[],int si,int ei){
     if(si>=ei){
        return ;
     }
     int pIdx=Partition(arr, si, ei);
     QuickSort(arr, si, pIdx-1);//left part 
     QuickSort(arr, pIdx+1, ei);
    }

    public static void main(String[] args) {
    int arr[]={1,85,32,4,51,6};
    QuickSort(arr, 0, arr.length-1);

    for(int val:arr){
        System.out.println(val);
    }
    }
}
