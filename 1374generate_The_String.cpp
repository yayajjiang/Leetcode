
class Solution {
public:
    string generateTheString(int n) {
        string s;
        int m = n;
        
        //even number
        int i = 0;
        while(--n != i){
            s.push_back('a');
        } 
        //cout<<(n&1);
        if(m & 1){
            s.push_back('a');
            //cout<<s;
            return s;
        }
        //cout<<s;
        s.push_back('b');
        //cout<<s;
        return s;
    }
};
