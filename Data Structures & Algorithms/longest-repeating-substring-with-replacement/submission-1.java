class Solution {
    public int characterReplacement(String s, int k) {
        int[] count = new int[26];
        int l=0;
        int mf=0;
        int best=0;

        for(int r=0;r<s.length();r++){
            int i=s.charAt(r)-'A';
            count[i]++;
            if(count[i]>mf){
                mf=count[i];
            }

            while((r-l+1)-mf>k){
                count[s.charAt(l) - 'A']--;
            l++;
            
            mf = 0;
            for (int j = 0; j < 26; j++) {
                if (count[j] > mf) {
                    mf = count[j];
                }
            }
        }

        int length = r - l + 1;
        if (length > best) {
            best = length;
        }
    }
    return best;

            
        }
    
}
