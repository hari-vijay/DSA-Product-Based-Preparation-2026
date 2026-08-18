//   ### 3. Maximum Subarray — LeetCode #53

// **Approach:** Kadane's Algorithm

// **Idea:**  
// At every element, compare:
// - Continuing the previous subarray: `currentSum + nums[i]`
// - Starting fresh from the current element: `nums[i]`

// Choose the maximum of the two.

// **Time Complexity:** O(n)

// **Space Complexity:** O(1)
class Solution {
    public int maxSubArray(int[] nums) {
        int max=Integer.MIN_VALUE;
        int currentsum=0;

        for(int i=0;i<nums.length;i++){

            currentsum+=nums[i];

            currentsum=Math.max(currentsum,nums[i]);
            max=Math.max(max,currentsum);
        }
        return max;
    }
}
