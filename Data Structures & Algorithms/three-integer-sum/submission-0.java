class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(nums);

        for(int i=0; i<nums.length; i++){
            if (nums[i] > 0) break;
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int j=i+1;
            int k = nums.length-1;

            while(j<k){
                int temp = nums[j]+nums[k];

                if(temp==-(nums[i])) {
                    ans.add(List.of(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                    while (j < k && nums[j] == nums[j - 1]) {
                        j++;
                    }
                }
                else if(temp<-nums[i]) j++;
                else k--;
 
            }

        }

        return ans;

    }
}
