class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        for(int i=1;i<n;i++){
            nums[i]+=nums[i-1];
        }
        int ans=-1;
        for(int i=0;i<n;i++){

            if( i>0 && nums[i-1]==nums[n-1]-nums[i]){
                ans=i;
                break;
            }
            else if( i==0 && nums[n-1]-nums[i]==0 || i==n-1 && nums[i-1]==0){
                ans=i;
                break;

            }
            
        }
        return ans;
        
    }
}