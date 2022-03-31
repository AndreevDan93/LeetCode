class Solution {
    public int removeElement(int[] nums, int val) {
        int sumVal = 0;
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
            sumVal = sumVal + 1;
            }
        }

        for (int i = 0; i < nums.length - sumVal; i++) {
            while (nums[i] == val) {
                if (nums[nums.length - 1 - index] == val){
                    index = index + 1;
                }
                
                int current = nums[i];
                nums[i] = nums[nums.length - 1 - index];
                nums[nums.length - 1 - index] = current;
                index = index + 1;
            }
        }

   return nums.length - sumVal;
    }
}