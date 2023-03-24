class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }

        int maxElement = Integer.MAX_VALUE;
        boolean equals = true;
        int index = 0;

        for (String str : strs) {
            if (str.length() < maxElement) {
                if (str.length() == 0) {
                    return "";
                }
                maxElement = str.length();
            }
        }
        for (int i = 0; i < maxElement; i++) {
            for (int j = 0; j < strs.length - 1; j++) {
                equals = Objects.equals(strs[j].charAt(i), strs[j + 1].charAt(i));
                if (!equals) {
                    break;
                }
            }
            if (!equals) {
                break;
            } else {
                index++;
            }
        }

        return strs[0].substring(0, index);

    }
}