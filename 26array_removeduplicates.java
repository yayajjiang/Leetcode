//Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same.
//
//作者：力扣 (LeetCode)
//链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/x2gy9m/
//来源：力扣（LeetCode）
//著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
class Solution {
    public int removeDuplicates(int[] nums) {
        //use size to keep track of the position of the array
        int size = 1;
        int value = 0;
        for (int i = 0; i<nums.length-1; i++){
            if(nums[i] == nums[i+1]){
                value = nums[i];
            }else{
                nums[size] = nums[i+1]; //be careful about the index: i+1
                size++;
            }
        }
        return size;
    }
}

//双指针
//其实**双指针法在在数组和链表的操作中是非常常见的，很多考察数组和链表操作的面试题，都使用双指针法，可以将时间复杂度O(n^2)的解法优化为 O(n)的解法**
//keypoint: slowindex + fastindex
//class Solution {
//    public:
//    int removeDuplicates(vector<int>& nums) {
//        if (nums.empty()) return 0; // 别忘记空数组的判断,base case always
//        int slowIndex = 0;
//        for (int fastIndex = 0; fastIndex < (nums.size() - 1); fastIndex++){
//            if(nums[fastIndex] != nums[fastIndex + 1]) { // 发现和后一个不相同
//                nums[++slowIndex] = nums[fastIndex + 1]; //slowIndex = 0 的数据一定是不重复的，所以直接 ++slowIndex
//            }
//        }
//        return slowIndex + 1; //别忘了slowIndex是从0开始的，所以返回slowIndex + 1
//    }
//};
//

//有序数组

//快指针表示遍历数组到达的下标位置，慢指针表示下一个不同元素要填入的下标位置，初始时两个指针都指向下标 1
//1 - n-1, 依次遍历，return slowindex
//慢指针表示下一个不同元素要填入的下标位置，初始时两个指针都指向下标 1
// ++a increments a and returns that value, while a++ returns a's value and then increments a.
//https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/solution/kuai-man-zhi-zhen-26-shan-chu-you-xu-shu-8v6r/


//right 不断向下遍历，left，下一个不同的元素填入的下标位置
//https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/solution/yi-zhao-miao-sha-suo-you-tong-lei-xing-t-4a5x/