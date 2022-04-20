class Solution {
    public int climbStairs(int n) {
        int[] array = new int[n];
        array[0] = 1;
        for (int i = 0; i < n; i++) {
            if (i == 0) array[i] = 1;
            else if (i == 1) array[i] = 2;
            else array[i] = array[i - 1] + array[i - 2];

        }
        return array[n-1];
    }
}