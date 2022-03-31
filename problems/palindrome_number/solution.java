class Solution {
    public boolean isPalindrome(int x) {
        int inputX = x;
        int rev = 0;
        
        while(inputX != 0) {
            int rem = inputX % 10;
            rev = rev*10 + rem;
            inputX = inputX / 10;
        }
        if (x >= 0) {
        return x == rev;
        } else return false;
    }
}