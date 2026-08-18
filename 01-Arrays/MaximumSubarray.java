    // Approach: Kadane's Algorithm
        // At every element, decide whether to:
        // 1. Continue the previous subarray
        // 2. Start a new subarray from the current element
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
