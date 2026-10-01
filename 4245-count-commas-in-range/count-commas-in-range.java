class Solution {
    public int countCommas(int n) {

        if (n < 1000) {
            return 0;
        }

        int count = 0;

        for (int i = 1000; i <= n; i++) {

            int num = i;

            while (num >= 1000) {
                count++;
                num = num / 1000;
            }
        }

        return count;
    }
}