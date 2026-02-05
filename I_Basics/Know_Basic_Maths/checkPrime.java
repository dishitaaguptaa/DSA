package I_Basics.Know_Basic_Maths;

class Solution {
    static boolean isPrime(int n) {
        // code here
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if ((n % i) == 0)
                return false;
        }
        return true;
    }
}
