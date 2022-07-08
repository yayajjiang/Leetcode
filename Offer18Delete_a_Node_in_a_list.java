/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

//two pointers
class Solution {
    public ListNode deleteNode(ListNode head, int val) {
      if(head==null) return null;
      //if the first node needs to be deleted  
      if(head.val == val){
            head = head.next;
            return head;
        }
        //double pointers to find the node and delete it
        ListNode temp = head.next;
        ListNode prev = head;
        while(temp.next != null){
            if(temp.val == val){
                prev.next = temp.next;
                return head;
            }else{
              //update the two pointers
                prev = temp;
                temp = temp.next;
            }
            
        }
      //if the last node needs to be deleted  
        if(temp.val == val){
            prev.next = null;
            return head;
        }
      //else, no value found, return head node directly
        return head;
    }
}
