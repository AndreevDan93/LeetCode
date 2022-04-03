class Solution {
    public String restoreString(String s, int[] indices) {
      char[] sArrey = s.toCharArray();
        char[] newCharArrey = new char[sArrey.length];
        for (int i = 0; i < indices.length; i++){
            newCharArrey[indices[i]] = sArrey[i];
            
        }
        String str = new String(newCharArrey);
        return str;
    }
}