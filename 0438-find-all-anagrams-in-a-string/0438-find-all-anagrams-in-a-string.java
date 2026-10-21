import java.util.*;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        int n1 = s.length();
        int n2 = p.length();

        List<Integer> list = new ArrayList<>();

        if (n2 > n1) {
            return list;
        }

        for (int i = 0; i < n2; i++) {
            map2.put(p.charAt(i),
                     map2.getOrDefault(p.charAt(i), 0) + 1);
        }

        int j = 0;

        for (int i = 0; i < n1; i++) {
            char ch = s.charAt(i);
            map1.put(ch, map1.getOrDefault(ch, 0) + 1);
            if (i - j + 1 > n2) {
                char removed = s.charAt(j);
                int count = map1.get(removed) - 1;

                if (count == 0) {
                    map1.remove(removed);
                } else {
                    map1.put(removed, count);
                }

                j++;
            }

            if (i - j + 1 == n2 && map1.equals(map2)) {
                list.add(j);
            }
        }

        return list;
    }
}