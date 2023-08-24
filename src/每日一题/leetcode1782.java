package 每日一题;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @auther XMZ
 * @create 2023--23-上午9:47
 *
 * 这道题挺难的！！！
 */
public class leetcode1782 {
    public int[] countPairs(int n, int[][] edges, int[] queries) {
        int deg[] = new int[n];
        var cnt = new HashMap<Integer, Integer>();
        for(var e: edges){
            int x = e[0] - 1,y = e[1] - 1;
            if(x > y){
                int tmp = x;
                x = y;
                y = tmp;
            }
            deg[x]++;
            deg[y]++;
            cnt.put(x * n + y, cnt.getOrDefault(x * n + y, 0) + 1);
        }
        int arr[] = Arrays.copyOf(deg,n);
        int ans[] = new int[queries.length];
        for (int k = 0; k < queries.length; k++) {
            int bound = queries[k], total = 0;
            for (int i = 0; i < n; i++) {
                int j = binarySearch(arr, i + 1, n - 1, bound - arr[i]);
                total += n - j;
            }
            for (Map.Entry<Integer, Integer> entry : cnt.entrySet()) {
                int val = entry.getKey(), freq = entry.getValue();
                int x = val / n, y = val % n;
                if (deg[x] + deg[y] > bound && deg[x] + deg[y] - freq <= bound) {
                    total--;
                }
            }
            ans[k] = total;
        }
        return  ans;
    }
    public int binarySearch(int[] arr, int left, int right, int target) {
        int ans = right + 1;
        while (left <= right) {
            int mid = (left + right) >> 1;
            if (arr[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid - 1;
                ans = mid;
            }
        }
        return ans;
    }
}
