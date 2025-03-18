class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        for(int i = 0 ; i< nums.length ; i++){
            int fsum = 0;
            sum = sum + nums[i];
            sum = Math.max(sum, fsum);
        }
        return sum;
    }
}
