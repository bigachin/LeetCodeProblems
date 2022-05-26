class Solution {
    //Two sum returns the indicies of the values that add up to a target
    //https://leetcode.com/problems/two-sum/
    public int[] twoSum(int[] nums, int target) {
        int[] array = new int[2];
        for(int i=0;i<nums.length-1;i++) { 
            if(nums[i]+nums[i+1] == target) {
                array[0] = i;
                array[1] = i+1;
            }
        }
        return array;
        
    }
}