// #283 LeetCode
// Approach: Two Pointers
// i scans the array, j tracks the position for the next non-zero element. When a non-zero element is found, swap nums[i] with nums[j] and increment j.

// Time: O(n)
// Space: O(1)

class Solution {
    public void moveZeroes(int[] nums) {

        int j=0;

        for(int i=0;i<nums.length;i++){

            if(nums[i]!=0){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j++;
            }
        }
    }
}
