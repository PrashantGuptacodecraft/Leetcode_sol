class Solution {
    public int minMoves(int[] nums) {
        int n=nums.length;
        int max=0;
        for(int i=0;i<n;i++){
max=Math.max(nums[i],max);
        }
        int count=0;
        for(int i=0;i<n;i++){
            count+=max-nums[i];
        }
        return count;
        
    }
}