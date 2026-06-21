class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int l = 0;
        int r = 0;
        int max = 0;
        HashMap<Character,Integer> mp = new HashMap<>();
        while(r < n) {
            int pos = mp.getOrDefault(s.charAt(r), -1);
            // if char is a;ready present we will move the "l" ptr to next of that char and cal the length
            if(pos >= l) {
                l = pos + 1 ;
            }
            int len = r-l+1;
            max = Math.max(max,len);
            mp.put(s.charAt(r), r);
            r++;
        }
        return max;
    }
}