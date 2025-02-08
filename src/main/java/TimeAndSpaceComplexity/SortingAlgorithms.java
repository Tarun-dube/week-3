package TimeAndSpaceComplexity;

import java.util.Random;

public class SortingAlgorithms {
    //bubble sort
    public static void bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            boolean swapped = false;
            int temp;
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;

                }


            }
            if (!swapped) {
                break;
            }
        }
    }
    //merge sort
    public static void merge(int[] arr1, int l, int m, int r) {
         int[]arr = new int[r-l+1];
         int i = l, j = m+1;
         int k = 0;
         while (i <= m && j <= r) {
             if(arr1[i]<arr1[j]) {
                 arr[k++] = arr1[i++];

             }
             else {
                 arr[k++] = arr1[j++];
             }
         }
         while (i <= m) {
             arr[k++] = arr1[i++];
         }
         while (j <= r) {
             arr[k++] = arr1[j++];
         }

         for(int ix = 0 ;ix<arr.length;ix++) {
             arr1[l+ix] = arr[ix];
         }
    }
    public static void mergeSort(int[] arr, int l, int r) {
        if(l < r) {
            int mid=l+(r-l)/2;
            //divide
            mergeSort(arr, l, mid);
            mergeSort(arr, mid+1, r);

            //merge
            merge(arr, l, mid, r);

        }
    }
    //quick sort
    public static int partition(int[] arr, int l, int r) {
        int pivot = arr[r];
        int i = l-1;
        for (int j = l; j < r; j++) {
            if(arr[j] < pivot) {
                i++;
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

        }
         //index of element larger than pivot now swap it with pivot
        {  int temp = arr[i+1];
        arr[i+1] = arr[r];
        arr[r] = temp;}

        return i+1;

    }
    public static void quickSort(int[] arr, int l, int r) {
        if(l < r) {
           int pivot = partition(arr, l, r);
           quickSort(arr, l, pivot-1);
           quickSort(arr, pivot+1, r);

        }
    }

    public static void main(String[] args) {
        System.out.println("For size 1000:");
        int [] a=new int[1000];
        Random r = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i]=r.nextInt(1000);

        }
        //bubble sort
       long startTime = System.nanoTime();
        bubbleSort(a);
       long endTime = System.nanoTime();
        System.out.println("Time for bubble sort: " + (endTime - startTime));
       //merge sort
        startTime = System.nanoTime();
        mergeSort(a, 0, a.length-1);
         endTime = System.nanoTime();
        System.out.println("Time for merge sort: " + (endTime - startTime));
        //  quick sort
        startTime = System.nanoTime();
        quickSort(a, 0, a.length-1);
        endTime = System.nanoTime();
        System.out.println("Time for quick sort: " + (endTime - startTime));







    }
}
