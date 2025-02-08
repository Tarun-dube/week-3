package TimeAndSpaceComplexity;


import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Searching {
    public static boolean arrayContains(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        System.out.println("Enter the size of the array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr =new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=i;
        }
        long start = System.nanoTime();
        boolean result = arrayContains(arr, n-1);
        long end = System.nanoTime();
        System.out.println("Array search time: " + (end - start));

        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        start = System.nanoTime();
       boolean r = set.contains(n-1);
        end = System.nanoTime();
        System.out.println("Set search time: " + (end - start));


        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int i = 0; i < arr.length; i++) {
            treeSet.add(arr[i]);
        }
        start = System.nanoTime();
        boolean re = treeSet.contains(n-1);
        end = System.nanoTime();
        System.out.println("TreeSet search time: " + (end - start));



    }
}
