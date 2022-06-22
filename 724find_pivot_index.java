class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
        }
        int left = 0; //create a new variable that stores left sum
        for(int i=0; i<nums.length; i++){
            if(left * 2 == sum-nums[i]){//use an if loop instead of a for loop
                return i;//use multiplication instead of division
            }
            left += nums[i];
        }
        return -1;
            
//         if(sum-nums[0]==0 ){
//             return 0;
//         }
        
        
//         for(int j=1; j<nums.length; j++){
//             int psum = 0;
//             for(int i = 0; i<j; i++){
//                 psum += nums[i];
//             }
//             if((double)psum == (double)((sum-nums[j])/2.0)){
//                 return j;
//             }
//         }
        
//         if( sum-nums[nums.length-1] == 0){
//             return nums.length-1;
//         }
        //return -1;
    }
}



//class Solution 
// {
//     public int pivotIndex(int[] nums)
//     {
//         if(nums.length==0)
//             return -1;
//         int n=nums.length;
//         int totalsum=0;
//         int leftsum=0;
//         for(int i:nums)
//             totalsum+=i;
//         for(int i=0;i<n;i++)
//         {
//              if(leftsum==(totalsum-nums[i]))
//                 return i;
//             else
//             {
//                 leftsum+=nums[i];
//                 totalsum-=nums[i]; //leftsum +, totalsum -
//             }
            
//         }
           
//     return -1;
//     }
// }
