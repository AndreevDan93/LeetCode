class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] xes = new int[2 *n];
        int[] yes = new int[2 *n];
       for (int i = 0; i < nums.length; i++) {
            if (i < n) {
                xes[2 * i] = nums[i];
            } else {
                yes[2 * (i - n)] = nums[i];
            }
        }
        for (int i = 0; i < nums.length; i = i + 2) {
            nums[i] = xes[i];
            nums[i + 1] = yes[i];
        }
            
                     
                
            
        
        return nums;
    }
}