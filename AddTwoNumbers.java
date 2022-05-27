/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
//https://leetcode.com/problems/add-two-numbers/submissions/
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode value = new ListNode(0);
        //The values being declared and the paramenters being taken in
        ListNode p = l1;
        ListNode q = l2;
        //sets curr to value as both are of ListNode
        ListNode curr = value;
        int carry = 0;
        while (p != null || q != null) {
            //checks that the values aren't null
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            //values being created to not null
            int sum = carry + x + y;
            //sum variable being setup
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            //modulus to check and division 
            curr = curr.next;
            if (p != null){
                p = p.next;
            } 
            if (q != null) {
                q = q.next;
            }
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return value.next;
        
    }
}