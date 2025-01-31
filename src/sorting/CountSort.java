package sorting;

public class CountSort {
    public static void countSort(int[] arr) {
        int n = arr.length;
        int max = arr[0];
        for (int i = 0; i < n; i++) {
           if(arr[i] > max) {
               max = arr[i];
           }
        }
        int[]a = new int[max+1];
        for (int i = 0; i < n; i++) {
            a[arr[i]]++;

        }
        for (int i = 1; i <=max; i++) {
            a[i] += a[i-1];
        }
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[--a[arr[i]]]=arr[i];
        }
        for (int i = 0; i < n; i++) {
            arr[i]=b[i];
        }
    }
    public static void main(String[] args) {
        int [] age={10,16,10,12,12,18,18,18};
        countSort(age);

        for (int i : age) {
            System.out.print(i+" ");
        }
    }
}
