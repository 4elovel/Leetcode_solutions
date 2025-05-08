class Solution {
    public int removeElement(int[] nums, int val) {
        if(nums.length==0) return 0;
        int j=nums.length-1;
        int cnt = 0;
        for(int i = 0;i<j;i++){
            if(nums[i]==val){
                while(true){
                    if(val!=nums[j]){
                        nums[i] = nums[i]^nums[j];
                        nums[j] = nums[i]^nums[j];
                        nums[i] = nums[i]^nums[j];
                        cnt++;
                        break;
                    }
                    j--;
                    if(i==j) break;
                }
            }else{
                cnt++;
            }
        }
        if(nums.length==1&&nums[0]!=val) cnt++;
        if(nums[nums.length-1]!=val) cnt++;
        return cnt;
    }
}