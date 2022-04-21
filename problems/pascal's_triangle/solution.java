class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(Arrays.asList(1));
        if(numRows == 1){          
            return res;
        }
        for(int i=1; i<numRows; i++){
            ArrayList<Integer> arr = new ArrayList<>();
            for(int j=0; j<=i; j++){
                if(j==0 || j==i){
                    arr.add(1);
                }
                else{
                    int a = res.get(i-1).get(j-1);
                    int b = res.get(i-1).get(j);
                    arr.add(a + b);
                }
            }
            res.add(arr);
        }
        return res;
    }
}