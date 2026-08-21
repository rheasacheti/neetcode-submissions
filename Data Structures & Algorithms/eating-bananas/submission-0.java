class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int min = 1;
        int max = Arrays.stream(piles).max().getAsInt();
        int k = 0;
        while (min <= max) {
            int mid = (min + max) / 2;
            int totalTime = 0;
            for (int pile: piles) {
                totalTime += Math.ceil(((double)pile / (double)mid));
            }
            if (totalTime <= h) {
                k = mid;
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }
        return k;
    }
}
