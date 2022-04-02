class Solution {
    public int mostWordsFound(String[] sentences) {
    int[] spaces = new int[sentences.length];


        for (int i = 0; i < sentences.length; i++){
            int space = 0;
            for (char element : sentences[i].toCharArray()){
                if( element == ' '){
                    space++;
                }
                spaces[i] = space;
            }
        }
        int max = 0;
        for (int i = 0; i < spaces.length; i++) {
            if( max < spaces[i]){
                    max = spaces[i];

            }
        }
        return (max + 1);
    }
}