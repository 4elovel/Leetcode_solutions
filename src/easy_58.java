class Solution {
    public int lengthOfLastWord(String s) {

        int idxStart = 0;
        int idxEnd=0;
        for(int i = s.length()-1;i>=0;i--){
            if(s.charAt(i)==' ') continue;
            if(idxEnd!=0){
                if(i-1<=0){
                idxStart=i-1;
                if(!s.startsWith(" ")) idxEnd++;
                break;
                }
                if(s.charAt(i-1)==' '){
                idxStart=i-1;
                break;
                }
                continue;
            }
            if(i-1==-1) return 1;
            idxEnd = i;
            if(s.charAt(i-1)== ' ')return 1;
        }
        return idxEnd-idxStart;
    }

}