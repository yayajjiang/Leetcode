/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
// class Solution {
// public:
//     ListNode* mergeTwoLists(ListNode* l1, ListNode* l2) {
//         ListNode *dummy = new ListNode(-1);//dummy node
//         ListNode *curr;
//         curr = dummy;
//         ListNode *p1 = l1;   ListNode *p2 = l2;
        
//         while(p1 != nullptr && p2 != nullptr){
            
//                 if(p1->val <= p2->val){
//                     //compare the elements, and attach the link accordingly
//                     curr->next = p1;  p1 = p1->next;  //start from curr-next, because of the dummy node
//                 }else{
//                     curr->next = p2;  p2 = p2->next; 
//                 }
//                 curr = curr->next;
            
//         }
//         //directly change the link if more elements from a single list is available
//         if (p1 != nullptr) {
//             curr->next = p1;
//         }

//         if (p2 != nullptr) {
//             curr->next = p2;
//         }
    
//         return dummy->next;
//     }
// };
class Solution {
public:
    ListNode* mergeTwoLists(ListNode* l1, ListNode* l2) {
        //use recurrsion
        //mergeTwoLists(l1, l2) -> believe that it returns the head node of two sorted list
        if(l1==nullptr)return l2;
        else if(l2==nullptr)return l1;
        else{
            if(l1->val <= l2->val){
                //l1 small, needs to return l1, and it points to the next value (l1.next and l2 merge)
                l1->next = mergeTwoLists(l1->next, l2);
                return l1;

            }else{
                l2->next = mergeTwoLists(l2->next, l1);
                return l2;
            }
        }
        return nullptr;
    }
};
