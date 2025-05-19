class Solution {
    public void sortColors(int[] nums) {
        int cnt0=0;
        int cnt1=0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]==0)cnt0++;
            if(nums[i]==1)cnt1++;
        }
        for(int i = 0;i<nums.length;i++){
            if(i<cnt0)nums[i]=0;
            else if(i<cnt0+cnt1)nums[i]=1;
            else{
                nums[i]=2;
            }
            
        }
    }
}