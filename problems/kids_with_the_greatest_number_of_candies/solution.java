class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
     int total;
        Boolean current=true;
        List<Boolean> kids=new ArrayList<Boolean>();
        
        for (int i = 0; i < candies.length; i++) {
            total =candies[i]+extraCandies;
            for (int j = 0; j < candies.length; j++) {   
                if (total<candies[j]) {
                    current=false;
                    break;
                }else{
                    current=true;
                } 
                
            }
            kids.add(current);
        }
        return kids;
    }
}