/**
 * @Author : yueqiao
 * @create 2024/11/20 23:23
 */
public class Solution3244 {

    // 在这个类中，我们使用 roads 数组来记录每个结点当前指向的下一个结点的编号。
    // 在 queries 中，我们会不断的执行结点的更新操作，于是我们可以来计算当前结点到最后一个结点的最短距离。
    // 在每次更新操作后，我们都会计算当前结点到最后一个结点的最短距离，并将其记录在 res 数组中。
    // 最后，我们将 res 数组作为结果返回。
    public int[] shortestDistanceAfterQueries(int n, int[][] queries) {
        int[] roads = new int[n];
        for (int i = 0; i < n; i++) {
            roads[i] = i + 1;
        }
        int[] res = new int[queries.length];
        int dist = n - 1;
        for (int i = 0; i < queries.length; i++) {
            int k = roads[queries[i][0]];
            roads[queries[i][0]] = queries[i][1];
            while (k != -1 && k < queries[i][1]) {
                int t = roads[k];
                roads[k] = -1;
                k = t;
                dist--;
            }
            res[i] = dist;
        }
        return res;
    }

}
