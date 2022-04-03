class Solution {
    public int[] decompressRLElist(int[] nums) {
       int newNumsLength = 0;
       for (int i = 0; i < nums.length; i = i + 2){
           newNumsLength = newNumsLength + nums[i];
       }
       int[] newNums = new int[newNumsLength];
        int k =0;
       for (int i = 0; i < nums.length; i += 2){
          for(int j = 0; j < nums[i]; j++){
              newNums[k] = nums[i + 1];
              k++;


           }
       }
        return newNums;  
    }
}