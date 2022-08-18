#include <string>
class Solution {
public:
    vector<string> stringMatching(vector<string>& words) {
        vector<string> s;

        sort(words.begin(), words.end(), 
        [](string &a, string &b)
        {
            return a.size() < b.size();
        });

        //for(string i : words)   cout<<i<<" "; sort from small size to large size
        for(int i = 0; i < words.size(); i++){
            for(int j = i + 1; j < words.size(); j++){
                //if(strstr(words.at(j).c_str(),(words.at(i)).c_str())){
                    //if(words.at(j).contains(words.at(i)))){
                    if(words.at(j).find(words.at(i)) != string::npos){
                    if(find(s.begin(), s.end(), words.at(i)) == s.end())
                        s.push_back(words.at(i));
                }
            }
        }
        return s;
    }
};
