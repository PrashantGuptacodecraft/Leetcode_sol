class Solution {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length;
        int count=0;
        if(n==1 && n!=k){
            return 0;
        }
        for(int i=1;i<n;i++){
            nums[i]+=nums[i-1];
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
             if(nums[i]==k){count++;}
            int rem=nums[i]-k;
           
            
             if(map.containsKey(rem)){
                count+=map.get(rem);


            }
            if(map.containsKey(nums[i])){
               
                int freq=map.get(nums[i]);
                map.put(nums[i],freq+1);
            }
            else{
                map.put(nums[i],1);
            }

        }
        return count;
    }
}
