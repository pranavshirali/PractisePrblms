import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ass11 {

    //Problem No.3
    public static List<Integer> findUnion(int[] arr1, int[] arr2){
        Set<Integer> distinctElement = new HashSet<>();
        int[] combinedArray = new int[arr1.length + arr2.length];

        System.arraycopy(arr1, 0, combinedArray, 0, arr1.length);
        System.arraycopy(arr2, 0, combinedArray, arr1.length, arr2.length);

        for(int num : combinedArray){
            distinctElement.add(num);
        }
        
        List<Integer> distinctUnion = new ArrayList<>(distinctElement);
        return distinctUnion;
    }
    
}
