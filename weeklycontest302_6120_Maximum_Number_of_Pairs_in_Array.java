class Solution {
    public int[] numberOfPairs(int[] nums) {
        
        int count = 0;
        int length = nums.length;
        if(length == 1) return new int[]{0,1};
        for(int i = 0; i < length ; i++){
            for(int j = i+1; j < length ; j++){
                if(nums[i] == nums[j] && nums[i] != -1 && nums[j] != -1){
                    count++;
                    nums[i] = nums[j] = -1;
                }   
            }
        }
        //for(int i : nums)   System.out.println(i);
        int[] arr = new int[2];
        arr[0] = count;
        arr[1] = length - 2 * count;
        return arr;
    }
}
