class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int maxcandies = Integer.MIN_VALUE;
        for(int i = 0; i < candies.length; i++){
            if(candies[i] > maxcandies){
                maxcandies = candies[i];
            }
        }
        int newmaxcandy = 0;
        for(int i = 0; i < candies.length; i++){
             newmaxcandy = candies[i] + extraCandies;
             if(newmaxcandy >= maxcandies){
                result.add(true);
             }else{
                result.add(false);
             }
        }
        return result;
    }
}