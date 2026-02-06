package II_Arrays.Easy;

class Solution {
    public int singleNumber(int[] nums) {
        int ans = 0;
        for (int num : nums) {
            ans = ans ^ num;
        }
        return ans;
    }
}

//TC - O(N)
//SC - O(1)