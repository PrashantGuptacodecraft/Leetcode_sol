class Solution {
    public int mirrorDistance(int n) {
        String st = Integer.toString(n); 
String reversed = new StringBuilder(st).reverse().toString();

int result = Integer.parseInt(reversed);
return Math.abs(n-result);

        
    }
}