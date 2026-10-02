class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int co=0;
        for(int i=0;i<nums.length;i++){
            int x = nums[i];
            if(map.containsKey(x)){
                co+=map.get(x);
                map.put(x,map.get(x)+1);
            }
            else{
                map.put(x,1);
            }
        }
        return co;

        
    }
}