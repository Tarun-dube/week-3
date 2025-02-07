package BinarySearch;

public class SmallestElement {
    public static int search(int[] a) {
        int start = 0;
        int end = a.length - 1;
        while (start <end) {
            int mid=start + (end - start) / 2;

            if (a[mid] > end) {
                start = mid + 1;


            }
            else{
                end = mid;

            }


        }
        return a[start];
    }
    public static void main(String[] args) {
   int[] a={4,5,6,1,2,3};
   System.out.println(search(a));


    }
}
