class Solution {
    public int secondHighest(String s) {
        int max = -1;
        int secondmax = -1;
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
        return secondmax;
    }
}