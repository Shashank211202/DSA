
class Solution {
    public int mostWordsFound(String[] sentences) {
        int space = 0;
        int maxspace = 0;

        for (int i = 0; i < sentences.length; i++) {
            space = 0;

            for (int j = 0; j < sentences[i].length(); j++) {
                if (sentences[i].charAt(j) == ' ') {
                    space++;
                }
            }

            maxspace = Math.max(space, maxspace);
        }

        return maxspace + 1;
    }
}
