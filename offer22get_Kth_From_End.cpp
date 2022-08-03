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
    ListNode* getKthFromEnd(ListNode* head, int k) {
        //use deque to push and pop
        deque<ListNode*> d;
        while (head != NULL) {
            d.push_back(head);
            head = head->next;
        }
        ListNode* ans;
        while (k-- > 0){
            ans = d.back();
            d.pop_back();
        } 
        return ans;
    }
};
        //two pointers
        // ListNode* curr = head;
        // ListNode* back = head;
        // while(k > 1){//k = 1, curr = back = end
        //     back = back->next;
        //     k--;
        // }
        // while(back->next != NULL){
        //     curr = curr->next;
        //     back = back->next;
        // }
        // return curr;
//     }
// };
