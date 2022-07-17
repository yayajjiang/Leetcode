import java.util.*;
class Solution {
    public int bitsum(int a){
        int sumbit = 0;
        while(a > 0){
            sumbit += a%10;
            a/=10;
        }
        return sumbit;
        
    }
    public int maximumSum(int[] nums) {
        //Hashset<Integer> hs = new HashSet<Integer>();
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        int[] a = new int[300];
        int sum = 0;
        for(int i : nums){
            hm.put(i, bitsum(i));
            a[bitsum(i)]++;
            int temp = a[bitsum(i) + 100];
            if( i > a[bitsum(i) + 100]){
                a[bitsum(i) + 100] = i;
                a[bitsum(i) + 200] = temp;

            }else if(i > a[bitsum(i) + 200]){
                a[bitsum(i) + 200] = i;
            }
            
            //hs.add(bitsum(i));
        }
        int max = 0;
        for(int i = 0; i<100; i++){
            //System.out.println(a[i] + " " + a[i+100] + " " + a[i+200]);
            if(a[i] >=2){
                if(a[100+i] + a[200+i] > max){
                    max = a[100+i] + a[200+i];
                }
            }
        }
        if(max == 0)    max = -1;
        return max;
        
        // for (int i : hm.values()) {
        //     System.out.println(i);
        // }
        
            // for (int i = 0; i < nums.length; i++){
            //     for (int j = i+1; j < nums.length; j++) {
            //         if(hm.get(nums[i]) == hm.get(nums[j])){
            //             if(nums[i] + nums[j] > sum){
            //                 sum = nums[i] + nums[j];
            //             }
            //         }
            //     }
            // }
        // if(sum == 0)    sum = -1;
        // return sum;
    }
}
