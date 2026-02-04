package II_Arrays.Easy;
//OPTIMAL APPROACH
class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; //This is done because if k = 20, its equal to 7+7+6 => it means we have to do only 6 rotation on original array
        reverse(nums, 0, n - 1); //O(N)
        reverse(nums, 0, k - 1); //O(K)
        reverse(nums, k, n - 1); //O(N-K)
    }

    void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
//Time Complexity - O(2N)
//Space Complexity - O(1)

//Explanation of why the whole array was reversed first in rotating right
// A = first part = [1 2 3 4]
// B = last k part=[5 6 7]
// Wanted result = B + A
// B + A  = reverse( reverse(A) + reverse(B) )

//left rotate by d places
// class Solution {
//     static void rotateArr(int arr[], int d) {
//         // code here
//         int n = arr.length;
//         d = d % n;
//         reverse(arr, 0, d - 1);
//         reverse(arr, d, n - 1);
//         reverse(arr, 0, n - 1);
//     }

//     static void reverse(int[] nums, int start, int end) {
//         while (start < end) {
//             int temp = nums[start];
//             nums[start] = nums[end];
//             nums[end] = temp;
//             start++;
//             end--;
//         }
//     }
// }

//Explanantion: why whole array was not reversed
// A=first d 
// B=rest
// Result = B + A
// reverse(A)
// reverse(B)
// reverse(all)



//BRUTE APPROACH
/* class Solution {
    public static void rotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n;

        int[] temp = new int[k];

        // store last k elements
        for (int i = 0; i < k; i++) {
            temp[i] = arr[n - k + i];
        }

        // shift remaining elements
        for (int i = n - k - 1; i >= 0; i--) {
            arr[i + k] = arr[i];
        }

        // copy temp to front
        for (int i = 0; i < k; i++) {
            arr[i] = temp[i];
        }
    }
}

Time Complexity - O(N)
Space Complexity - O(K) Not Good */