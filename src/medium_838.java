class Solution {
    public String pushDominoes(String dominoes) {
        String ans = "";
        int cnt = 0;
        String leftPivot = "";
        String rightPivot = "";
        //System.out.println(intervalHandler(3, "", "", 0));
        
        for (int i = 0; i < dominoes.length(); i++) {
            if (dominoes.charAt(i) == '.') {
                cnt++;
                if(i == dominoes.length() - 1) {
                    ans+= intervalHandler(cnt, leftPivot,rightPivot, i);
                }
            } else if (cnt != 0) {
                rightPivot += dominoes.charAt(i);
                ans += intervalHandler(cnt, leftPivot, rightPivot, i);
                cnt = 0;
                leftPivot = "" + rightPivot.charAt(rightPivot.length()-1);
                rightPivot = "";
            } else {
                ans += dominoes.charAt(i);
                leftPivot = "" + dominoes.charAt(i);
            }
        }
        return ans;
    }

    static String intervalHandler(int count, String leftPivot, String rightPivot, int i) {
        System.out.println(count + " lp: " + leftPivot + " rp: " + rightPivot + " i " + i);
        //System.out.println(leftPivot.length());
        if (leftPivot.length() == 0 || leftPivot.charAt(leftPivot.length()-1) == 'L') {
            if (rightPivot.length() == 0 || rightPivot.equals("R")) {
                return ".".repeat(count) + rightPivot;
            } else {
                return "L".repeat(count) + rightPivot;
            }
        } else {
            if (rightPivot.length() == 0 || rightPivot.equals("R")) {
                return "R".repeat(count) + rightPivot;
            } else {
                return "R".repeat(count/2) + (count % 2 == 1 ? "." : "") + "L".repeat(count/2) + rightPivot;
            }
        }
    }
    // LR....LR...R..L.R...
}