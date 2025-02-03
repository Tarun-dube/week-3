package HashMapandHashFunction;

import java.util.*;

public class ZeroSumSubarrays {
    public static void findZeroSumSubarrays(int[] arr) {
        // Map to store (cumulative sum, list of indices where it occurs)
        Map<Integer, List<Integer>> map = new HashMap<>();
        List<int[]> result = new ArrayList<>();
        int sum = 0;

        // Initialize map to handle sum = 0 case
        map.put(0, new ArrayList<>());
        map.get(0).add(-1); // To handle subarrays starting from index 0

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i]; // Compute cumulative sum

            // If sum exists in map, all subarrays from stored indices to 'i' have sum 0
            if (map.containsKey(sum)) {
                for (int startIdx : map.get(sum)) {
                    result.add(new int[]{startIdx + 1, i}); // Store subarray (start, end)
                }
            }

            // Add current index to map
            map.putIfAbsent(sum, new ArrayList<>());
            map.get(sum).add(i);
        }

        // Print the results
        if (result.isEmpty()) {
            System.out.println("No zero-sum subarrays found.");
        } else {
            System.out.println("Zero-sum subarrays:");
            for (int[] subarray : result) {
                System.out.println("Start: " + subarray[0] + ", End: " + subarray[1]);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {6, 3, -1, -3, 4, -2, 2, 4, 6, -12, -7};
        findZeroSumSubarrays(arr);
    }
}

