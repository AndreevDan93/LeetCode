class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];
        for (int i = 0; i < nums.length; i++){
            ans[i] = nums[i];
        }
        for (int i = nums.length ; i < ans.length; i++){
            ans[i] = nums[i - n];
        }
        return ans;
    }
}