class Solution {
public:
    bool isValid(string s) {

        stack<char> left;
        //use a stack to store and pop paired ones
        for (char c : s) {
            //only three types of parenthesis
            if (c == '(' || c == '{' || c == '[')
                left.push(c);
            else 
                if (!left.empty() && leftOf(c) == left.top())
                    left.pop();
                else
                    // not paired, return false
                    return false;
        }
        //left parenthesis left
        return left.empty();
    }

    char leftOf(char c) {
        if (c == '}') return '{';
        if (c == ')') return '(';
        return '[';
    }
    
};
