class Solution {
    public boolean isPalindrome(String s) {
       StringBuilder stringBuilder = new StringBuilder();
        char[] chars = s.toCharArray();
        for (char ch: chars) {
            if (Character.isLetter(ch)) {
                stringBuilder.append(Character.toLowerCase(ch));
            } else if (Character.isDigit(ch)) {
                stringBuilder.append(ch);
            }
        }
        String clearS = stringBuilder.toString();
        String reversS = stringBuilder.reverse().toString();
        return clearS.equals(reversS);
    }
}