class Solution {
    public boolean matches(int[] freq, int[] freq1) {
        for (int i = 0; i < 26; i++) {
            if (freq[i] != freq1[i]) {
                return false;
            }
        }
        return true;
    }

    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;

        int[] freq = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i) - 'a']++;
        }

        int windsize = s1.length();
        for (int i = 0; i <= s2.length() - windsize; i++) {
            int[] wind = new int[26];
            for (int j = 0; j < windsize; j++) {
                wind[s2.charAt(i + j) - 'a']++;
            }
            if (matches(freq, wind)) {
                return true;
            }
        }

        return false;
    }
}
