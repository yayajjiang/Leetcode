// class Solution {
//     public String decodeMessage(String key, String message) {
//         String[] alpha = [a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z];
//         HashMap<String, String> hs = new HashMap<String, String>();
//         for(int i = 0; i<key.length; i++){
//             if(!hs.answer.contains(key.charAt(i))){
//                 hs.put(key.charAt(i), alpha[i]);
//             }
            
//         }
//         for(int i = 0; i<message.length; i++){
//             if(message.charAt() == ' '){
//                 answer.add(' ');
//             }else{
                
                
//             }
//         }
//         return answer;
//     }
// }

class Solution {
    public String decodeMessage(String key, String message) {
        String[] alpha ={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        StringBuffer answer = new StringBuffer();
        LinkedHashSet<String> hs = new LinkedHashSet<String>();//hs stores the first 26 unique letters
        boolean flag = true;
        
        for(int i = 0; i<key.length(); i++){
            if(hs.size()==26){
                break;
            }
            if(key.charAt(i)==' ')    continue;
            hs.add(""+key.charAt(i));
            //System.out.println(hs);
        }
        for(int i = 0; i<message.length(); i++){
            //System.out.println(i);
            if(message.charAt(i) == ' '){
                answer.append(' ');
            }else{
                Iterator<String> it = hs.iterator();
                flag = true;
                String temp;
                while(flag){
                    
                    for(int j = 0; j< alpha.length; j++){
                        temp = it.next();
                        //System.out.println(temp);
                        //System.out.println(temp);
                        //System.out.println(message.charAt(i));
                        if(temp.equals("" + message.charAt(i)) ){
                            
                            answer.append(alpha[j]);
                            //System.out.println(j);
                            flag = false;
                            break;
                            
                        }
                        
                    }
                    
                }
                
            }
        }
        return answer.toString();
        
    }
}
