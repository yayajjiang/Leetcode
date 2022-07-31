//sort
class Solution {
    public int findRepeatNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i =0; i< nums.length-1; i++){
            if(nums[i]==nums[i+1]){
                return nums[i];
            }
        }
        return 0;
    }
}


//no duplication in the hashset
class Solution {
    public int findRepeatNumber(int[] nums) {
        Set<Integer> s = new HashSet<Integer>();
        for(int i =0; i< nums.length; i++){
            int count = s.size();
            s.add(nums[i]);
            if(s.size()==count){
                return nums[i];
            }
        }
        return 0;
    }
}

//pigeon hole principle
class Solution {
    public int findRepeatNumber(int[] nums) {
        for(int i = 0; i<nums.length; i++){
            while(i!=nums[i]){//while i!=nums[i], swapping constantly until they are same
                if(nums[i]==nums[nums[i]]){
                    return nums[i];
                }else{//swap
                    int temp = nums[i];
                    nums[i] = nums[nums[i]];
                    nums[temp] = temp;//be careful not to write nums[nums[i]]
                }
            }
            
        }
        return -1;
    }
}

//pigeon hole principle
//All the numbers in an array of length n are in the range 0 through N-1
//credit: https://github.com/zhedahht/CodingInterviewChinese2/blob/master/03_01_DuplicationInArray/FindDuplication.cpp
// bool duplicate(int numbers[], int length, int* duplication)
// {
//     if(numbers == nullptr || length <= 0)//edge case
//         return false;

//     for(int i = 0; i < length; ++i)
//     {
//         if(numbers[i] < 0 || numbers[i] > length - 1)//edge case
//             return false;
//     }

//     for(int i = 0; i < length; ++i)
//     {
//         while(numbers[i] != i)
//         {
//             if(numbers[i] == numbers[numbers[i]])
//             {
//                 *duplication = numbers[i];
//                 return true;
//             }

//             // 交换numbers[i]和numbers[numbers[i]]             
//             int temp = numbers[i];
//             numbers[i] = numbers[temp];
//             numbers[temp] = temp;
//         }
//     }

//     return false;
// }
