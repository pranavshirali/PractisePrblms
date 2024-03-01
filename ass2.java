public class ass2 {
    public static void main(String[] args) {
        // Question 1
        System.out.println(luckySum(1, 2, 3));    // Output: 6
        System.out.println(luckySum(1, 2, 13));   // Output: 3
        System.out.println(luckySum(1, 13, 3));   // Output: 1
        
        // Question 2
        System.out.println(noTeenSum(1, 2, 3));   // Output: 6
        System.out.println(noTeenSum(2, 13, 1));  // Output: 3
        System.out.println(noTeenSum(2, 1, 14));  // Output: 3
        
        // Question 3
        System.out.println(greenTicket(1, 2, 3)); // Output: 0
        System.out.println(greenTicket(2, 2, 2)); // Output: 20
        System.out.println(greenTicket(1, 1, 2)); // Output: 10
    }

    // Question 1
    public static int luckySum(int a, int b, int c) {
        if (a == 13) {
            return 0;
        } else if (b == 13) {
            return a;
        } else if (c == 13) {
            return a + b;
        } else {
            return a + b + c;
        }
    }

    // Question 2
    public static int noTeenSum(int a, int b, int c) {
        return fixTeen(a) + fixTeen(b) + fixTeen(c);
    }

    public static int fixTeen(int n) {
        if (n >= 13 && n <= 19 && n != 15 && n != 16) {
            return 0;
        }
        return n;
    }

    // Question 3
    public static int greenTicket(int a, int b, int c) {
        if (a == b && b == c) {
            return 20;
        } else if (a == b || a == c || b == c) {
            return 10;
        } else {
            return 0;
        }
    }
}
