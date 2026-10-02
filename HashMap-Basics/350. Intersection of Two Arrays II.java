class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> res = new ArrayList<>();
        
        for(int i=0;i<nums1.length;i++){
             int value = nums1[i];
             if(map.containsKey(value)){
                map.put(value,map.get(value)+1);
             }
              else{
                map.put(value,1);
            }
            }
        for(int i=0;i<nums2.length;i++){
            int value = nums2[i];
            if(map.containsKey(value)){
                if(map.get(value)>0){
                    res.add(value);
                    map.put(value, map.get(value)-1);
                }
            }
           
            }
        int[] answer = new int[res.size()];
        int i=0;
        for(int x : res){
            answer[i] =  x;
            i++;
        }
        return answer;
    }
}