// Product of Array Except Self - LeetCode #238

// Approach:
// 1. First pass → store left products in result array.
// 2. Second pass from right → maintain right product and multiply with result[i].

// Time Complexity: O(n)
// Space Complexity: O(1) extra space


class Solution {
    public int[] productExceptSelf(int[] nums) {
        int res[]=new int[nums.length];

        int left=1;
        for(int i=0;i<nums.length;i++){
            res[i]=left;
            left*=nums[i];
        }

        int right=1;

        for(int i=nums.length-1;i>=0;i--){
            res[i]=res[i]*right;
            right*=nums[i];
        }
        
        return  res;
    }
}
