class Solution {
    public String longestCommonPrefix(String[] strs) {
        //base case, return directly
        if(strs.length == 0){
            return "";
        }
        if(strs.length == 1){
            return strs[0];
        }
        //find the least length, name it min
        int min = strs[0].length();
        String ans = "";
        for(int i=0; i<strs.length; i++){
            if(min>strs[i].length()){
                min = strs[i].length(); //get the minimum length
            }
        }
        //use nested for loop for comparisons
        //use a flag to keep track of the state, if not find, break in advance, else append the character
        for(int j=0; j<min; j++){
            boolean flag = true;
            char c = strs[0].charAt(j);
            for (int i=0; i<strs.length; i++){
                if(strs[i].charAt(j)  != c){
                    flag = false;
                    break;
                }
            }
            if(flag){
                ans += strs[0].charAt(j);
            }else{
                break;
            }

        }
        return ans;
    }
}