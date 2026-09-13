class Solution {
    public int maxFreqSum(String s) {
         int maxvowel = 0;
        int maxconsonant = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
       
        for(char ch : map.keySet()){
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                maxvowel = Math.max(maxvowel, map.get(ch));
            }else{
                maxconsonant = Math.max(maxconsonant, map.get(ch));
            }
        }
        return maxvowel + maxconsonant;
    }
}