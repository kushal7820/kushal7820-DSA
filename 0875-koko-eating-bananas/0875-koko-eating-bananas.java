
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int ans = 0;
        int low = 1;
        int high = piles.length;

        for (int pile : piles) {
            high = Math.max(high, pile);
        }

        while (low <= high) {
            int mid = low + (high - low) / 2;
            long total = 0;

            for (int pile : piles) {
                total += (pile + (long)mid - 1) / mid;
            }

            if (total <= h) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }
}
