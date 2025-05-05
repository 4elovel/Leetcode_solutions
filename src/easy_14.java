class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder prefix = new StringBuilder();
        boolean leaver = false;
        if (strs.length == 1) {
            return strs[0];
        }
        for (int i = 0; i < strs[0].length(); i++) {
            prefix.append(strs[0].charAt(i));
            for (int j = 0; j < strs.length; j++) {
                if( i>=strs[j].length()||strs[j].charAt(i) != prefix.charAt(i)) {
                    leaver = true;
                    break;
                }
            }
            if(leaver) {
                prefix = new StringBuilder(prefix.substring(0, prefix.length() - 1));
                break;
            }
        }
        return prefix.toString();
    }
}