class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder newStr = new StringBuilder();
        for(char c : s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                newStr.append(Character.toLowerCase(c));
            }
        }
        String f = newStr.toString();
        String b = new StringBuilder(f).reverse().toString();
        return f.equals(b);
    }
}
