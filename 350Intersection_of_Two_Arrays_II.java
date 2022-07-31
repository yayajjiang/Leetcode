import java.util.*;
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> a = new LinkedList<Integer>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i = 0; int j = 0;
        //System.out.println(nums1.length + " " + nums2.length);
        while( i < nums1.length && j < nums2.length){
            if(nums1[i] == nums2[j]){
                //System.out.println(i + " " + j);
                a.add(nums1[i]);
                i++; j++;
            }else if(nums1[i] < nums2[j]){
                i++;
            }else{
                j++;
            }
        }
        int[] arr = new int[a.size()];
 
        // Converting ArrayList to Array
        // using get() method
        for (int k = 0; k < a.size(); k++)
            arr[k] = a.get(k);
        return arr;
    }
}
