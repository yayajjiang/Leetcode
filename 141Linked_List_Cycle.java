
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        if(head == null || head.next ==null){
            return false;
        }
        while(slow != null && fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)    return true;
        }

        return false;
    }
}

//hashset
public class Solution {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> seen = new HashSet<ListNode>();//list node as element inserted, not value, to avoid cases that two nodes have the same value
        while (head != null) {
            if (!seen.add(head)) {  //return true if the object address is in the set, else return false
                return true;
            }
            head = head.next;
        }
        return false;
    }
}

author：LeetCode-Solution
link：https://leetcode.cn/problems/linked-list-cycle/solution/huan-xing-lian-biao-by-leetcode-solution/

