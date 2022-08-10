class Solution {
public:
    string solveEquation(string equation) {

        int leftx = 0; int leftc = 0;
        int rightx = 0; int rightc = 0;
        int eindex = 0;
        int size = equation.size();
        int sign1 = 0;
        int sign2 = 0;
        bool valid1 = false; 
        bool valid2 = false;
        
        for(int i = 0; i < size; i++){
            if(equation[i] == '='){
                eindex = i;
            }
        }
        int number = 0;
        for(int i = 0; i < eindex; i++){
            if (equation[i] == '-' || equation[i] == '+') { // 去掉前面的符号
                sign1 = (equation[i] == '-') ? -1 : 1;
            }
            while (isdigit(equation[i])) {
                number = number * 10 + (equation[i] - '0');
                valid1 = true;
                i++;
            }
            if (equation[i] == 'x') { // 变量
                leftx += valid1 ? sign1 * number : sign1;
            } else { // 数值
                leftc += sign1 * number;
            }
            number = 0;
            valid1= 0;
        }
        
        for(int i = eindex+1; i < size; i++){
            if (equation[i] == '-' || equation[i] == '+') { // 去掉前面的符号
                sign2 = (equation[i] == '-') ? -1 : 1;
            }
            while (isdigit(equation[i])) {
                number = number * 10 + (equation[i] - '0');
                valid2 = true;
                i++;
            }
            if (equation[i] == 'x') { // 变量
                rightx += valid2 ? sign2 * number : sign2;
            } else { // 数值
                rightc += sign2 * number;
            }
            number = 0;
            valid2 = 0;
        }

        if (leftx == rightx) {
            return (rightc - leftc) == 0 ? "Infinite solutions" : "No solution";
        }
        return string("x=") + to_string((rightc-leftc) / (rightx-leftx));
        // int factor = 0, val = 0;
        // int index = 0, n = equation.size(), sign1 = 1; // 等式左边默认系数为正
        // while (index < n) {
        //     if (equation[index] == '=') {
        //         sign1 = -1; // 等式右边默认系数为负
        //         index++;
        //         continue;
        //     }

        //     int sign2 = sign1, number = 0;
        //     bool valid = false; // 记录 number 是否有效
        //     if (equation[index] == '-' || equation[index] == '+') { // 去掉前面的符号
        //         sign2 = (equation[index] == '-') ? -sign1 : sign1;
        //         index++;
        //     }
        //     while (index < n && isdigit(equation[index])) {
        //         number = number * 10 + (equation[index] - '0');
        //         index++;
        //         valid = true;
        //     }

        //     if (index < n && equation[index] == 'x') { // 变量
        //         factor += valid ? sign2 * number : sign2;
        //         index++;
        //     } else { // 数值
        //         val += sign2 * number;
        //     }
        // }

        // if (factor == 0) {
        //     return val == 0 ? "Infinite solutions" : "No solution";
        // }
        // return string("x=") + to_string(-val / factor);
    }
};
