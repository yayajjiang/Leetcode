class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        if(x<10){
            return true;
        }
        // if(x%11 != 0){
        //     return false;
        // }
        int copy = x;
        int reverse = x%10;
        x=x/10;
        while (x > 0){
            reverse*=10;
            reverse += x%10;
            x=x/10;
            //System.out.println(reverse);
        }
        if(reverse == copy) return true;
        return false;
    }
}
