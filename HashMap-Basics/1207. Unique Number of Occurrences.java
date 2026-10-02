class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            int c = arr[i];
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }
            else{
                map.put(c,1);
            }
        }
       for(int x : map.values()){
         if(set.contains(x)){
            return false;
         }
         else{
            set.add(x);
         }
       }
       return true;
    }
}