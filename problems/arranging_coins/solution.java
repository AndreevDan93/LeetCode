class Solution {
    public int arrangeCoins(int n) {    
        int k = 1;
        while (n >= k){
            n = n - k;
            k++;
        }
        int result = k - 1;
        return result;
    }
}
