class Solution {
    public int smallestDivisor(int[] nums, int t) {
        int n=nums.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            max=Math.max(max,nums[i]);
        }
        int low=1;
        int high=max;
        int ans=0;
        while(low<=high){
            int mid=(low+high)/2;
            int sum=0;
            for(int i=0;i<n;i++){
                sum+=(nums[i]+mid-1)/mid;
            

            }
if(sum<=t){
    ans=mid;
    high=mid-1;

}
else{
    low=mid+1;

}

        }
        return ans;
        
    }
}