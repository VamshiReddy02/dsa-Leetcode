// brute force method

class Solution {
    public void sortColors(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[i]) {
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                }
            }
        }
    }
}


// Optimal solution

class Solution {
    public void sortColors(int[] nums) {
        int l = 0 ;
        int r = nums.length - 1;
        for(int i = 0; i<=r;){
            if(nums[i] == 0){
                swap(nums,i++,l++);
            }
            else if(nums[i]==1){
                i++;
            }
            else 
            swap(nums, i , r--);
        }
    }
    public static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}