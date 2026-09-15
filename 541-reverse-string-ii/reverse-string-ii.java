class Solution {

    public String reverseStr(String s, int k) {

        char[] arr = s.toCharArray();

        for (int i = 0; i < s.length(); i += 2 * k) {

            // Number of characters to reverse
            int n = Math.min(k, s.length() - i);

            // Number of swaps required
            int mid = n / 2;

            for (int j = 0; j < mid; j++) {

                int left = i + j;
                int right = i + n - 1 - j;

                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }

        return new String(arr);
    }
}