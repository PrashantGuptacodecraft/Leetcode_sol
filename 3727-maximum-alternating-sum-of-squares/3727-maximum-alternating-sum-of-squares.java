class Solution {
    public long maxAlternatingSum(int[] nums) {
        
        
        long n=nums.length;
        for(int i=0;i<n;i++){
            nums[i]=nums[i]*nums[i];
        }
        Arrays.sort(nums);
        long sum2=0;
        long sum=0;
        
            int m=(int)(n/2);
            for(int i=m;i<n;i++){
                sum+=nums[i];
            }
            for(int i=0;i<m;i++){
                sum2+=nums[i];
            }
        
        
        return sum- sum2;
    }
}