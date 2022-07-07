class Solution {
    public boolean isPalindrome(int x) {
        if(x<0 || x%10==0){
            return false;
        }
        if(x<10){
            return true;
        }
        // if(x%11 != 0){
        //     return false;
        // }
        int copy = x;
        int reverse = x%10;
        x=x/10;
        while (x > 0){
            reverse*=10;
            reverse += x%10;
            x=x/10;
            //System.out.println(reverse);
        }
        if(reverse == copy) return true;    //may have the problem of overflow, eg:23050847
        return false;
    }
}


//         while (x > revertedNumber) {
//             revertedNumber = revertedNumber * 10 + x % 10;
//             x /= 10;
//         }
//to save half of the time, only compare half of the digit, since it is of the same order//even digits vs odd digits
//         return x == revertedNumber || x == revertedNumber / 10;


// reverse api, 
// public static boolean isPalindrome(int x) {
//         if (x < 0) {
//             return false;
//         }
//         StringBuffer sb = new StringBuffer(String.valueOf(x));
//         StringBuffer re = sb.reverse();
//         if (re.toString().equals(String.valueOf(x))) {
//             return true;
//         }
//         return false;
//     }

//also stringbuilder reverse
//class Solution {
//     public boolean isPalindrome(int x) {
//         String reversedStr = (new StringBuilder(x + "")).reverse().toString();
//         return (x + "").equals(reversedStr);
//     }
// }
////link：https://leetcode.cn/problems/palindrome-number/solution/dong-hua-hui-wen-shu-de-san-chong-jie-fa-fa-jie-ch/


//char
// String sx = Integer.toString(x);
//         int start = 0;
//         int end = sx.length() - 1;
//         while (start < end) {
//             if (sx.charAt(start) != sx.charAt(end)) {
//                 return false;
//             }
//             start++;
//             end--;
//         }
//         return true;
//author：alexhilton
//link：https://leetcode.cn/problems/palindrome-number/solution/by-alexhilton-t0ei/




//class Solution {
//     public boolean isPalindrome(int x) {
//         //edge cases
//         if (x < 0) return false;
//         int div = 1;
//         //
//         while (x / div >= 10) div *= 10;
//         while (x > 0) {
//             int left = x / div;
//             int right = x % 10;
//             if (left != right) return false;
//             x = (x % div) / 10;
//             div /= 100;
//         }
//         return true;
//     }
// }

// author：cxywushixiong
// link：https://leetcode.cn/problems/palindrome-number/solution/dong-hua-hui-wen-shu-de-san-chong-jie-fa-fa-jie-ch/

//compare the digits one by one
//length = int(math.log(x,10))
//             while x != 0:
//                 if int(x/(10 ** length)) == x %10:
//                     x %= 10**length
//                     x = int(x/10)
//                     length -=2;
//                 else:
//                     return False
