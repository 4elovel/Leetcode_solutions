import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
class Solution {
    public int singleNumber(int[] nums) {
        var bufArr = new ArrayList<Integer>(Arrays.stream(nums).boxed().toList());
        bufArr.sort(Integer::compareTo);
        var buf = bufArr.get(0);
        if (bufArr.size() == 1) {
            return buf;
        }
        if (!Objects.equals(buf, bufArr.get(1))) {
            return buf;
        }
        var leaver = true;
        System.out.println();
        for (var i : bufArr) {
            if (!Objects.equals(buf, i)) {
                if (!leaver) {
                    return buf;
                }
                buf = i;
                leaver = false;
                continue;
            }
            leaver = true;
        }
        return buf;
    }
}