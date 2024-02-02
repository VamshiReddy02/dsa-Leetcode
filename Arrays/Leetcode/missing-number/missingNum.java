class Solution {
    public int missingNumber(int[] nums) {
        int l = nums.length;
        int sum = (l*(l+1))/2; 
        for(int i = 0; i<l ; i++){
            sum-=nums[i];
        }
        return sum;
    }
}