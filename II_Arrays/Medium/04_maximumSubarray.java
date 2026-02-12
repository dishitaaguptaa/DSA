package II_Arrays.Medium;

//Brute 
class Solution {
    public int maxSubArray(int[] nums) {

        int n = nums.length;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) { // starting index
            for (int j = i; j < n; j++) { // ending index

                int sum = 0;

                for (int k = i; k <= j; k++) { // calculate sum
                    sum += nums[k];
                }

                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
        }

        return maxSum;
    }
}
//TC - O(N^3)
//SC - O(1)




//Better
/* class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum = sum + nums[j];
                maxSum = Math.max(sum, maxSum);
            }
        }
        return maxSum;
    }
} */
//TC - O(N^2)
// SC - O(1);




//Optimal
/* class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            maxSum = Math.max(sum, maxSum);
            if (sum < 0) {
                sum = 0;
            }
        }
        return maxSum;
    }
} */
//TC - O(N)
//SC - O(1)