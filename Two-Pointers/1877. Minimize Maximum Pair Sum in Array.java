class Solution {

    public int minPairSum(int[] nums) {
        int n = nums.length;
         int left = 0;
        int right = n-1;
        Arrays.sort(nums);
    
        int max = nums[right];
        while(left < right){
            int value = nums[left] + nums[right];
            if(value>max){max=value;}
            left++;
            right--; 
        }
        return max;
        
    }
}