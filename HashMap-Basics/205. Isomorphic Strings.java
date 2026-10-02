class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character, Character> mapS = new HashMap<>();
        HashMap<Character, Character> mapT = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            char ch2 = t.charAt(i);
            if(mapS.containsKey(ch)){
               if(mapS.get(ch)!=ch2){
                return false;
               }
            }
            else{
                mapS.put(ch,ch2);
            }
            if(mapT.containsKey(ch2)){
                if(mapT.get(ch2)!=ch){
                    return false;
                }
            }
            else{
                mapT.put(ch2,ch);
            }
            
        }
        return true;
    }
}