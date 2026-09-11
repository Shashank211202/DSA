class Solution {
    public int lengthOfLastWord(String s) {
        int n = s.length() - 1;
        while(n >= 0){
            if(s.charAt(n) == ' '){
                n--;
                continue;
            }else{
                break;
            }
        }
        int count = 0;
        while(n >= 0){
            if(s.charAt(n) != ' '){
                n--;
                count++;
            }else{
                 break;
            }
        }
        return count;
    }
}