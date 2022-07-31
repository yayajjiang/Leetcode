// class Solution {
    
//     public int helper(int a, int b,int c){
//         int min = Math.min(a,b);
//         int sec = 0;
//         sec+=min;
//         if(a==min){
//             b = b - a;
//             sec += Math.max(b,c);
//         }else{
//             a = a - b;
//             sec += Math.max(a,c);
//         }
//         return sec;
        
//     }
//     public int fillCups(int[] amount) {
//         int sec = 0;
//         int a = amount[0];
//         int b = amount[1];
//         int c = amount[2];
//         System.out.println(helper(a,b,c));
//         System.out.println(helper(a,c,b));

//         System.out.println(helper(b,c,a));

        
//         //return sec;
//         return Math.min(Math.max(helper(a,b,c),helper(a,c,b)),helper(b,c,a));
//     }
// }

class Solution {
    public int fillCups(int[] amount) {
        int a = amount[0];
        int b = amount[1];
        int c = amount[2];
        int min = 0;
        int max = Math.max(Math.max(b,c), a);
        if(a==max){
            min += a;
            if(b+c<=a)   return a;
            
            int diff = Math.abs(b-c);
            // System.out.println(min);
            // System.out.println(diff);
            // System.out.println(b-(a-diff)/2);
            // System.out.println(c-diff-(a-diff-(a-diff)/2));
            if(a>diff && c>=b)  min+=Math.max(b-(a-diff)/2, c-diff-(a-diff-(a-diff)/2));
            if(a>diff && b>c)  min+=Math.max(b-diff-(a-diff)/2, c-(a-diff-(a-diff)/2));

            // System.out.println(min);
            return min;
        }
        if(b == max){
            min += b;
            if(a+c<=b)   return b;
            
            int diff = Math.abs(a-c);
            
            if(b>diff && a>=c)  min+=Math.max(c-(b-diff)/2, a-diff-(b-diff-(b-diff)/2));
            if(b>diff && c>a)  min+=Math.max(c-diff-(b-diff)/2, a-(b-diff-(b-diff)/2));
            return min;
        }
        if(c == max){
            min += c;
            if(b+a<=c)   return c;
            
            int diff = Math.abs(b-a);
            if(c>diff && a>=b)  min+=Math.max(b-(c-diff)/2, a-diff-(c-diff-(c-diff)/2));
            if(c>diff && b>a)  min+=Math.max(b-diff-(c-diff)/2, a-(c-diff-(c-diff)/2));

            return min;
        }
        return -1;
    }
}
