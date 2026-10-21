class Solution {
    public int minimumCardPickup(int[] arr) {
        int n=arr.length;
        if(n<=1) return-1;
        int min=n+1;
        Map<Integer,Integer> map= new HashMap<>();
for(int i=0;i<n;i++){
    if(map.containsKey(arr[i])){
        int diff=Math.abs(map.get(arr[i])-i)+1;
        if(diff>1){
            min=Math.min(min,diff);
        }

    }
 map.put(arr[i],i);
}
        if(min<=n) return min;
        return -1;


    }
}