class Solution {
    public int countKDifference(int[] arr, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=arr.length;
        for(int i=0;i<n;i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        int count=0;
        for(int i=0;i<n;i++){
            int req1=arr[i]-k;
           int  req2=arr[i]+k;
            if(map.containsKey(req1)){
                int f=map.get(req1);
count=count+f;

            }
            if(map.containsKey(req2)){
                int g=map.get(req2);
                count=count+g;

            }

           map.put(arr[i],map.get(arr[i])-1);
           if(map.get(arr[i])==0){
            map.remove(arr[i]);
           }
        }

        return count;
        
    }
}