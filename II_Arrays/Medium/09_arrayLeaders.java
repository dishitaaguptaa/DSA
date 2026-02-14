package II_Arrays.Medium;

import java.util.ArrayList;
import java.util.Collections;
class Solution {
    static ArrayList<Integer> leaders(int arr[]) {

        ArrayList<Integer> res = new ArrayList<>();

        int maxRight = arr[arr.length - 1];
        res.add(maxRight); // last element is always a leader

        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] >= maxRight) {
                maxRight = arr[i];
                res.add(arr[i]);
            }
        }

        // leaders were added from right to left, reverse result
        Collections.reverse(res);
        return res;
    }
}
