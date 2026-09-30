class Solution {
    
        
    public int[] sortedSquares(int[] nums) {
        int n = nums.length -1;
        int left = 0, right = n;
        int[] res = new int[nums.length];
        for(int i = n; i>=0 ; i--){
            int v = Math.abs(nums[left]);
            int q = Math.abs(nums[right]);
            if(v > q){
                res[i] = v * v;
                left++;
               
            }
            else{
                res[i] = q * q;
                right--;
            }
        }
        return res;
    }
    }
