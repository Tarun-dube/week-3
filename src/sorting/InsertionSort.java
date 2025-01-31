package sorting;

public class InsertionSort {
    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;

            }
            array[j + 1] = key;

        }
    }
    public static void main(String[] args) {
        int[] empId={2,1,3,4,7,6,5};
        //sort
        insertionSort(empId);

        //display array
        for (int id : empId) {
            System.out.print(id+" ");
        }


    }
}
