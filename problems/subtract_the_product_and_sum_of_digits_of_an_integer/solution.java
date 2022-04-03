class Solution {
    public int subtractProductAndSum(int n) {
              int longOfN = 0;
        int n1 = n;
        while(n1  != 0){
            n1 = n1 / 10;
            longOfN++;
        }
        int[] nArr = new int[longOfN];
        for (int i = longOfN - 1; i >= 0; i--){
            nArr[i] = n % 10;
            n = n / 10;
        }
        int product = 1;
        for (int i = 0; i < nArr.length; i++ ){
            product = product * nArr[i];
        }
        int sum = 0;
        for (int i = 0; i < nArr.length; i++ ){
            sum = sum + nArr[i];
        }
        int result = product - sum;
        return result;
        
    }
}