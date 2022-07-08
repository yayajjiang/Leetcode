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

// class Solution {
//     public ListNode deleteNode(ListNode head, int val) {
//         if(head.val == val) {
//             return head.next;
//         }

//         ListNode pre = head;
//         while ((pre.next != null) && (pre.next.val != val)){
//             pre = pre.next;
//         }

//         if(pre.next != null) {
//             pre.next = pre.next.next;
//         }

//         return head;
//     }
// }

// author：Dine
// link：https://leetcode.cn/problems/shan-chu-lian-biao-de-jie-dian-lcof/solution/jian-zhi-offer-18-shan-chu-lian-biao-de-jie-dian-d/


//dummy node
// class Solution {
//     public ListNode deleteNode(ListNode head, int val) {
//         ListNode dummyHead = new ListNode(0);  
//         dummyHead.next = head;
//         ListNode cur = dummyHead;  
//         while (cur.next != null) {
//             if (cur.next.val == val) {
//                 cur.next = cur.next.next;
//             } else {
//                 cur = cur.next;
//             }
//         }
//         return dummyHead.next;
//     }
// }


//stack
// class Solution {
//     public ListNode deleteNode(ListNode head, int val) {
//         Stack<ListNode> stack = new Stack<ListNode>();
//         while (head != null) {
//             if (head.val != val) {
//                 stack.push(head);
//             }
//             head = head.next;
//         }

//         while (!stack.isEmpty()) {
//             stack.peek().next = head;
//             head = stack.pop();
//         }
//         return head;
//     }
// }

