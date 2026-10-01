class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Integer> map = new HashMap<>();
        int co=0;
        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                co = map.get(ch);
                co +=1;
                map.put(ch,co);
            }
            else{
            map.put(ch,1);
            }
        }
        int c1 = 0;
        for(int i =0;i<t.length();i++){
            char ch = t.charAt(i);
            if(map.containsKey(ch)){
                c1 = map.get(ch);
                c1-=1;
                map.put(ch,c1);
            }
            else{
                return false;
                }
        }
        for(int x : map.values()){
            if(x!=0){
                return false;
            }

        }
        return true;
    }
}