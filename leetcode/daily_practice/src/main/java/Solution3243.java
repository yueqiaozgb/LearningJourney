import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @Author : yueqiao
 * @create 2024/11/19 23:07
 */
public class Solution3243 {

    public int[] shortestDistanceAfterQueries(int n, int[][] queries) {
        List<List<Integer>> routes = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            routes.add(new ArrayList<>());
        }
        int[] dp = new int[n];
        for (int i = 1; i < n; i++) {
            routes.get(i).add(i - 1);
            dp[i] = i;
        }
        int[] res = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            routes.get(queries[i][1]).add(queries[i][0]);
            for (int j = queries[i][0] + 1; j < n; j++) {
                for (Integer k : routes.get(j)) {
                    dp[j] = Math.min(dp[j], dp[k] + 1);
                }
            }
            res[i] = dp[n - 1];
        }
        return res;
    }

}
