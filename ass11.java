import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

    //Problem No.2
    public static int validIP(String ipAddress){
        String zeroTo255
            = "(25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)";
                //25[0-5] --> 250-255
                //2[0-4]\\d --> 200-249
                //1\\d{2} --> 100-199
                //[1-9]?\\d --> 0-99
        String regex = zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255;
    
        Pattern pattern = Pattern.compile(regex);
        Matcher match = pattern.matcher(ipAddress);
        
        if(match.matches()){return 1;}
        else return 0;
    }
    
}
