class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> res = new HashSet<>();
        for(int i=0;i<nums1.length;i++){
             set.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            int value = nums2[i];
            if(set.contains(value)){
                
                    res.add(value);
                  
            }

        }
        int i =0;
        int[] answer = new int[res.size()];
        for(int x : res){
             answer[i] =x;
             i++;
            }
        return answer;
        
    }
}