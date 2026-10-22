class Solution {
    public int scoreOfString(String s) {
        int score = 0;
        for(int i = 0; i < s.length() - 1; i++){
            int ascii1 = s.charAt(i);            
            int ascii2 = s.charAt(i + 1);            
            score += Math.abs(ascii1 - ascii2);
        }
        return score;
    }
}