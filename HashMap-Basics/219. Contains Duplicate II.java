class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int old=0;
        int newy=0;
        for(int i =0;i<nums.length;i++){
                if(map.containsKey(nums[i])){
                  old = map.get(nums[i]);
                  if(i - old <=k){
                    return true;
                  }
                }
              
                  map.put(nums[i],i);
                
                
            }
            return false;
        
        
        
    }
}