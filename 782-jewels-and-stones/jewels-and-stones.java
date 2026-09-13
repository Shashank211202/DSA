class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        HashSet<Character> jset = new HashSet<>();
        for(char j : jewels.toCharArray()){
            jset.add(j);
        }
        for(char s : stones.toCharArray()){
            if(jset.contains(s)){
                count++;
            }
        }
        return count;
    }
}