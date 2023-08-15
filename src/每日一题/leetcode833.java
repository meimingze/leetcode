import java.util.ArrayList;
import java.util.List;

public class leetcode833 {
    public String findReplaceString(String s, int[] indices, String[] sources, String[] targets) {
        int n = s.length(), m = indices.length;

        List<Integer> ops = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            ops.add(i);
        }
        ops.sort((i, j) -> indices[i] - indices[j]);

        StringBuilder ans = new StringBuilder();
        int pt = 0;
        for (int i = 0; i < n;) {
            while (pt < m && indices[ops.get(pt)] < i) {
                pt++;
            }
            boolean succeed = false;
            while (pt < m && indices[ops.get(pt)] == i) {
                if (s.substring(i, Math.min(i + sources[ops.get(pt)].length(), n)).equals(sources[ops.get(pt)])) {
                    succeed = true;
                    break;
                }
                pt++;
            }
            if (succeed) {
                ans.append(targets[ops.get(pt)]);
                i += sources[ops.get(pt)].length();
            } else {
                ans.append(s.charAt(i));
                i++;
            }
        }
        return ans.toString();
    }
}
