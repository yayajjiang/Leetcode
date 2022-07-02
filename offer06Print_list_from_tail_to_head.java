/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public int[] reversePrint(ListNode head) {
        int num=0;
        ListNode temp = head;
        while(temp!= null){
            //a[i] = head.val;
            temp = temp.next;
            //i++;
            num++;
        }
        System.out.println(num);
        int[] a = new int[num];
        int i = 0;
        while(head!= null){
            a[num-i-1] = head.val;
            head = head.next;
            i++;
        }
        return a;

    }
}
