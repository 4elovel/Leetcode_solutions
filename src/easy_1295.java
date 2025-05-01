class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int tempCount=1;
            int tempNum = nums[i];
            while(tempNum > 9){
                tempNum /= 10;
                tempCount++;
            }
            if(tempCount %2==0) count++;
        }
        return count;
    }
}