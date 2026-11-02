class Solution {
    public boolean isHappy(int n) {
        int sum=0;
        int r=n;
        Boolean tr=true;
    HashSet<Integer> map=new HashSet<>();
        while(sum!=1){
         sum=0;
            while(r>0){
            int c=r%10;
            sum+=c*c;
            r=r/10;
            }
            r=sum;
            if(sum==1){
                tr= true;
                break;
            }
            if(map.contains(sum)){
                tr= false;
                break;
            }
            else{
            map.add(sum);}
        }
            
           
        if(tr){
            return true;
        }
        else
        return false;
    }
}