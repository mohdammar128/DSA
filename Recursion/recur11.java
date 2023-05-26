///very very important

public class recur11 {
    public static int SearchRotatedArray(int arr[], int si, int ei, int tar) {
        if (si > ei) {
            return -1;
        }
        int mid = (si + ei) / 2;
        if (tar == arr[mid]) {
            return mid;
        }
        // case 1 kii yeah kis line per lie ker rahey hain
        if (arr[si] <= arr[mid]) {
            // left
            if (arr[si] <= tar && tar <= arr[mid]) {
                return SearchRotatedArray(arr, si, mid - 1, tar);

            }
            // right
            else {
                return SearchRotatedArray(arr, mid + 1, ei, tar);

            }
        }
        // case2
        else {
            // right
            if (arr[mid] <= tar && tar <= arr[ei]) {
                return SearchRotatedArray(arr, mid + 1, ei, tar);
            }
            // left
            else {
                return SearchRotatedArray(arr, si, mid - 1, tar);
            }

        }

    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        int res = SearchRotatedArray(arr, 0, arr.length - 1, 0);
        System.out.println(res);
    }
}
