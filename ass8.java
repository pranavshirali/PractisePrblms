import java.util.Arrays;

public class ass8 {
    public static void main(String[] args) {
        // Problem No. 1
        int[] nums1 = {2, 2};
        System.out.println(Arrays.toString(findTwoElement(nums1, nums1.length)));

        // Problem No. 2
        int[] arr2 = {1, 3, 3};
        System.out.println(Arrays.toString(find(arr2, arr2.length, 3)));

        // Problem No. 3
        int[] arr3 = {1, 2, 3, 4, 5, 6};
        rearrange(arr3, arr3.length);
        System.out.println(Arrays.toString(arr3));

        // Problem No. 4
        int[] arr1 = {2, 3, 6, 7, 9};
        int[] arr4 = {1, 4, 8, 10};
        System.out.println(kthElement(arr1, arr1.length, arr4, arr4.length, 5));
    }

    // Problem No. 1
    public static int[] findTwoElement(int[] arr, int n) {
        int[] res = new int[2];
        for (int i = 0; i < n; i++) {
            if (arr[Math.abs(arr[i]) - 1] < 0) {
                res[0] = Math.abs(arr[i]);
            } else {
                arr[Math.abs(arr[i]) - 1] *= -1;
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                res[1] = i + 1;
                break;
            }
        }
        return res;
    }

    // Problem No. 2
    public static int[] find(int arr[], int n, int x) {
        int first = -1, last = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                if (first == -1)
                    first = i;
                last = i;
            }
        }
        return new int[]{first, last};
    }

    // Problem No. 3
    public static void rearrange(int arr[], int n) {
        int max_idx = n - 1, min_idx = 0;
        int max_elem = arr[n - 1] + 1;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                arr[i] += (arr[max_idx] % max_elem) * max_elem;
                max_idx--;
            } else {
                arr[i] += (arr[min_idx] % max_elem) * max_elem;
                min_idx++;
            }
        }
        for (int i = 0; i < n; i++)
            arr[i] = arr[i] / max_elem;
    }

    // Problem No. 4
    public static int kthElement(int[] arr1, int n, int[] arr2, int m, int k) {
        int i = 0, j = 0;
        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                k--;
                if (k == 0)
                    return arr1[i];
                i++;
            } else {
                k--;
                if (k == 0)
                    return arr2[j];
                j++;
            }
        }
        while (i < n) {
            k--;
            if (k == 0)
                return arr1[i];
            i++;
        }
        while (j < m) {
            k--;
            if (k == 0)
                return arr2[j];
            j++;
        }
        return -1;
    }
}
