public class prime {
    public static void main(String[] args) {
        int[] prime = { 1,2,3,5};
        int max = 0;
        for (int i = 0; i < prime.length; i++) {
            if (isPrime(prime[i])) {
                if (max < prime[i]) {
                    max = prime[i];
                }
            }
        }
        System.out.println("Highest prime: " + max);
    }

    static boolean isPrime(int n) {
        if (n <= 1)
            return false;

        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    }
}
