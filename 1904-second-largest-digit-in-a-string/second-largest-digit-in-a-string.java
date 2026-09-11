class Solution {
    public int secondHighest(String s) {
        int max = Integer.MIN_VALUE;
        int secondmax = Integer.MIN_VALUE;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                int num = s.charAt(i) - '0';
                if (num > max) {
                    secondmax = max;
                    max = num;
                } else if (num > secondmax && num != max) {
                    secondmax = num;
                }
            }
        }
        return secondmax == Integer.MIN_VALUE ? -1 : secondmax;
    }
}