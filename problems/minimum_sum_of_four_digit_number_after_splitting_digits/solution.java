class Solution {
    public int minimumSum(int num) {
       int[] nums = new int[4];
        int zero = 0;
        int in = 0;
        while (num  > 0){
            if (num % 10 == 0){
                zero++;
            }
            nums[in] = num % 10;
            num = num / 10;
            in++;
        }
        Arrays.sort(nums);
        int a = 0;
        int b = 0;
        for (int i = zero; i < nums.length; i += 2){
            a = a * 10 + nums[i];
        }
        for (int i = zero + 1; i < nums.length; i += 2){
            b = b * 10 + nums[i];
        }
        return a + b;
    }
}