class Solution {
    public int sumOfUnique(int[] nums) {
        int sum=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int x = nums[i];
            if(map.containsKey(x)){
                map.put(x,map.get(x)+1);
            }
            else{
                map.put(x,1);
            }
        
            }
        for(int i=0;i<nums.length;i++){
            int x = nums[i];
            if(map.get(x)==1){
                sum += x;
            }
            }
            return sum;
            
    }
}