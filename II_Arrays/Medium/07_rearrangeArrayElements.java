package II_Arrays.Medium;

//Optimal
class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] temp = new int[nums.length];
        int k = 0, j = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                temp[k] = nums[i];
                k = k + 2;
            } else {
                temp[j] = nums[i];
                j = j + 2;
            }
        }
        return temp;
    }
}

//TC - O(N)
//SC - O(N)



//Brute
/* class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;

        int[] pos = new int[n / 2];
        int[] neg = new int[n / 2];

        int p = 0, q = 0;

        // Separate positives and negatives
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                pos[p++] = nums[i];
            } else {
                neg[q++] = nums[i];
            }
        }

        // Fill alternately
        int[] result = new int[n];
        for (int i = 0; i < n / 2; i++) {
            result[2 * i] = pos[i];
            result[2 * i + 1] = neg[i];
        }

        return result;
    }
} */
//TC - O(N) + O(N/2)
//SC - O(N)






//SECOND VARIETY: POS AND NEG NOT EQUAL
/* import java.util.*;

class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;

        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        // Separate positives and negatives
        for (int num : nums) {
            if (num > 0) {
                pos.add(num);
            } else {
                neg.add(num);
            }
        }

        int i = 0, p = 0, q = 0;

        // Alternate while both have elements
        while (p < pos.size() && q < neg.size()) {
            nums[i++] = pos.get(p++);
            nums[i++] = neg.get(q++);
        }

        // Add remaining positives
        while (p < pos.size()) {
            nums[i++] = pos.get(p++);
        }

        // Add remaining negatives
        while (q < neg.size()) {
            nums[i++] = neg.get(q++);
        }

        return nums;
    }
} */
//TC - O(N)