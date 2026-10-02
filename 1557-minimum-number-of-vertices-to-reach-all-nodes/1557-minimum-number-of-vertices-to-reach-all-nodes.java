class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        HashSet<Integer> set=new HashSet<>();
        
        for(List<Integer> l:edges){
            set.add(l.get(1));
        }
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(!set.contains(i)){
                ans.add(i);
            }


        }
        return ans;
    }
}