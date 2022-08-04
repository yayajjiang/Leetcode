/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    ListNode* mergeTwoLists(ListNode* l1, ListNode* l2) {
        ListNode *dummy = new ListNode(-1);//dummy node
        ListNode *curr;
        curr = dummy;
        ListNode *p1 = l1;   ListNode *p2 = l2;
        
        while(p1 != nullptr && p2 != nullptr){
            
                if(p1->val <= p2->val){
                    //compare the elements, and attach the link accordingly
                    curr->next = p1;  p1 = p1->next;  //start from curr-next, because of the dummy node
                }else{
                    curr->next = p2;  p2 = p2->next; 
                }
                curr = curr->next;
            
        }
        //directly change the link if more elements from a single list is available
        if (p1 != nullptr) {
            curr->next = p1;
        }

        if (p2 != nullptr) {
            curr->next = p2;
        }
    
        return dummy->next;
    }
};
