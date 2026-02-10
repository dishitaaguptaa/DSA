package II_Arrays.Medium;

class Solution {
    public void sortColors(int[] nums) {
        int left = 0; // end of 0s region
        int mid = 0; // current element
        int right = nums.length - 1; // start of 2s region

        while (mid <= right) {
            if (nums[mid] == 0) {
                // swap nums[left] and nums[mid]
                int temp = nums[left];
                nums[left] = nums[mid];
                nums[mid] = temp;

                left++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else { // nums[mid] == 2
                     // swap nums[mid] and nums[right]
                int temp = nums[mid];
                nums[mid] = nums[right];
                nums[right] = temp;

                right--;
            }
        }
    }
}
