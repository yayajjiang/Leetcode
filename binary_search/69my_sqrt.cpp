class Solution {
public:
    int mySqrt(int x) {
        //double mid = 0;
        if(x <=1 )   return x;

        //double division
        //if(x == 0)  return x;         // i = 0, x/i prevent that divident is 0
        // for(int i = 1; i <= x; i++){
        //     if(i  == x / i){         //prevent overflow
        //         return i;
        //     }else if(i  > x / i){
        //         break;
        //     }else{

        //     }
        // }
        // double l = 0; double r = x;
        // while(r - l >= 1e-5){
        //     double mid = (l + r)/2;  
        //     if(mid  >= x / mid){
        //         r = mid;
        //     }else{
        //         l = mid;
        //     }
        // }
        // //cout<<l;
        // return (int)r;

        //int division
        int l = 0; int r = x;
        while( l < r){
            int mid = (l+((r-l) / 2));  //prevent overflow
            if(mid  >= x / mid){
                r = mid;
            }else{
                l = mid+1;
            }
        }
        //the difference is <= 1, need to check the bound
        if(l > x / l){
            return l-1;
        }
        return l;
        
    }
};