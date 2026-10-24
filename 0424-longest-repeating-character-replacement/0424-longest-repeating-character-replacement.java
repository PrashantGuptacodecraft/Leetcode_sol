
class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int j = 0;
        int max = 0;
        int ans = 0;

        int[] fq = new int[26];

        for (int i = 0; i < n; i++) {
            fq[s.charAt(i) - 'A']++;
            max = Math.max(max, fq[s.charAt(i) - 'A']);

            int size = i - j + 1;

            if (size - max > k) {
                fq[s.charAt(j) - 'A']--;
                j++;
            }

            ans = Math.max(ans, i - j + 1);
        }

        return ans;
    }
}
