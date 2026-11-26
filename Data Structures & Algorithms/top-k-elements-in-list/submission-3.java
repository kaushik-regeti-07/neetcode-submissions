class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        for(int n : nums){
            if(count.containsKey(n)){
                count.put(n,count.get(n)+1);
            } else {
                count.put(n,1);
            }
        }
        List<Integer> unique = new ArrayList<>();
        for(int number : count.keySet()){
            unique.add(number);
        }
        unique.sort((a,b) -> Integer.compare(count.get(b),count.get(a)));

        int[] result = new int[k];
        for(int i=0;i<k;i++){
            result[i] = unique.get(i);
        }
        return result;
    }
}
