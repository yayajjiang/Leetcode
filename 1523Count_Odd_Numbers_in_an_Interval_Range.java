class Solution {
    public int countOdds(int low, int high) {
        int odds = 0;
        
        if(low%2==1){
            odds+=1;
            low++;
        }
        if(high%2==1){
            odds+=1;
            high--;
        }
        odds += (high-low)/2;
        return odds;
    }
}
