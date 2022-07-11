//bit manipulation
class Solution {
    public int singleNumber(int[] nums) {
        int answer = 0;
        for(int i : nums){
            answer ^= i;
        }
        return answer;
    }
}

//sort
class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
            while(i<nums.length-2){
                    if(nums[i] != nums[i+1]){
                        return nums[i];
                    }else{
                        i+=2;
                    }
                
            }
            return nums[nums.length-1];
        
    }
}



//set, no redundant
class Solution {
    public int singleNumber(int[] nums) {
        HashSet<Integer> hs = new HashSet<Integer>();
        int sum = 0;int sums = 0;
        for(int i : nums){
            hs.add(i);
            sum += i;
        }
        for(int i : hs) sums+=i;
        return 2 * sums - sum;
    }
}

