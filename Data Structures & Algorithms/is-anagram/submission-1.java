class Solution {
    public boolean isAnagram(String s, String t) {

        int n = s.length();
        int m = t.length();
        if (n != m) {
            return false;
        }
        int[] counts = new int[26];
        for (int i = 0; i < n; i++) {
            counts[s.charAt(i) - 'a']++;
            counts[t.charAt(i) - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (counts[i] != 0) {
                return false;
            }
        }

        return true;
    }
}