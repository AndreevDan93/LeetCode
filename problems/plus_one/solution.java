class Solution {
    public int[] plusOne(int[] digits) {
        byte k = 0;
        for (int i = digits.length - 1; i >= 0; i--){
            if (digits[i] == 9) k++;
            else break;
        }
        byte size = 0;
        if (k == digits.length) size++;
        int[] digits1 = new int[digits.length + size];
        if (k == digits.length) {
            digits1[0] = 1;
        } else{
            for (int i = 0; i < digits1.length; i++){
                if (i < digits1.length - 1 - k ) digits1[i] = digits[i];
                else if(digits1.length - 1 - k == i) digits1[i] = digits[i] + 1;
                else digits1[i] = 0;
            }
        }
    return digits1;
    }
}