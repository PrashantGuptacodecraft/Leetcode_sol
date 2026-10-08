class Solution {
    public int maxSatisfied(int[] c, int[] g, int min) {
        int n=c.length;
        
        int sum=0;
        int sum1=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<min;i++){
            if(g[i]==0)sum+=c[i];
           if(g[i]==1) sum1+=c[i];

        }
        max=Math.max(max,sum1);
        for(int i=min;i<n;i++){
            if(g[i]==0)sum+=c[i];
            if(g[i]==1){
                sum1+=c[i];
            }
            if(g[i-min]==1){
                sum1-=c[i-min];
            }
            max=Math.max(max,sum1);

        }

        return max+sum;
        
    }
}