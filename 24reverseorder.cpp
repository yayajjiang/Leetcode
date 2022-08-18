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
    ListNode* reverseList(ListNode* head) {
        //1. change the value for each node, reverse order
        //needs to comfirm with hr, change the oringinal link or not

        // vector<int> v;
        // ListNode* copy = head;
        // ListNode* ans = head;

        // while(head!=nullptr){
        //     v.push_back(head->val);
        //     head = head->next;
        // }
        // for(int i = 0; i<v.size(); i++){
        //     copy->val = v[v.size()-i-1];
        //     copy = copy->next;
        // }
        // return ans;
        
        //2. change the pointers
        //FILO, use stack to reverse
        stack<ListNode*> s;
        if(head == nullptr){
            return head;
        }

        while(head!=nullptr){
            s.push(head);
            head = head->next;
        }
        ListNode* ans = new ListNode(-1);

        // dummyhead = s.top();
        ans =  s.top();
        ListNode* copy = ans;
        s.pop();
        //6
        //a
        while(!s.empty()){
            ans->next = s.top();
            s.pop();
            ans = ans->next;
            ans->next = nullptr;
        }

        return copy;
    }
};
