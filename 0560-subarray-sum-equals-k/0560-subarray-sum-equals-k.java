class Solution {
    public int subarraySum(int[] arr, int k) {
        int n=arr.length;
        for(int i=1;i<n;i++){
            arr[i]+=arr[i-1];
        }
        int count=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){

            if(arr[i]==k) {
                count++;
            }
            int rem= arr[i]-k;
            if(map.containsKey(rem)){
                int fre=map.get(rem);
                count+=fre;
            }
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        return count;
        
    }
}