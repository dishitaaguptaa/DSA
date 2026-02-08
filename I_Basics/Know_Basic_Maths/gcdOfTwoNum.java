package I_Basics.Know_Basic_Maths;

/* class Solution {
    public int GCD(int n1, int n2) {
        int max = 0;
        int k = 0;
        int gcd = 0;
        if (n1 > n2) {
            max = n1;
        } else {
            max = n2;
        }
        int[] temp = new int[max];
        for (int i = 1; i <= max; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                temp[k] = i;
                k++;
            }
        }
        for (int j = 0; j < k; j++) {
            if (temp[j] > gcd) {
                gcd = temp[j];
            }
        }
        return gcd;
    }
} */




class Solution {
    public int GCD(int n1, int n2) {
        int gcd = 1;
        int limit = Math.min(n1, n2);

        for (int i = 1; i <= limit; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }
}

// Time - O(min(n1, n2))
// Space - O(1)

// optimal
/* 
 * class Solution {
 * public int GCD(int n1, int n2) {
 * while (n2 != 0) {
 * int rem = n1 % n2;
 * n1 = n2;
 * n2 = rem;
 * }
 * return n1;
 * }
 * }
 */
// Time - O(log(min(n1,n2)))
// Space - O(1)




// code for both gcd and lcm
/*
 * class Solution {
 * public static int[] lcmAndGcd(int a, int b) {
 * int gcd = findGcd(a, b);
 * int lcm = (a / gcd) * b;
 * 
 * return new int[] { lcm, gcd };
 * }
 * 
 * private static int findGcd(int a, int b) {
 * while (b != 0) {
 * int rem = a % b;
 * a = b;
 * b = rem;
 * }
 * return a;
 * }
 * }
 */

// gcd(a, b) = gcd(b, a % b) -> Euclidean algo
// LCM(a, b) × GCD(a, b) = a × b -> lcm = (a / gcd) * b;
// Time - O(log(min(a,b)))
// Space - O(1)