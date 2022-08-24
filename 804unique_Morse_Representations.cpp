class Solution {
public:
    int uniqueMorseRepresentations(vector<string>& words) {
        vector<string> dic{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        set<string> s;
        string ans = "";
        while(words.size()!=0){
            string word = words.at(0);
            for(int i =0; i < word.size(); i++){
                ans.append(dic.at( word.at(i) - 'a'));
            }
            //cout<<ans;
            s.insert(ans);
            ans = "";
            words.erase(words.begin());
        }
        
        return s.size();
    }
};
