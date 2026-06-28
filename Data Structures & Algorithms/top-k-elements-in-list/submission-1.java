class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // frequency table
        // number -> frequency
        // 1 -> 1
        // 2 -> 2
        // 3 -> 3
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // bucket -> index == frequency
        // index:    0  1 2 3   4    5   6
        // bucekt: null 1 2 3 null null null
        List<Integer>[] buckets = new List[nums.length + 1];

        for (int num : map.keySet()) {
            int frequency = map.get(num);

            if (buckets[frequency] == null) {
                buckets[frequency] = new ArrayList<>();
            }

            buckets[frequency].add(num);
        }

        // collect top k
        int[] result = new int[k];
        int index = 0;

        // go from right to left
        for (int freq = buckets.length - 1; freq >= 0; freq--) {
            if (buckets[freq] != null) {
                for (int num : buckets[freq]) {
                    result[index] = num;
                    index++;

                    if (index == k) {
                        return result;
                    }
                }
            }
        }

        return result;
    }
}
