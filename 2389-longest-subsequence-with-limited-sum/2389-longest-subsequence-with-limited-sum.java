class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=1;i<n;i++){
nums[i]+=nums[i-1];
        }
        int[] ans=new int[queries.length];
        for(int i=0;i<queries.length;i++){
            int low=0;
            int high=n-1;
            while(low<=high){
                int mid=low+(high-low)/2;
              
                if(nums[mid]>queries[i]){
                    high=mid-1;
                    
                }
                else{
                    ans[i]=Math.max(ans[i],mid+1);
                    low=mid+1;
                }
            }
        }
        return ans;
        
    }
}