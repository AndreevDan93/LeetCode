class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
              List<List<String>> result = new ArrayList<>();

        if (strs.length == 0) {
            return result;
        } else if (strs.length == 1) {
            List<String> list = new ArrayList<>();
            list.add(strs[0]);
            result.add(list);
            return result;
        }

        Map<String, List<String>> anagaramMap = new HashMap<>();
        for (String str : strs) {
            String s = sortedAnagram(str);
            List<String> list;
            if (!anagaramMap.containsKey(s)) {
                list = new ArrayList<>();
            } else {
                list = anagaramMap.get(s);
            }
            list.add(str);
            anagaramMap.put(s, list);
        }

        for (Map.Entry<String, List<String>> entry : anagaramMap.entrySet()) {
            result.add(entry.getValue());
        }


        return result;
    }
     private static String sortedAnagram(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}