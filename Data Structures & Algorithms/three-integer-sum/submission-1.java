class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res= new ArrayList<>();

        Arrays.sort(nums);

        int i=0, target=0, sum=0;
        while(i<nums.length-1 && nums[i]<=0){
            target  = nums[i];
            int j=i+1, k=nums.length-1;

            while(j<k){
                sum = -(nums[j]+nums[k]);
                if(sum<target){
                    k--;
                } else if(sum>target){
                    j++;
                } else{
                    res.add(List.of(nums[i],nums[j],nums[k]));
                    int temp = nums[j];
                    while(j<k && nums[j]==temp) j++;
                    k--;
                }
            }
            int temp2 = nums[i];
            while(i<nums.length && nums[i]==temp2) i++;
        }

        return res;
    }
}
