class Solution {
    public int sumOfSquares(int[] nums) {
        int n = nums.length;
        int squaresum = 0;
        for(int i = 0; i < n; i++){
            if(n % (i + 1) == 0){
                squaresum += nums[i] * nums[i];
            }
        }
        return squaresum;
    }
}