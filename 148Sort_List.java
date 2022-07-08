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

//sort api, and then create new nodes, insert
class Solution {
    public ListNode sortList(ListNode head) {
        ListNode dummynode = new ListNode(0);
        dummynode.next = head;
        
        List<Integer> list = new ArrayList<Integer>();
        while(head!= null){
            list.add(head.val);
            head=head.next;
        }
        Collections.sort(list); 
        //System.out.println(list);
        ListNode temp = dummynode;
        for(int i = 0; i<list.size(); i++){
            temp.next = new ListNode(list.get(i));
            temp = temp.next;
        }
       
        return dummynode.next;
       
    }
}
