class Solution {
    public int[] leftRigthDifference(int[] nums) {
        int[] result = new int[nums.length];

       for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = 0; j < nums.length; j++) {
                if (j < i) {
                    sum += nums[j];
                } else if (j > i) {
                    sum -= nums[j];
                }
            }
            result[i] = Math.abs(sum);
        }
        return result;
    }
}