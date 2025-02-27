class Solution {
    public int lengthOfLIS(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int max=1;
        int[] dp=new int[nums.length];
        Arrays.fill(dp,1);
        for(int i=1;i<nums.length;i++){
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j]){
                    int d=dp[j]+1;
                    dp[i]=Math.max(d,dp[i]);
                }
            }
            max=Math.max(dp[i],max);
        }
        return max;
    }
}