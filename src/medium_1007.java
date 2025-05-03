class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        int rotations1 = check(tops[0], tops, bottoms);
        int rotations2 = check(bottoms[0], tops, bottoms);
        //System.out.println(rotations1+" "+rotations2);
        int minRot = rotations1<rotations2?rotations1:rotations2;
        return (minRot == Integer.MAX_VALUE) ? -1 : minRot;
    }
    private int check(int target, int[] tops, int[] bottoms) {
        int rotTop=0;
        int rotBot=0;
        for(int i = 0;i<tops.length;i++){
            //System.out.println(target+" "+bottoms[i]+" "+ tops[i]);
            //System.out.println((target!=bottoms[i])&&(target!=tops[i]));
            if(target != bottoms[i]&& target!=tops[i]) return Integer.MAX_VALUE;
            if(target != bottoms[i]) rotBot++;
            if(target != tops[i]) rotTop++;
        }
        return rotTop<rotBot?rotTop:rotBot;
    }
}