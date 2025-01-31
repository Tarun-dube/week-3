package sorting;

public class QuickSort {
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;

    }
    public static void quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int pidx = partition(arr,left,right);
            quickSort(arr,left,pidx-1);
            quickSort(arr,pidx+1,right);


        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        quickSort(arr,0,arr.length-1);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
