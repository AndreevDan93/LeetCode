class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        int[] sums = new int[accounts.length];
        
        
        for (int i = 0; i < accounts.length; i++){
                       
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++){
                sum = sum + accounts[i][j]; 
                sums[i] = sum;
            }
            
        }
        max = sums[0];
        for (int i = 0; i < sums.length; i++) {

                for (int j = i + 1; j < sums.length; j++) {
                    if (sums[i] < sums[j]) {
                        if (max < sums[j]) {
                            max = sums[j];
                        }
                    }
                }
            }
       
        return max;
        
    }
}