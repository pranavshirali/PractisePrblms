public class ass3 {
    public static void main(String[] args) {
        // Problem No: 01
        System.out.println(lastDigit(7, 17));   // Output: true
        System.out.println(lastDigit(6, 17));   // Output: false
        System.out.println(lastDigit(3, 113));  // Output: true
        
        // Problem No: 02
        System.out.println(isEven(6));  // Output: true
        System.out.println(isEven(7));  // Output: false
        System.out.println(isEven(9));  // Output: false
        
        // Problem No: 03
        System.out.println(sumDouble(1, 2));  // Output: 3
        System.out.println(sumDouble(3, 2));  // Output: 5
        System.out.println(sumDouble(2, 2));  // Output: 8
        
        // Problem No: 04
        System.out.println(makes10(9, 10)); // Output: true
        System.out.println(makes10(9, 9));  // Output: false
        System.out.println(makes10(1, 9));  // Output: true
        
        // Problem No: 05
        System.out.println(in1020(12, 99));  // Output: true
        System.out.println(in1020(21, 12));  // Output: true
        System.out.println(in1020(8, 99));   // Output: false
    }

    // Problem No: 01
    public static boolean lastDigit(int a, int b) {
        return (a % 10 == b % 10);
    }

    // Problem No: 02
    public static boolean isEven(int n) {
        return (n % 2 == 0);
    }

    // Problem No: 03
    public static int sumDouble(int a, int b) {
        if (a == b) {
            return 2 * (a + b);
        }
        return a + b;
    }

    // Problem No: 04
    public static boolean makes10(int a, int b) {
        return (a == 10 || b == 10 || a + b == 10);
    }

    // Problem No: 05
    public static boolean in1020(int a, int b) {
        return (a >= 10 && a <= 20) || (b >= 10 && b <= 20);
    }
}
