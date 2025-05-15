class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        var ans = new ArrayList<String>();
        for(int i=1;i<words.length;i++){
            if(groups[i-1]!=groups[i]){
                ans.add(words[i-1]);
            }
        }
        ans.add(words[words.length-1]);
        return ans;
    }
}