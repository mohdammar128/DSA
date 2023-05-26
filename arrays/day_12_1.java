//bubble sort
//O(n^2)
//selection sort
//O(n^2)
// insertion sort
// time complexity =O(n^2)
//count sort
//O(n+largest);

import java.util.*;

public class day_12_1 {
    // public static void bubbleSort(int arr[]) {
    // int flag;
    // for (int turn = 0; turn < arr.length - 1; turn++) {
    // flag = 0;// this flag will take care of whether array is alredy sorted or not
    // for (int j = 0; j < arr.length - 1 - turn; j++) {
    // if (arr[j] > arr[j + 1]) {
    // int temp = arr[j];
    // arr[j] = arr[j + 1];
    // arr[j + 1] = temp;
    // flag++;
    // }

    // }
    // if (flag != 0) {
    // break;
    // }
    // }
    // }

    // public static void SelectionSort(int arr[]) {
    //     for (int i = 0; i < arr.length - 1; i++) {
    //         int minPos = i;
    //         for (int j = i + 1; j < arr.length; j++) {
    //             if (arr[minPos] > arr[j]) {
    //                 minPos = j;
    //             }
    //         }
    //         // swap here
    //         int temp = arr[minPos];
    //         arr[minPos] = arr[i];
    //         arr[i] = temp;
    //     }
    // }
   
    // public static void InsertionSort(int arr[]){
    //     for(int i=1;i<arr.length;i++){
    //         int current=arr[i];
    //         int prev=i-1;
    //         //finding out correct position to insert
    //         while(prev>=0 && current<arr[prev]){
    //             arr[prev+1]=arr[prev];
    //             prev--;
    //         }
    //         arr[prev+1]=current;
    //     }
    // }

    public static void countingSort(int arr[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest=Math.max(largest,arr[i]);
        }//find the largest element in array
        int count_arr[]=new int[largest+1];
        for(int i=0;i<arr.length;i++){
            count_arr[arr[i]]++;
        }
        int j=0;
        for(int i=0;i<count_arr.length;i++){
            
            while(count_arr[i]>0){
              arr[j]=i;
              j++;
              count_arr[i]--;

            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int si = sc.nextInt();
        int nums[] = new int[si];
        for (int i = 0; i < si; i++) {
            nums[i] = sc.nextInt();
        }
        // bubbleSort(nums);
        // SelectionSort(nums);
        // InsertionSort(nums);
         countingSort(nums);
        for (int val : nums) {
            System.out.println(val);
        }
        sc.close();
    }
}
