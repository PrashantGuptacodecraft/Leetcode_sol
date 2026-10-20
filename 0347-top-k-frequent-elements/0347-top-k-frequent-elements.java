class Solution {
    public class pair implements Comparable<pair>{
        int key;
        int count;
        pair(int key,int count){
            this.key=key;
            this.count=count;
        }
public int compareTo(pair p){
    return this.count -p.count;
}

    }
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
       
        PriorityQueue<pair> pq=new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                int fre=map.get(nums[i]);
                map.put(nums[i],fre+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        for(int ele:map.keySet()){
            int freq=map.get(ele);
            pq.add(new pair(ele,freq));
            while(pq.size()>k){
                pq.remove();
            }
        }
        int[] ans=new int[k];
        for(int i=0;i<k;i++){
            pair p=pq.remove();
            ans[i]=p.key;
        }
        return ans;
        
        
    }
}