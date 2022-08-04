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
      //4. iteration
        ListNode* prev = nullptr;//needs to initialize first
        while(head!=nullptr){
            ListNode *temp = head->next;
            head->next = prev;
            prev=head;
            head=temp;
        }
        return prev;
      
      
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
//         stack<ListNode*> s;
//         if(head == nullptr){
//             return head;
//         }

//         while(head!=nullptr){
//             s.push(head);
//             head = head->next;
//         }
//         ListNode* ans;
//         //654321
//         //ans 65
//         //copy (save the head pointer)
//         // dummyhead = s.top();
//         ans =  s.top();
//         ListNode* copy = ans;
//         s.pop();
//         while(!s.empty()){
//             ans->next = s.top();
//             s.pop();
//             ans = ans->next;
//             //ans->next = nullptr;    //1-2, 1-null
//         }
//         ans->next = nullptr; 
//         return copy;
      
      
      //3.use vector to store the nodes
        vector<ListNode*> v;
        ListNode* copy = head;
        if(head == nullptr){
            return head;
        }
        ListNode* dummy = new ListNode(-1);//needs to delete it after use
        ListNode* laji = dummy;
        //ListNode* a = dummy;
        ListNode* ans;
        while(copy!=nullptr){
            v.push_back(copy);
            copy = copy->next;
        }
        //cout<<v.at(4)->val;
        int i = 0;
        while(!v.empty()){
            
            laji->next = v.back();
            //cout<<v.back()->val;
            if(i == 0){
                ans = laji->next;
                //cout<<ans->val;
            }
            v.pop_back();
            laji = laji->next;
            laji->next = nullptr;//IMPORTANT needs to break the link
            i++;

        }
        //laji->next = nullptr;//IMPORTANT needs to break the link
        // delete dummy;
        // dummy = nullptr;
        // cout << laji->val;
        //delete laji;
        return ans;
    }
};
