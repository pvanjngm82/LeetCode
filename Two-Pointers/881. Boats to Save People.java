class Solution {
    public int numRescueBoats(int[] people, int limit) {

        Arrays.sort(people);
        int left = 0;
        int right = people.length-1;
        int co = 0;
        
        while(left<=right){
            int value = people[left] + people[right];
           if(value<=limit){
            co++;
            left++;
            right--;
           }
           else{
            right--;
            co++;
           }

            
        }
        return co;
        
    }
}