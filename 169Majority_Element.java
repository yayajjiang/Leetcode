class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int length = nums.length;
        int count = 1;
        int max = 0;
        int element = 0;
        if(length == 1){
            return nums[0];
        }
        for(int i = 0; i < length-1; i++){
            if(nums[i] == nums[i+1]){
                count++;
                //System.out.println(count );
                if(i == length - 2){
                    if(count > max && count > length/2){
                        max = count;
                        element = nums[i];
                    }
                }
            }else{
                //System.out.println(count + " " + max + " " + length/2);
                if(count > max && count > length/2){
                    max = count;
                    element = nums[i];
                }
                count = 1;
            }
        }
        return element;
    }
}

//moore
class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        Integer candidate = null;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        return candidate;
    }
}

author：LeetCode-Solution
link：https://leetcode.cn/problems/majority-element/solution/duo-shu-yuan-su-by-leetcode-solution/
