#include <iostream>
#include <string>
using namespace std;

class Solution {
public:
    int dayOfYear(string date) {
        

        int year = stoi(date.substr(0,4));
        //cout<<year;
        int month = stoi(date.substr(5,7));
        int day = stoi(date.substr(8,10));
        bool isleap = false;
        int ans = 0;
        if(year % 4 == 0 && year % 100 != 0)  isleap = true;
        //cout<<isleap;
        if(year % 400 == 0)    isleap = true;
        vector<int> days={31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for(int i = 0; i<month-1; i++){
            ans += days[i];
        }
        ans += day;
        if(isleap && month >= 3)  ans++;  //be careful with the condition
        return ans;
    }
};



//java
class Solution {
    static int[] nums = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    static int[] f = new int[13];
    static {
        for (int i = 1; i <= 12; i++) f[i] = f[i - 1] + nums[i - 1];
    }
    public int dayOfYear(String date) {
        String[] ss = date.split("-");
        int y = Integer.parseInt(ss[0]), m = Integer.parseInt(ss[1]), d = Integer.parseInt(ss[2]);
        boolean isLeap = (y % 4 == 0 && y % 100 != 0) || y % 400 == 0;
        int ans = m > 2 && isLeap ? f[m - 1] + 1 : f[m - 1];
        return ans + d;
    }
}


author：AC_OIer
link：https://leetcode.cn/problems/day-of-the-year/solution/gong-shui-san-xie-jian-dan-qian-zhui-he-lwo2g/
