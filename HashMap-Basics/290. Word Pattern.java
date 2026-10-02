class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> mapPa = new HashMap<>();
        HashMap<String,Character> mapSa = new HashMap<>();
        String[] words = s.split(" ");
        if(words.length!=pattern.length()){return false;}
        for(int i=0;i<pattern.length();i++)
        { char ch = pattern.charAt(i);
          String sh = words[i];
          if(mapPa.containsKey(ch)){
            if(!mapPa.get(ch).equals(sh)){
                return false;
            }
          }
          else{
            mapPa.put(ch,sh);
          }
          if(mapSa.containsKey(sh)){
            if(mapSa.get(sh)!=ch){
                return false;
            }
         
          }
          else{
                mapSa.put(sh,ch);
            }
        }
        return true;
    }
}