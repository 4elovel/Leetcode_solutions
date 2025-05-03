class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        int count1=0;
        int count2=0;
        for(int i=1;i<tops.length;i++){
            boolean state1 = tops[0] != tops[i] && tops[0] != bottoms[i];//counter1 is illegal
            boolean state2 = bottoms[0] != tops[i] && bottoms[0] != bottoms[i];//counter2 is illegal
            if(state1) count1=20001;
            if(state2) count2=20001;
            if(bottoms[i]==tops[0] && tops[i]==bottoms[0] && tops[i]!=bottoms[i]){
                count1++;
                count2++;
                continue;
            }
            if(bottoms[i]==tops[0]&&tops[i]!=tops[0]&& tops[i]!=bottoms[i]) {
                count1++;
                continue;
            }
            System.out.println("i: "+i+  " tops[i]: "+tops[i]+" bottoms[0]: "+bottoms[0]+" bottoms[i]: "+bottoms[i]+" bottoms[0]: "+bottoms[0]);
            System.out.println("cnt1: "+count1+ " cnt2: "+count2);
            if(tops[i]==bottoms[0]&&bottoms[i]!=bottoms[0]&& tops[i]!=bottoms[i]) {
                count2++;
                continue;
            }

    
        }
        System.out.println("cnt1: "+count1+ " cnt2: "+count2);
        if(count1>20000&&count2>20000) return -1;
        return count1>count2?count2:count1;
    }     
}