class Solution {
    public String replaceSpace(String s) {
        int space = 0;
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == ' ' ){
                space++;
            }
        }
        if(space==0) return s;
        char[] c = new char[s.length()+2*space];
        int j = 0;
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) != ' ' ){
                c[j] = s.charAt(i);
                j++;
            }else{
                c[j++] = '%';
                c[j++] = '2';
                c[j++] = '0';

            }
        }
        s = String.valueOf(c);
        return s;
    }
}



//string buffer
class Solution {
    public String replaceSpace(String s) {
        StringBuffer temp = new StringBuffer(10);  //StringBuilder res = new StringBuilder("");(faster)
        for(int i = 0 ;i < s.length(); i++ ){
            if(s.charAt(i) ==' '){
                temp.append("%20");
            }
            else{
                temp.append(s.charAt(i));
            }

        }
       
        return temp.toString();
    }
}


