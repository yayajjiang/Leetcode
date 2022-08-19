class Solution {
public:
    double myPow(double x, int n) {
        //n is integer, will shrink to 0 eventually
        double res = 1.0;
        for(int i = n; i != 0; i /= 2){ //binary search
            if(i % 2 != 0){
                res *= x;
            }
            x *= x;
        }
        //remove the effect of when n is negative
        // 2^31-1, -2^31, cannot negate n because of the potential of overflow
        return  n < 0 ? 1 / res : res;
    }

};