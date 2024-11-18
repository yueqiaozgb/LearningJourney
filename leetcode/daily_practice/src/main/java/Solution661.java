import java.util.ArrayList;
import java.util.List;

/**
 * @Author : yueqiao
 * @create 2024/11/18 22:42
 */
public class Solution661 {

    public int[][] imageSmoother(int[][] img) {
        int n = img.length, m = img[0].length;
        int[][] ans = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                List<Integer[]> smooth = getSmooth(n, m, i, j);
                int sum = 0;
                for (Integer[] integer : smooth) {
                    sum += img[integer[0]][integer[1]];
                }
                // 向下取整
                ans[i][j] = sum / smooth.size();
            }
        }
        return ans;
    }

    public List<Integer[]> getSmooth(int n, int m, int i, int j) {
        List<Integer[]> ans = new ArrayList<>();
        // 1.将自身位置加入数组
        ans.add(new Integer[]{i, j});
        // 2.将上方加入数组
        if (i - 1 >= 0) {
            ans.add(new Integer[]{i - 1, j});
        }
        // 3.将下方加入数组
        if (i + 1 < n) {
            ans.add(new Integer[]{i + 1, j});
        }
        // 4.将左方加入数组
        if (j - 1 >= 0) {
            ans.add(new Integer[]{i, j - 1});
        }
        // 5.将右方加入数组
        if (j + 1 < m) {
            ans.add(new Integer[]{i, j + 1});
        }
        // 6.将上方左方加入数组
        if (i - 1 >= 0 && j - 1 >= 0) {
            ans.add(new Integer[]{i - 1, j - 1});
        }
        // 7.将上方右方加入数组
        if (i - 1 >= 0 && j + 1 < m) {
            ans.add(new Integer[]{i - 1, j + 1});
        }
        // 8.将下方左方加入数组
        if (i + 1 < n && j - 1 >= 0) {
            ans.add(new Integer[]{i + 1, j - 1});
        }
        // 9.将下方右方加入数组
        if (i + 1 < n && j + 1 < m) {
            ans.add(new Integer[]{i + 1, j + 1});
        }
        return ans;
    }

}
