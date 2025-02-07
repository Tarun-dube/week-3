package BinarySearch;

public class PeakElement {
    public static int findPeakElement(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid=left + (right - left) / 2;
            if (arr[mid] > arr[mid + 1] && arr[mid] > arr[mid - 1]) {
                return arr[mid];

            }
            if (arr[mid] < arr[mid - 1]) {
                right = mid - 1;

            }
            else if (arr[mid] < arr[mid + 1]) {
                left = mid + 1;

            }

        }
        return -1;
    }
    public static void main(String[] args) {
      int[] a={1,3,5,3,5,7,8};
      System.out.println(findPeakElement(a));

    }
}
