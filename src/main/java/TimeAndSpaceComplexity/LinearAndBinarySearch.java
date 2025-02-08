package TimeAndSpaceComplexity;

import java.util.Arrays;
import java.util.Random;

public class LinearAndBinarySearch {
    public static long linearSearchTime(int[] arr, int key) {

        boolean found = false;
        long startTime=System.nanoTime();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                found = true;
                break;
            }
        }
        long endTime=System.nanoTime();

        if (found) return endTime-startTime;
        return -1;
    }
    public static long binarySearchTime(int[] arr, int key) {
        boolean found = false;
        Arrays.sort(arr);
        long startTime=System.nanoTime();
       int left = 0;
       int right = arr.length - 1;
       while (left <= right) {
           int mid =left + (right - left) / 2;
           if (arr[mid] == key) {
               found = true;
               break;
           }
           if (arr[mid] < key) {
               left = mid + 1;

           }
           else {
               right = mid - 1;

           }

       }
       long endTime=System.nanoTime();

      if(found) return endTime-startTime;
      return -1;
    }
    public static void main(String[] args) {
        // time for 1000 size
        System.out.println("For size 1000:");
        int [] a=new int[1000];
        Random r = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i]=r.nextInt(1000);

        }

        System.out.println("linear search time: "+linearSearchTime(a,250)+"ns");
        System.out.println("binary search time: "+binarySearchTime(a,250)+"ns");

        // time for 10000 size
        System.out.println("For size 10000:");
        int [] b=new int[10000];
        for (int i = 0; i < b.length; i++) {
            b[i]=r.nextInt(10000);
        }

         System.out.println("binary search time: "+binarySearchTime(b,300)+"ns");
        System.out.println("linear search time: "+linearSearchTime(b,300)+"ns");

        // time for 100000 size
        System.out.println("For size 100000:");
        int[] c=new int[100000];
        for (int i = 0; i < c.length; i++) {
            c[i]=r.nextInt(100000);

        }

        System.out.println("binary search time: "+binarySearchTime(c,3000)+"ns");
        System.out.println("linear search time: "+linearSearchTime(c,3000)+"ns");


    }
}
