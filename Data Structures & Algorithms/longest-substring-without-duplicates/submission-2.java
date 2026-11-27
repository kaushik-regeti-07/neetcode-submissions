class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> w = new HashSet<>();
        int l=0;
        int best=0;

        for(int r=0;r<s.length();r++){
            char c = s.charAt(r);

            while(w.contains(c)){
                w.remove(s.charAt(l));
                l++;
            }

            w.add(c);
            int length = r-l+1;
            if(length>best){
                best=length;
            }
        }
        return best;
    }
}
