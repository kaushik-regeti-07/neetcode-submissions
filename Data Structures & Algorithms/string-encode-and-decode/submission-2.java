class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String s : strs){
            sb.append(s.length());
            sb.append('#');
            sb.append(s);
        }
        return sb.toString();

    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
    int i = 0;                                   // where we are reading

    while (i < str.length()) {
        // 1. Read the label: move forward until we hit '#'
        int j = i;
        while (str.charAt(j) != '#') {
            j++;
        }
        int length = Integer.parseInt(str.substring(i, j));  // e.g. "4" → 4

        // 2. The word starts just after '#' and is 'length' characters long
        String word = str.substring(j + 1, j + 1 + length);
        result.add(word);

        // 3. Jump past this word to the next label
        i = j + 1 + length;
    }
    return result;
    }
}
