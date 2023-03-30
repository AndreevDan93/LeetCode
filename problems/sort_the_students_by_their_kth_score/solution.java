class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
       int[][] result = new int[score.length][score[0].length];
        SortedSet<Map.Entry<Integer, Integer>> sortedSet = new TreeSet<>((o1, o2) -> {
            return o2.getValue().compareTo(o1.getValue());
        });

        for (int i = 0; i < score.length; i++) {
            sortedSet.add(Map.entry(i, score[i][k]));
        }
        int count = 0;
        for (Map.Entry<Integer, Integer> entry: sortedSet) {
            result[count] = score[entry.getKey()];
            count++;
        }

        return result;
    }
}