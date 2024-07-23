class Solution(object):
    def maximumWealth(self, accounts):
        largest = 0
        sum1 = 0
        for i in range(len(accounts)):
            for j in range(len(accounts[i])):
                sum1+=accounts[i][j]
            if(sum1>largest):
                largest = sum1
            sum1 = 0
        return largest 



       
        