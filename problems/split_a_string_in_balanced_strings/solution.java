class Solution {
    public int balancedStringSplit(String s) {
                int countR = 0;
        int countL = 0;
        int countSubString = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'R') {
                countR++;
            } else {
                countL++;
            }

            if (countL == countR) {
                countSubString++;
                countL = 0;
                countR = 0;
            }
        }

        return countSubString;
    }
}