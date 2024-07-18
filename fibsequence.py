class Solution(object):
    def fib(self, n):
        if((n==1) or (n==0)):
            return n
        else: 
            return self.fib(n-1) + self.fib(n-2)
        

        