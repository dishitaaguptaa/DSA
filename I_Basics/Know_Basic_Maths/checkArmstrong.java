package I_Basics.Know_Basic_Maths;

class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        int original = n;
        int sum = 0;
        int i = 0;
        while (n > 0) {
            n = n / 10;
            i++;
        }
        n = original;
        while (n > 0) {
            int rem = n % 10;
            sum = sum + (int) Math.pow(rem, i);
            n = n / 10;
        }

        return original == sum;
    }
}
