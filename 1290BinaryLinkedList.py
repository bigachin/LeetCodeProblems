# Definition for singly-linked list.
class ListNode(object):
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
class Solution(object):
    def getDecimalValue(self, head):
        current = head 
        total = ""
        while current is not None:
            total += str(current.val)
            current = current.next
        return int(total, 2)



        
        