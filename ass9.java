import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ass9 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int[] A = {16, 17, 4, 3, 5, 2};
        List<Integer> leaders = findLeaders(A);
        System.out.print("Leaders are: ");
        for (int leader : leaders) {
            System.out.print(leader + " ");
        }

        String s = "zxvczbtxyzvy";
        System.out.println("\nNon repeating: "+firstNonRepeatingChar(s));

        int[] nums = {10, 19, 6, 3, 5};
        System.out.println("Minimum swaps: " + minSwaps(nums));
        scan.close();
    }

    //Problem No.1
    public static List<Integer> findLeaders(int[] A) {
        List<Integer> leaders = new ArrayList<>();
        if (A.length == 0) {
            return leaders;
        }

        int maxRight = A[A.length - 1];
        leaders.add(maxRight);

        for (int i = A.length - 2; i >= 0; i--) {
            if (A[i] >= maxRight) {
                leaders.add(A[i]);
                maxRight = A[i];
            }
        }

        return leaders;
    }
    
    //Problem 3
    public static char firstNonRepeatingChar(String s) {
        Map<Character, Integer> frequencyMap = new HashMap<>();
        
        // Count frequency of each character
        for (char c : s.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }
        
        // Find the first non-repeating character
        for (char c : s.toCharArray()) {
            if (frequencyMap.get(c) == 1) {
                return c;
            }
        }
        
        // If no non-repeating character found, return '$'
        return '$';
    }


    //Problem 4
    public static int minSwaps(int[] nums) {
        int n = nums.length;
        int[] sortedNums = Arrays.copyOf(nums, n);
        Arrays.sort(sortedNums);

        boolean[] visited = new boolean[n];
        int swaps = 0;

        for (int i = 0; i < n; i++) {
            if (visited[i] || nums[i] == sortedNums[i]) {
                continue;
            }

            int cycleSize = 0;
            int j = i;

            while (!visited[j]) {
                visited[j] = true;
                j = Arrays.binarySearch(sortedNums, nums[j]);
                cycleSize++;
            }

            if (cycleSize > 0) {
                swaps += cycleSize - 1;
            }
        }

        return swaps;
    }
}
