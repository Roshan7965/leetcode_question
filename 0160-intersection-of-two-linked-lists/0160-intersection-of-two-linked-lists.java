/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        while(headB!=null){
            ListNode tem=headA;
            while(tem!=null){
                if(tem==headB){
                    return headB;
                }
                tem=tem.next;
            }
            headB=headB.next;
        }
        return null;
    }
}