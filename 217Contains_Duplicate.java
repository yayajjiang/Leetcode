//set does not contain elements which are already in the set
class Solution {
    public boolean containsDuplicate(int[] nums) {
        // if(nums.length == 0){
        //     return false;
        // }
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int i = 0; i<nums.length; i++){
            int temp = hs.size();
            hs.add(nums[i]);
            //System.out.println(hs.size() +" " + temp);
            if(hs.size() == temp){
                return true;
            }
        }
        return false;
    }
}


// class Solution {
//     public boolean containsDuplicate(int[] nums) {
//         Set<Integer> set = new HashSet<>();
//         for (int a : nums) {
//             // If the element is already in the set, the set is unchanged and will return false.
//             if (!set.add(a)) {//directly returns
//                 return true;
//             }
//         }
//         return false;
//     }
// }

//sorting
//class Solution {
//     public boolean containsDuplicate(int[] nums) {
//         Arrays.sort(nums);
//         for(int i=0;i<nums.length-1;i++){
//             if(nums[i]==nums[i+1]){
//                 return true;
//             }
//         }
//           return false;
//     }
// }
