class Solution {
    public int romanToInt(String s) {
        String[] inputArray = s.split("");
        Map<String, Integer> romanMap = new HashMap<>();
        romanMap.put("I", 1);
        romanMap.put("V", 5);
        romanMap.put("X", 10);
        romanMap.put("L", 50);
        romanMap.put("C", 100);
        romanMap.put("D", 500);
        romanMap.put("M", 1000);
        int result = 0;

        for (int i = 0; i < inputArray.length - 1; i++) {
            if (romanMap.get(inputArray[i]) >= romanMap.get(inputArray[i + 1])) {
                result += romanMap.get(inputArray[i]);
            } else {
                result -= romanMap.get(inputArray[i]);
            }
        }

        result += romanMap.get(inputArray[inputArray.length - 1]);

        return result;

    }
}