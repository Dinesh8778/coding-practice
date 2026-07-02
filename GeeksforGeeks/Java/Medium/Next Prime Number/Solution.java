class Solution {
    public static int nextPrime(int n) {
        
        int i = 0;
        while (true) {
            ++i;
            if (prime(n + i)) {
                return n + i;
            }
        }
    }
    
    static boolean prime(int n) {
        for (int i = 2; i<n; i++) {
            if (n%i == 0) {
                return false;
            }
        }
        return true;
    }
}
