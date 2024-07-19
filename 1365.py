class Solution(object):
    def smallerNumbersThanCurrent(self, nums):
        count = 0
        count_val = []
        for i in range(len(nums)):
            for j in range(len(nums)):
                if(nums[i]>nums[j]):
                    count+=1
            count_val.append(count)
            count = 0
        return count_val

        