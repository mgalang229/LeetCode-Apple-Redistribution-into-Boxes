class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int sum = 0;
        for (int x : apple) {
            sum += x;
        }
        Arrays.sort(capacity);
        int cur = 0, ans = 0, n = capacity.length;
        for (int i = n - 1; i >= 0; i--) {
            cur += capacity[i];
            if (cur >= sum) {
                ans = n - i;
                break;
            }
        }
        return ans;
    }
}
