class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // we have to find the frequency of all the numbers 
        // we have to sort the frequencies
        
        // find the frequency
        Map<Integer, Integer> frequencies = new HashMap<>();
        for (int n : nums) {
            if(frequencies.containsKey(n)) {
                frequencies.put(n, (frequencies.getOrDefault(n, 0) + 1));
            } else {
                frequencies.put(n, 1);
            }
        }
        //could use getOrDefault(key, default value)

        //sort the frequencies
        //hashmap is completely unordered so we will need another structure for this
        //backward bubble sort?
        PriorityQueue<Map.Entry<Integer, Integer>> priorityQueue = new PriorityQueue<>(
            (a, b) -> b.getValue() - a.getValue() // Comparator to order by highest frequency first
        );

        priorityQueue.addAll(frequencies.entrySet());

        int[] topKElements = new int[k];
        for (int i = 0; i < k && !priorityQueue.isEmpty(); i++) {
            Map.Entry<Integer, Integer> entry = priorityQueue.poll();
            topKElements[i] = entry.getKey();
        }

        return topKElements;




        
    }
}
