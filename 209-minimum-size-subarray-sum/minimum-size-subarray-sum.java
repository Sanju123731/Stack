class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minL=Integer.MAX_VALUE;
        int sum=0;
        int start=0;
        int currL=0; 
        for(int i=0;i<nums.length;i++)
        {
           sum+=nums[i];
           currL++;
           while(sum>=target)
           {
            minL=Math.min(minL,currL);
            sum-=nums[start];
            start++;
            currL--;
           }
        }
    if(minL==Integer.MAX_VALUE) return 0;
    else return minL;
    }
}