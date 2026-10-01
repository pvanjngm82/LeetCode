class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer> map = new HashMap<>();
        int []res = new int[2];
        for(int i =0;i<nums.length;i++ ){
            int needed = target - nums[i];
            if(map.containsKey(needed)){
                int j = map.get(needed);
                res[0]=j;
                res[1]=i;
                return res;
            }
            else{
                map.put(nums[i],i);
            }
        }
        return new int[0];

    }
    
}