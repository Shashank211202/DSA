class Solution {
    public int removeDuplicates(int[] nums) {
        int x = 0;
        for(int num : nums){
            if(num > nums[x]){
                x++;
                nums[x] = num;
            }
        }
        return x + 1;
    }
}