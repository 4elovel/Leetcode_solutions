class Solution {
    public int searchInsert(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        for(int i =0;i<nums.length/2+1;i++){
            int center = (end-start+1)/2+start;
            if(nums[center]==target) return center;
            if(start>end) start=end;
            if(target>nums[center]&&start==end) return center+1;
            if(target<nums[center]&&start==end) return center;
            if(nums[center]>target){
                end = center-1>=0? center-1:center;
            }
            if(nums[center]<target){
                start = center+1<nums.length?center+1:center;
            }
        }
        return 0;
    }
}