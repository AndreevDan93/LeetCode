class Solution {
    public int differenceOfSum(int[] nums) {
        int sum = 0;
        int numericSum = 0;

        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            sum += current;
            while (current != 0) {
                numericSum += current % 10;
                current /= 10;
            }
        }

        return Math.abs(sum - numericSum);
    }
}