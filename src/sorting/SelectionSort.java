package sorting;

public class SelectionSort {
    public static void selectionSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;

                }

            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;

        }

    }
    public static void main(String[] args) {
        int[] scores = {5, 4,9,11, 3, 2, 1};
        selectionSort(scores);

        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i] + " ");
        }
    }
}
