
// class Solution {
//     public int missingNumber(int[] nums) {
//         Arrays.sort(nums);
//         for(int i = 0; i<nums.length; i++){
//             if(nums[i] != i){
//                 return i;
//             }
//         }
//         return nums.length;
//     }
// }

class Solution {
     public int missingNumber(int[] nums) {
        int[] a = new int[nums.length+1];

        for(int i = 0; i<nums.length; i++){
            a[nums[i]] = -1;
        }
        for(int i = 0; i<nums.length; i++){
            if(a[i] != -1){
                return i;
            }
        }
        return nums.length;
     }
}



//hashset
// Set<Integer> set = new HashSet<>();
// for(int i = 0; i < nums.length; i++) set.add(nums[i]);   
// for(int i = 0; i <= nums.length; i++)
//     if(!set.contains(i)) return i;
// return -1;


//bit operation x⊕x=0  x⊕0=x
// int res = nums.length;
// for(int i = 0; i < nums.length; i++){
//     res ^= nums[i] ^ i;
// }
// return res;



//math sum
// int sum = 0;
// for(int i = 0; i < nums.length; i++){
//     sum += nums[i];
// }
// return nums.length * (nums.length + 1) / 2 - sum;
