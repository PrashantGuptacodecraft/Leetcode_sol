class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int n=nums.length;
        HashSet<Integer> map=new HashSet<>();
        int i=0,j=0;
        int sum=0;
        int max=-1;
        if(n==1) return nums[0];
        while(i<n){
            if(map.contains(nums[i])){
                while(map.contains(nums[i])){
                    sum-=nums[j];
                    map.remove(nums[j]);
                    j++;
                }
                sum+=nums[i];
                max=Math.max(max,sum);
                map.add(nums[i]);
                i++;
            }
            else{
                map.add(nums[i]);
                sum+=nums[i];
                max=Math.max(max,sum);
                i++;
            }
        }
        return max;
    }
}