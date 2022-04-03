class Solution {
    public int numJewelsInStones(String jewels, String stones) {
             int jewelsStones = 0;
        char[] jewelsArrey = jewels.toCharArray();
        char[] stonesArrey = stones.toCharArray();

        for ( int i = 0; i < stonesArrey.length; i++){
            for (int j = 0; j < jewelsArrey.length; j++){
                if (stonesArrey[i] == jewelsArrey[j]) jewelsStones++;
            }
        }
         return jewelsStones;
     }
}   
