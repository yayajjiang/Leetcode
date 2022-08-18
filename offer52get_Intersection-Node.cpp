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
    
    ListNode *getIntersectionNode(ListNode *headA, ListNode *headB) {
        //stack, go from back to front
        stack<ListNode *> sA;
        stack<ListNode *> sB;
        ListNode* tempA = headA;
        ListNode* tempB = headB;
        while(tempA!=nullptr){
            sA.push(tempA);
            tempA = tempA->next;
        }
         while(tempB!=nullptr){
            sB.push(tempB);
            tempB = tempB->next;
        }
        ListNode *ans = nullptr;
        while(!sA.empty() && !sB.empty() && sA.top() == sB.top()){
            ans = sA.top();//needs to store the value and then return
            sA.pop();
            sB.pop();
           
        }
        return ans;

        //two pointers 
        // if(headA == nullptr || headB == nullptr) return nullptr;
        // ListNode* tempA = headA;
        // ListNode* tempB = headB;
        // while(tempA != tempB){
        //     tempA = tempA == nullptr ? headB: tempA->next;
        //     tempB = tempB == nullptr ? headA: tempB->next;
        // }
        // return tempA;

        //brute force
        // ListNode* tempA = headA;
        // ListNode* tempB = headB;
        // while(tempB){
        //     while(tempA){
        //         if(tempA != tempB){
        //             tempA = tempA->next;
        //         }else{
        //             return tempA;
        //         }
                
        //     }
        //     tempA = headA;//remember to initialize 
        //     tempB = tempB->next;
        // }
        // return nullptr;
        
        //set
        // unordered_set<ListNode *> visited;
        // ListNode *temp = headA;
        // while (temp != nullptr) {
        //     visited.insert(temp);
        //     temp = temp->next;
        // }
        // temp = headB;
        // while (temp != nullptr) {
        //     if (visited.count(temp)) {
        //         return temp;
        //     }
        //     temp = temp->next;
        // }
        // return nullptr;
    }
};
