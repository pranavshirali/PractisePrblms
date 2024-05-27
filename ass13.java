import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;
import java.util.Stack;
public class ass13 {

    public static int romanToInt(String s) {
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int total = 0;
        int length = s.length();

        for (int i = 0; i < length; i++) {
            int currentVal = romanMap.get(s.charAt(i));

            if (i < length - 1 && currentVal < romanMap.get(s.charAt(i + 1))) {
                total -= currentVal;
            } else {
                total += currentVal;
            }
        }

        return total;
    }    
        
    public static void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        
        boolean[] rows = new boolean[m];
        boolean[] cols = new boolean[n];
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    rows[i] = true;
                    cols[j] = true;
                }
            }
        }
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (rows[i] || cols[j]) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
    
    public static int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        int currentNumber = 0;
        int result = 0;
        int sign = 1;  

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isDigit(c)) {
                currentNumber = currentNumber * 10 + (c - '0');
            } else if (c == '+') {
                result += sign * currentNumber;
                currentNumber = 0;
                sign = 1;  
            } else if (c == '-') {
                result += sign * currentNumber;
                currentNumber = 0;
                sign = -1;  
            } else if (c == '(') {
               
                stack.push(result);
                stack.push(sign);
                
                result = 0;
                sign = 1;
            } else if (c == ')') {
                result += sign * currentNumber;
                currentNumber = 0;
                result *= stack.pop();  
                result += stack.pop();  
            }
        }
        result += sign * currentNumber;  
        return result;
    }

    public static void main(String[] args) {
//Problem NO.1
        System.err.println("Solution: 1");
        System.out.println(romanToInt("III"));       
        System.out.println(romanToInt("LVIII"));    
        System.out.println(romanToInt("MCMXCIV"));  

//Problem NO.2
        System.err.println("\nSolution: 2");
        int[][] matrix1 = {
            {1, 1, 1},
            {1, 0, 1},
            {1, 1, 1}
        };
        setZeroes(matrix1);
        System.out.println(Arrays.deepToString(matrix1));
        int[][] matrix2 = {
            {0, 1, 2, 0},
            {3, 4, 5, 2},
            {1, 3, 1, 5}
        };
        setZeroes(matrix2);
        System.out.println(Arrays.deepToString(matrix2));

    //Problem NO.3
        System.err.println("\nSolution: 3 ");
        System.out.println(calculate("1 + 1"));  
        System.out.println(calculate(" 2-1 + 2 "));  
        System.out.println(calculate("(1+(4+5+2)-3)+(6+8)"));  
        }



}
