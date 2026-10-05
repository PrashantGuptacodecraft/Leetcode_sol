import java.util.*;

class Solution {
    public int[][] merge(int[][] arr) {
        int n = arr.length;

        if (n == 0) {
            return new int[0][0];
        }

        Arrays.sort(arr, (x, y) -> Integer.compare(x[0], y[0]));

        int[][] ans = new int[n][2];
        int f = 0;
        int i = 0;

        while (i < n){
            int a = arr[i][0];
            int b = arr[i][1];

            int j = i + 1;

            
            while (j < n && b >= arr[j][0]) {
                b = Math.max(b, arr[j][1]);
                j++;
            }

            
            ans[f][0] = a;
            ans[f][1] = b;
            f++;

            i = j;
        }

        return Arrays.copyOf(ans, f);
    }
}