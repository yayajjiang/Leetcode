class Solution {
public:
    char repeatedCharacter(string s) {
        set<char> s1;
        char c;
        for(char c : s){
            if(s1.find(c)==s1.end()){
                s1.insert(c);
            }else{
                return c;
            }
        }
        return c;
    }
};
