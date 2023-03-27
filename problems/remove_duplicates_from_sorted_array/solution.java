class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    nums[j] = Integer.MAX_VALUE;
                } else if (nums[j] == Integer.MAX_VALUE) {
                    continue;
                } else {
                    count++;
                    nums[i+1] = nums[j];
                    break;
                }
            }
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

        return count;
    }
}