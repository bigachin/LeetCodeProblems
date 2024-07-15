class Solution(object):
    def mergeAlternately(self, word1, word2):
        merged = ""
        length = min(len(word1),len(word2))
        for i in range(length):
            merged += word1[i]+word2[i]
        if(len(word1)>len(word2)):
            merged+= word1[length:]
        else:
            merged+= word2[length:]
        return merged


            
      

        