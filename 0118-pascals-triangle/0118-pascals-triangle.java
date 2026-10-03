class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> list =new ArrayList<>();
        int[][] dp=new int[30][30];
        for(int i=0;i<n;i++){
            List<Integer> a =new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){ a.add(dp[i][j]=1); }
else {a.add(dp[i][j]=dp[i-1][j-1]+dp[i-1][j]);
}
            }
            list.add(a);
        }
        return list;
    }
}