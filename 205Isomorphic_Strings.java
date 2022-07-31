import java.util.*; //for hash table

class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        Hashtable<Integer, Integer> ht = new Hashtable<Integer, Integer>();
        for (int i = 0; i<s.length(); i++){
            //System.out.println(ht.containsKey((int)s.charAt(i)));
            if(ht.containsKey((int)s.charAt(i))){
                //System.out.println(s.charAt(i));
                if(ht.get((int)s.charAt(i)) !=  (int)t.charAt(i)){
                    //System.out.println(ht.get(s.charAt(i)));
                    return false;
                }
                
            }else{
                if(ht.containsValue( (int)t.charAt(i))){
                    return false; //No two characters may map to the same character
                }
            }
            
            ht.put((int)s.charAt(i), (int)t.charAt(i));

            //System.out.println(ht);
        }
        return true;
    }
}
