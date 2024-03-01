import java.util.Arrays;

public class ass6 {
    public static void main(String[] args) {
        // Problem No. 1
        int[] nums1 = {1, 2, 1};
        System.out.println(Arrays.toString(concatArray(nums1)));

        // Problem No. 2
        int[] nums2 = {3, 4, -1};
        System.out.println(minOperations(nums2));

        // Problem No. 3
        int[] original = {1, 2, 3, 4};
        int m = 2, n = 2;
        System.out.println(Arrays.deepToString(construct2DArray(original, m, n)));

        // Problem No. 4
        int[] nums4 = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(splitArraySameAverage(nums4));

        // Problem No. 5
        int row1 = 2, col1 = 3, row2 = 3, col2 = 2;
        System.out.println(Arrays.deepToString(multiplyMatrices(row1, col1, row2, col2)));
    }

    // Problem No. 1
    public static int[] concatArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];
        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }
        return ans;
    }

    // Problem No. 2
    public static int minOperations(int[] nums) {
        int minIndex = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[minIndex]) {
                minIndex = i;
            }
        }
        int operations = minIndex + 1;
        operations += nums.length - minIndex - 1;
        return operations;
    }

    // Problem No. 3
    public static int[][] construct2DArray(int[] original, int m, int n) {
        int len = original.length;
        if (m * n != len) {
            return new int[0][0];
        }
        int[][] result = new int[m][n];
        for (int i = 0; i < len; i++) {
            if (i / n >= m) {
                return new int[0][0];
            }
            result[i / n][i % n] = original[i];
        }
        return result;
    }

    // Problem No. 4
    public static boolean splitArraySameAverage(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        int n = nums.length;
        Arrays.sort(nums);
        for (int lenA = 1; lenA <= n / 2; lenA++) {
            if (sum * lenA % n == 0 && canPartition(nums, 0, lenA, sum * lenA / n)) {
                return true;
            }
        }
        return false;
    }

    private static boolean canPartition(int[] nums, int start, int k, int target) {
        if (k == 0) return target == 0;
        if ((nums[start] > target) || (nums[nums.length - 1] < target)) return false;
        for (int i = start; i < nums.length - k + 1; i++) {
            if (i > start && nums[i] == nums[i - 1]) continue;
            if (canPartition(nums, i + 1, k - 1, target - nums[i])) {
                return true;
            }
        }
        return false;
    }

    // Problem No. 5
    public static int[][] multiplyMatrices(int row1, int col1, int row2, int col2) {
        if (col1 != row2) {
            return null;
        }
        int[][] matrix1 = new int[row1][col1];
        int[][] matrix2 = new int[row2][col2];
        int[][] result = new int[row1][col2];
        // Fill matrix1 and matrix2 with values
        // Perform matrix multiplication
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                for (int k = 0; k < col1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return result;
    }
}
