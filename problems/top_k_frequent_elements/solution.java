class Solution {
    public int[] topKFrequent(int[] nums, int k) {
 Map<Integer, Integer> counter = new TreeMap<>();

        for (int num : nums) {
            counter.put(num, counter.getOrDefault(num, 0) + 1);
        }

        int[] result = new int[k];

        PriorityQueue<Map.Entry<Integer, Integer>> queue = new PriorityQueue<>(
                Comparator.comparingInt(Map.Entry::getValue)
        );
        for (Map.Entry<Integer, Integer> entry : counter.entrySet()) {
            queue.add(entry);
            if (queue.size() > k) queue.poll();
        }
        int i = k;
        while (!queue.isEmpty()) {
            result[--i] = queue.poll().getKey();
        }
        return result;
    }
}