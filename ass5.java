import java.util.Scanner;

public class ass5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Problem No: 01
        System.out.println("Enter a, b, and n for problem 1:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();
        printSeries(a, b, n);

        // Problem No: 02
        System.out.println("Enter x for problem 2:");
        int x = scanner.nextInt();
        System.out.println(reverseOfX(x));

        // Problem No: 03
        System.out.println("Enter x for problem 3:");
        int xBinary = scanner.nextInt();
        System.out.println(binaryNum(xBinary));

        // Problem No: 04
        System.out.println("Enter From stage, To stage, number of adult passengers, and number of children passengers for problem 4:");
        int fromStage = scanner.nextInt();
        int toStage = scanner.nextInt();
        int adultPassengers = scanner.nextInt();
        int childPassengers = scanner.nextInt();
        busTicket(fromStage, toStage, adultPassengers, childPassengers);

        // Problem No: 05
        System.out.println("Enter x for problem 5:");
        int xNearestPrime = scanner.nextInt();
        System.out.println(nearestPrime(xNearestPrime));

        // Problem No: 06
        System.out.println("Enter x for problem 6:");
        int xPrimeDigitSum = scanner.nextInt();
        System.out.println(primeDigitSum(xPrimeDigitSum));

        // Problem No: 07
        System.out.println("Enter x for problem 7:");
        int xNearestArmstrong = scanner.nextInt();
        System.out.println(nearestArmstrong(xNearestArmstrong));

        // Problem No: 08
        System.out.println("Enter x and y for problem 8:");
        int xFibPrime = scanner.nextInt();
        int yFibPrime = scanner.nextInt();
        fibPrime(xFibPrime, yFibPrime);

        // Problem No: 09
        System.out.println("Enter x for problem 9:");
        int xFibPrimeCheck = scanner.nextInt();
        fibPrimeCheck(xFibPrimeCheck);

        scanner.close();
    }

    // Problem No: 01
    public static void printSeries(int a, int b, int n) {
        long sum = a;
        System.out.print(sum + " ");
        for (int i = 1; i <= n; i++) {
            sum += Math.pow(2, i) * b;
            System.out.print(sum + " ");
        }
        System.out.println();
    }

    // Problem No: 02
    public static int reverseOfX(int x) {
        int reversed = 0;
        while (x != 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }
        return reversed;
    }

    // Problem No: 03
    public static String binaryNum(int x) {
        return Integer.toBinaryString(x);
    }

    // Problem No: 04
    public static void busTicket(int fromStage, int toStage, int adultPassengers, int childPassengers) {
        int stages = Math.abs(toStage - fromStage);
        double adultCost = 10 * adultPassengers * stages;
        double childCost = 5 * childPassengers * stages;
        double totalTicketCost = adultCost + childCost;
        
        double discount = 0;
        if (adultPassengers >= 5) {
            discount = 0.2;
        } else if (adultPassengers == 4) {
            discount = 0.15;
        } else if (adultPassengers == 3) {
            discount = 0.1;
        } else if (adultPassengers == 2) {
            discount = 0.05;
        }

        double discountedTicketCost = totalTicketCost - (discount * totalTicketCost);
        double serviceCharge = 0.05 * discountedTicketCost;
        double finalTicketCost = discountedTicketCost + serviceCharge;

        System.out.println("Total Ticket Cost: " + finalTicketCost);
    }

    // Problem No: 05
    public static int nearestPrime(int x) {
        if (isPrime(x)) {
            return x;
        }
        int smallerPrime = x - 1;
        int largerPrime = x + 1;
        while (!isPrime(smallerPrime) && !isPrime(largerPrime)) {
            smallerPrime--;
            largerPrime++;
        }
        if (isPrime(smallerPrime)) {
            return smallerPrime;
        } else {
            return largerPrime;
        }
    }

    // Helper method for Problem No: 05
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Problem No: 06
    public static boolean primeDigitSum(int x) {
        int sum = 0;
        while (x != 0) {
            int digit = x % 10;
            sum += digit;
            x /= 10;
        }
        return isPrime(sum);
    }

    // Problem No: 07
    public static int nearestArmstrong(int x) {
        int smallerArmstrong = x - 1;
        int largerArmstrong = x + 1;
        while (!isArmstrong(smallerArmstrong) && !isArmstrong(largerArmstrong)) {
            smallerArmstrong--;
            largerArmstrong++;
        }
        if (isArmstrong(smallerArmstrong)) {
            return smallerArmstrong;
        } else {
            return largerArmstrong;
        }
    }

    // Helper method for Problem No: 07
    public static boolean isArmstrong(int num) {
        int originalNum = num;
        int sum = 0;
        int numDigits = String.valueOf(num).length();
        while (num != 0) {
            int digit = num % 10;
            sum += Math.pow(digit, numDigits);
            num /= 10;
        }
        return sum == originalNum;
    }

    // Problem No: 08
    public static void fibPrime(int x, int y) {
        for (int i = x; i <= y; i++) {
            if (isFibonacci(i) && isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    // Helper method for Problem No: 08
    public static boolean isFibonacci(int num) {
        return isPerfectSquare(5 * num * num + 4) || isPerfectSquare(5 * num * num - 4);
    }

    // Helper method for Problem No: 08
    public static boolean isPerfectSquare(int x) {
        int sqrt = (int) Math.sqrt(x);
        return sqrt * sqrt == x;
    }

    // Problem No: 09
    public static void fibPrimeCheck(int x) {
        if (isFibonacci(x) && isPrime(x)) {
            System.out.println(x);
        } else {
            int smallerFibPrime = x - 1;
            int largerFibPrime = x + 1;
            while (!(isFibonacci(smallerFibPrime) && isPrime(smallerFibPrime)) && !(isFibonacci(largerFibPrime) && isPrime(largerFibPrime))) {
                smallerFibPrime--;
                largerFibPrime++;
            }
            if (isFibonacci(smallerFibPrime) && isPrime(smallerFibPrime)) {
                System.out.println(smallerFibPrime);
            } else {
                System.out.println(largerFibPrime);
            }
        }
    }
}
