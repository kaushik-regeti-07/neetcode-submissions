class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        for(int i=0;i<n-2;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }

            if(nums[i]>0){
                break;
            }

            int l = i+1;
            int r = n-1;
            while(l<r){
                int sum = nums[i] + nums[l] + nums[r];

            if(sum<0){
                l++;
            } else if(sum>0) {
                r--;
            } else {
                List<Integer> triplet = new ArrayList<>();
                triplet.add(nums[i]);
                triplet.add(nums[l]);
                triplet.add(nums[r]);
                result.add(triplet);
                l++;
                r--;

                while(l<r && nums[l]==nums[l-1]){
                    l++;
                }
                while(l<r && nums[r]==nums[r+1]){
                    r--;
                }
            }
        }
            }
        return result;
        
    }
}
