class Solution {
    public int minMoves(int[] nums) {
        int n=nums.length;
        int max=0;
       
        int count=0;
        for(int i=0;i<n;i++){
            count+=100-nums[i];
            max=Math.max(nums[i],max);
        }
        
        return count-n*(100-max);
        
    }
}