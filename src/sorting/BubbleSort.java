package sorting;
import java.util.*;

public class BubbleSort {
    public static void main(String[] args) {
        int[] marks = {1, 2, 7, 8, 3, 9, 4};

        //swap the elementes
        int n = marks.length;
        Boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                    if (marks[j] > marks[j + 1]) {
                        int temp = marks[j];
                        marks[j] = marks[j + 1];
                        marks[j + 1] = temp;
                        swapped = true;

                    }
            }
            if (!swapped) {
                break;
            }

        }
        for(int i = 0; i < marks.length; i++){
            System.out.print(marks[i] + " ");
        }
    }
}
