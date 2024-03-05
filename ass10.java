import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ass10 {
    // Problem No.1
    public static void rotateArray(int[] arr, int k) {
        int n = arr.length;
        k = k % n;

        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
    }

    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Problem No.2
    public static List<Integer> commonele(int[] arr1, int[] arr2, int[] arr3) {
        int i = 0, j = 0, k = 0;

        List<Integer> commonElement = new ArrayList<>();

        while (i < arr1.length && j < arr2.length && k < arr3.length) {
            if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
                commonElement.add(arr1[i]);
                i++;
                j++;
                k++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr2[j] < arr3[k]) {
                j++;
            } else {
                k++;
            }
        }
        return commonElement;
    }

    //Problem No.3
    public static boolean findtripletSum(int[] arr, int sum){
        Arrays.sort(arr);
        int n = arr.length;
        for(int i = 0; i < n-2; i++){
            int left = i + 1;
            int right = n - 1;

            while(left < right){
                int currSum = arr[i] + arr[left] + arr[right];
                if(currSum == sum){
                    System.out.println("\nTriplet found: "+arr[i]+","+arr[left]+","+arr[right]);
                    return true;
                }
                else if(currSum < sum){
                    left++;
                }
                else{
                    right++;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // Problem No.1
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n = scan.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the array elements:");
        for(int i = 0; i<n; i++){
        arr[i] = scan.nextInt();
        }

        System.out.println("Enter the number of rotations: ");
        int k = scan.nextInt();

        rotateArray(arr, k);
        System.out.println("Rotated array is: ");
        for(int num: arr){
        System.out.print(num + " ");
        }

        //Problem No.2
        int ar1[] = {1, 5, 5};
        int ar2[] = {3, 4, 5, 5, 10}; 
        int ar3[] = {5, 5, 10, 20}; 
        List<Integer> elements = commonele(ar1, ar2, ar3);
    
        System.out.print("\nCommon elements: " + elements);

        int[] array = {1, 2, 3, 4, 5}; int sum = 9; 
        if(!findtripletSum(array, sum)){
            System.out.println("Triplets not found.");
        }
        scan.close();
    }
}
