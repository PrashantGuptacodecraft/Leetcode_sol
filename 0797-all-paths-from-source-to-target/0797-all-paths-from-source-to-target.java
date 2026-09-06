class Solution {
 static void solve(int[][] graph,int st,int n,List<Integer> ad,List<List<Integer>> ans){
        ad.add(st);
       if(n==st){
        ans.add(new ArrayList<>(ad));
       }
       else{
        for(int next:graph[st]){
            solve(graph,next,n,ad,ans);
        }
       }
       ad.remove(ad.size()-1);
    }
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        int n=graph.length-1;
    List<List<Integer>> ans=new ArrayList<>();
    List<Integer> ad=new ArrayList<>();

        solve(graph,0,n,ad,ans);
        return ans;
    }
}