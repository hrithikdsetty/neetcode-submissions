class Solution {
    public int[] productExceptSelf(int[] nums) {

        int product = 1;
        int zeroCount = 0;

        for(int i:nums){
            if(i==0){
                zeroCount++;
            } else{
                product*=i;
            }
        }

        int [] res = new int [nums.length];

        if(zeroCount>1) return res;

        if(zeroCount==1){
            for(int i=0; i<nums.length; i++){
                if(nums[i]==0){
                    res[i] = product;
                }
            }
            return res;
        }

        for(int i=0; i<nums.length; i++){
            res[i] = product/nums[i];
        }

        return res;
        
    }
}  
