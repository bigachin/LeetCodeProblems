class Solution(object):
    def containsNearbyDuplicate(self, nums, k):
        count_dict = {}
        indices = {}
        
        for i, num in enumerate(nums):
            if num in count_dict:
                count_dict[num] += 1
                indices[num].append(i)
            else:
                count_dict[num] = 1
                indices[num] = [i]
        
        for num in count_dict:
            if count_dict[num] > 1:
                for j in range(1, len(indices[num])):
                    if abs(indices[num][j] - indices[num][j-1]) <= k:
                        return True
        return False
