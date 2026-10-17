class Solution {
    public int minimumDistance(int[] nums) {
        int n=nums.length;
        int min=Integer.MAX_VALUE;
        int r=min;
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=j+1;k<n;k++){
                    if(nums[i]==nums[j] && nums[j]==nums[k]){
                        int ans=Math.abs(i-j)+Math.abs(k-j)+Math.abs(i-k);
                        min=Math.min(min,ans); 
                    }
                }
            }

        }

        if(min==r) return -1;
        return min;
    }
}