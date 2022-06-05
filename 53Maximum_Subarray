import java.lang.Math;  
class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int max = nums[0]; //最大值，初始化为nums[0]，切忌设置为0，或者设置成min
        int temp = nums[0]; //局部最大值，不断更新
        for( int i = 1; i< nums.length; i++){
            if(temp + nums[i] >= nums[i]){
                
                temp = temp + nums[i];
            }else{
                temp = nums[i];
            }
            
            if(temp > max){
                max = temp;
            }
            
        }
        
        return max;
    }
}


/* dp 动态规划
        int res = nums[0];
        int[] dp = new int[nums.length];
        dp[0] = nums[0]; //base case
        for (int i = 1; i < nums.length; i++) {
            dp[i] = Math.max(dp[i - 1] + nums[i], nums[i]);
            res = res > dp[i] ? res : dp[i];
        }
        return res;
 */
