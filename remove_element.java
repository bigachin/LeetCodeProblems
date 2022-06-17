class Solution {
    public int removeElement(int[] nums, int val) {
        int index = 0;
        for(int value : nums){
            if(value != nums[index]){
                nums[index]=value;
                index++;
            }
        }
        return nums[index];
        
    }
}

